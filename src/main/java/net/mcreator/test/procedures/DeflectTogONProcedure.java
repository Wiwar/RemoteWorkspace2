package net.mcreator.test.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.DeflectPotionEffect;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class DeflectTogONProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure DeflectTogON!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DeflectPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putBoolean("Deflect", (true));
	}
}
