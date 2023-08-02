package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NorthGodAffinityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure NorthGodAffinity!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			String _setval = "North God";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StyleAffinity = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(NorthGodPassiveEFPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}

}
