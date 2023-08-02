package net.mcreator.test.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.LsOSEfPotionEffect;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class LsOSProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure LsOS!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion((entity.getLookVec().x + entity.getLookVec().x), (entity.getLookVec().y + entity.getLookVec().y),
				(entity.getLookVec().z + entity.getLookVec().z));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(LsOSEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
