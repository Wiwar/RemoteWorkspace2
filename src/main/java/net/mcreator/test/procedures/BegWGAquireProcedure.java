package net.mcreator.test.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class BegWGAquireProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure BegWGAquire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (true);
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.WaterGodBeg = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
