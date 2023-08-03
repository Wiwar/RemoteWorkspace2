package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlowSkillButtVisProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure FlowSkillButtVis!");
			return false;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).WGFlow == true) {
			return true;
		}
		return false;
	}

}
