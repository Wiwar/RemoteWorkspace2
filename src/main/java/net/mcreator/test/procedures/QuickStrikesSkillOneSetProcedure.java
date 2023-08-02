package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class QuickStrikesSkillOneSetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure QuickStrikesSkillOneSet!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			String _setval = "Quick Strikes";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SkillOne = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}

}
