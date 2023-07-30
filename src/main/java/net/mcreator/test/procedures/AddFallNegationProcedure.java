package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AddFallNegationProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure AddFallNegation!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(FallNegationPotionEffect.potion, (int) 60, (int) 1));
	}

}
