package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ArmChopSkillOneSetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ArmChopSkillOneSet!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			String _setval = "Arm Chop";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkillOne = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}

}
