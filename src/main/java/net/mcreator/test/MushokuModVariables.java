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
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
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
			nbt.putDouble("TechniqueSP", instance.TechniqueSP);
			nbt.putString("StyleAffinity", instance.StyleAffinity);
			nbt.putString("SkillTwo", instance.SkillTwo);
			nbt.putString("SkillOne", instance.SkillOne);
			nbt.putDouble("ToukiLevel", instance.ToukiLevel);
			nbt.putBoolean("QuickStrikes", instance.QuickStrikes);
			nbt.putString("Swordsman", instance.Swordsman);
			nbt.putString("SkillThree", instance.SkillThree);
			nbt.putBoolean("ArmChop", instance.ArmChop);
			nbt.putBoolean("LsOS", instance.LsOS);
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
			instance.TechniqueSP = nbt.getDouble("TechniqueSP");
			instance.StyleAffinity = nbt.getString("StyleAffinity");
			instance.SkillTwo = nbt.getString("SkillTwo");
			instance.SkillOne = nbt.getString("SkillOne");
			instance.ToukiLevel = nbt.getDouble("ToukiLevel");
			instance.QuickStrikes = nbt.getBoolean("QuickStrikes");
			instance.Swordsman = nbt.getString("Swordsman");
			instance.SkillThree = nbt.getString("SkillThree");
			instance.ArmChop = nbt.getBoolean("ArmChop");
			instance.LsOS = nbt.getBoolean("LsOS");
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
		public double TechniqueSP = 0;
		public String StyleAffinity = "\"\"";
		public String SkillTwo = "\"\"";
		public String SkillOne = "\"\"";
		public double ToukiLevel = 0;
		public boolean QuickStrikes = false;
		public String Swordsman = "None";
		public String SkillThree = "\"\"";
		public boolean ArmChop = false;
		public boolean LsOS = false;

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
		clone.TechniqueSP = original.TechniqueSP;
		clone.StyleAffinity = original.StyleAffinity;
		clone.SkillTwo = original.SkillTwo;
		clone.SkillOne = original.SkillOne;
		clone.ToukiLevel = original.ToukiLevel;
		clone.QuickStrikes = original.QuickStrikes;
		clone.Swordsman = original.Swordsman;
		clone.SkillThree = original.SkillThree;
		clone.ArmChop = original.ArmChop;
		clone.LsOS = original.LsOS;
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
					variables.TechniqueSP = message.data.TechniqueSP;
					variables.StyleAffinity = message.data.StyleAffinity;
					variables.SkillTwo = message.data.SkillTwo;
					variables.SkillOne = message.data.SkillOne;
					variables.ToukiLevel = message.data.ToukiLevel;
					variables.QuickStrikes = message.data.QuickStrikes;
					variables.Swordsman = message.data.Swordsman;
					variables.SkillThree = message.data.SkillThree;
					variables.ArmChop = message.data.ArmChop;
					variables.LsOS = message.data.LsOS;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
