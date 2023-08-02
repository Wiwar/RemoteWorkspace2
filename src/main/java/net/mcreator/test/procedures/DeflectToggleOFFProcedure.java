package net.mcreator.test.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.DeflectPotionEffect;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class DeflectToggleOFFProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure DeflectToggleOFF!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(DeflectPotionEffect.potion);
		}
		entity.getPersistentData().putBoolean("Deflect", (false));
	}
}
