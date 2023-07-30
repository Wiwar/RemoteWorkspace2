package net.mcreator.test.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.Map;

public class WindBlastProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure WindBlast!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(((-2) - entity.getLookVec().x), ((-2) - entity.getLookVec().y), ((-2) - entity.getLookVec().z));
	}
}
