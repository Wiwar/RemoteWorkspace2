package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.ToukiEfPotionEffect;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;
import java.util.HashMap;

public class ToukiProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Touki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel >= 1) {
			if (((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).StyleAffinity).equals("Sword God")) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel + 1),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(ToukiEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
			}
			if (((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).StyleAffinity).equals("Water God")) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel + 1),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(ToukiEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
			}
			if (((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).StyleAffinity).equals("NorthGod")) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60,
							(int) ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new MushokuModVariables.PlayerVariables())).ToukiLevel + 1),
							(false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(ToukiEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
			}
		}
	}
}
