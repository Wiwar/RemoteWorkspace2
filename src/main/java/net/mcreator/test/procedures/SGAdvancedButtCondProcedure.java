package net.mcreator.test.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class SGAdvancedButtCondProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure SGAdvancedButtCond!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).ArmChop == true
				&& (entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MushokuModVariables.PlayerVariables())).QuickStrikes == true) {
			return true;
		}
		return false;
	}
}
