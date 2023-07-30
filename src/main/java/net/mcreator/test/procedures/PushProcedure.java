package net.mcreator.test.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.item.PushProjItem;
import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class PushProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Push!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 3, -1, 5);
			}
		}
	}
}
