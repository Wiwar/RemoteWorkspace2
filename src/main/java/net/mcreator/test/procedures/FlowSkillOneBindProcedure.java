package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FlowSkillOneBindProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure FlowSkillOneBind!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			String _setval = "Flow";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkillOne = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}

}
