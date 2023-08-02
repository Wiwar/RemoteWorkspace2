package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SorcererPickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure SorcererPick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			String _setval = "Sorcerer";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Swordsman = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}

}
