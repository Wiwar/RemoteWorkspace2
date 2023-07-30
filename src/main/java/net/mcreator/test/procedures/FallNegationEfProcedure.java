package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FallNegationEfProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure FallNegationEf!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.fallDistance = (float) (0);
	}

}
