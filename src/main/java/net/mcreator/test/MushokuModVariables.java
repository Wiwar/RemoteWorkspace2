package net.mcreator.test;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class MushokuModVariables {
	public MushokuModVariables(MushokuModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "mushoku_worldvars";
		public String tmpInputList = "";

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			tmpInputList = nbt.getString("tmpInputList");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putString("tmpInputList", tmpInputList);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "mushoku_mapvars";

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("mushoku", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putDouble("MaxMana", instance.MaxMana);
			nbt.putBoolean("WaterMagic", instance.WaterMagic);
			nbt.putBoolean("FireMagic", instance.FireMagic);
			nbt.putBoolean("EarthMagic", instance.EarthMagic);
			nbt.putBoolean("WindMagic", instance.WindMagic);
			nbt.putDouble("Mana", instance.Mana);
			nbt.putString("ChantSpell", instance.ChantSpell);
			nbt.putString("Swordsman", instance.Swordsman);
			nbt.putString("StyleAffinity", instance.StyleAffinity);
			nbt.putDouble("TechniqueSP", instance.TechniqueSP);
			nbt.putString("SkillOne", instance.SkillOne);
			nbt.putString("SkillTwo", instance.SkillTwo);
			nbt.putString("SkillThree", instance.SkillThree);
			nbt.putBoolean("ArmChop", instance.ArmChop);
			nbt.putBoolean("QuickStrikes", instance.QuickStrikes);
			nbt.putDouble("ToukiLevel", instance.ToukiLevel);
			nbt.putBoolean("LsOS", instance.LsOS);
			nbt.putBoolean("SGBeginner", instance.SGBeginner);
			nbt.putBoolean("WGBeginner", instance.WGBeginner);
			nbt.putBoolean("NGBeginner", instance.NGBeginner);
			nbt.putBoolean("Deflect", instance.Deflect);
			nbt.putBoolean("WGFlow", instance.WGFlow);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.MaxMana = nbt.getDouble("MaxMana");
			instance.WaterMagic = nbt.getBoolean("WaterMagic");
			instance.FireMagic = nbt.getBoolean("FireMagic");
			instance.EarthMagic = nbt.getBoolean("EarthMagic");
			instance.WindMagic = nbt.getBoolean("WindMagic");
			instance.Mana = nbt.getDouble("Mana");
			instance.ChantSpell = nbt.getString("ChantSpell");
			instance.Swordsman = nbt.getString("Swordsman");
			instance.StyleAffinity = nbt.getString("StyleAffinity");
			instance.TechniqueSP = nbt.getDouble("TechniqueSP");
			instance.SkillOne = nbt.getString("SkillOne");
			instance.SkillTwo = nbt.getString("SkillTwo");
			instance.SkillThree = nbt.getString("SkillThree");
			instance.ArmChop = nbt.getBoolean("ArmChop");
			instance.QuickStrikes = nbt.getBoolean("QuickStrikes");
			instance.ToukiLevel = nbt.getDouble("ToukiLevel");
			instance.LsOS = nbt.getBoolean("LsOS");
			instance.SGBeginner = nbt.getBoolean("SGBeginner");
			instance.WGBeginner = nbt.getBoolean("WGBeginner");
			instance.NGBeginner = nbt.getBoolean("NGBeginner");
			instance.Deflect = nbt.getBoolean("Deflect");
			instance.WGFlow = nbt.getBoolean("WGFlow");
		}
	}

	public static class PlayerVariables {
		public double MaxMana = 100.0;
		public boolean WaterMagic = false;
		public boolean FireMagic = false;
		public boolean EarthMagic = false;
		public boolean WindMagic = false;
		public double Mana = 100.0;
		public String ChantSpell = "\"\"";
		public String Swordsman = "None";
		public String StyleAffinity = "\"\"";
		public double TechniqueSP = 0;
		public String SkillOne = "\"\"";
		public String SkillTwo = "\"\"";
		public String SkillThree = "\"\"";
		public boolean ArmChop = false;
		public boolean QuickStrikes = false;
		public double ToukiLevel = 0;
		public boolean LsOS = false;
		public boolean SGBeginner = false;
		public boolean WGBeginner = false;
		public boolean NGBeginner = false;
		public boolean Deflect = false;
		public boolean WGFlow = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				MushokuMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.MaxMana = original.MaxMana;
		clone.WaterMagic = original.WaterMagic;
		clone.FireMagic = original.FireMagic;
		clone.EarthMagic = original.EarthMagic;
		clone.WindMagic = original.WindMagic;
		clone.Mana = original.Mana;
		clone.ChantSpell = original.ChantSpell;
		clone.Swordsman = original.Swordsman;
		clone.StyleAffinity = original.StyleAffinity;
		clone.TechniqueSP = original.TechniqueSP;
		clone.SkillOne = original.SkillOne;
		clone.SkillTwo = original.SkillTwo;
		clone.SkillThree = original.SkillThree;
		clone.ArmChop = original.ArmChop;
		clone.QuickStrikes = original.QuickStrikes;
		clone.ToukiLevel = original.ToukiLevel;
		clone.LsOS = original.LsOS;
		clone.SGBeginner = original.SGBeginner;
		clone.WGBeginner = original.WGBeginner;
		clone.NGBeginner = original.NGBeginner;
		clone.Deflect = original.Deflect;
		clone.WGFlow = original.WGFlow;
		if (!event.isWasDeath()) {
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.MaxMana = message.data.MaxMana;
					variables.WaterMagic = message.data.WaterMagic;
					variables.FireMagic = message.data.FireMagic;
					variables.EarthMagic = message.data.EarthMagic;
					variables.WindMagic = message.data.WindMagic;
					variables.Mana = message.data.Mana;
					variables.ChantSpell = message.data.ChantSpell;
					variables.Swordsman = message.data.Swordsman;
					variables.StyleAffinity = message.data.StyleAffinity;
					variables.TechniqueSP = message.data.TechniqueSP;
					variables.SkillOne = message.data.SkillOne;
					variables.SkillTwo = message.data.SkillTwo;
					variables.SkillThree = message.data.SkillThree;
					variables.ArmChop = message.data.ArmChop;
					variables.QuickStrikes = message.data.QuickStrikes;
					variables.ToukiLevel = message.data.ToukiLevel;
					variables.LsOS = message.data.LsOS;
					variables.SGBeginner = message.data.SGBeginner;
					variables.WGBeginner = message.data.WGBeginner;
					variables.NGBeginner = message.data.NGBeginner;
					variables.Deflect = message.data.Deflect;
					variables.WGFlow = message.data.WGFlow;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
