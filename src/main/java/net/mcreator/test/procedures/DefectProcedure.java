package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.DeflectEfPotionEffect;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;
import java.util.HashMap;

public class DefectProcedure {
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
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Defect!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure Defect!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure Defect!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure Defect!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Defect!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).Deflect == true) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() instanceof SwordItem) {
				if (entity.getPersistentData().getBoolean("Deflect") == false) {
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.RAIN, x, y, z, (int) 0, 3, 3, 3, 1);
					}
				} else {
					if (entity.isSneaking()) {
						if (entity.isInLava() && entity.isEntityInsideOpaqueBlock()) {
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.RAIN, x, y, z, (int) 0, 3, 3, 3, 1);
							}
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 2, (int) 100, (false), (false)));
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 2, (int) 100, (false), (false)));
							{
								double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MushokuModVariables.PlayerVariables())).Mana - 0.5);
								entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Mana = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DeflectEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
		}
	}
}
