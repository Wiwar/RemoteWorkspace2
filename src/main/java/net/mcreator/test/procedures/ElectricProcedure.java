package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ElectricProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Electric!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ElectricEfEfPotionEffect.potion, (int) 5, (int) 1, (false), (false)));
	}

}
