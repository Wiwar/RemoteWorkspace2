package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class IntermediateDispCondProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure IntermediateDispCond!");
			return false;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).StyleAffinity).equals("Sword God")) {
			return true;
		}
		return false;
	}

}
