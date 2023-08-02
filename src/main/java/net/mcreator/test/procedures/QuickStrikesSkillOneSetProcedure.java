package net.mcreator.test.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

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
