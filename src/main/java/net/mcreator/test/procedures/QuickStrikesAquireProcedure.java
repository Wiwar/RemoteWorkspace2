package net.mcreator.test.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class QuickStrikesAquireProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure QuickStrikesAquire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP >= 25) {
			if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).QuickStrikes == false) {
				{
					boolean _setval = (true);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.QuickStrikes = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP - 25);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TechniqueSP = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
