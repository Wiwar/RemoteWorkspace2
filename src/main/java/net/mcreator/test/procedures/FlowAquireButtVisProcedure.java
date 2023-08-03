package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlowAquireButtVisProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure FlowAquireButtVis!");
			return false;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).WGFlow == false) {
			return true;
		}
		return false;
	}

}
