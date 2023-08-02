package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LsOSProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure LsOS!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.setMotion((entity.getLookVec().x), (entity.getLookVec().y), (entity.getLookVec().z));
	}

}
