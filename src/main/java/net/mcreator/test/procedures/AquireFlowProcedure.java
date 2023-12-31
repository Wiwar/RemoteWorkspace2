package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AquireFlowProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure AquireFlow!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).MaxMana >= 50) {
			{
				boolean _setval = (true);
				entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.WGFlow = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP - 50);
				entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TechniqueSP = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}

}
