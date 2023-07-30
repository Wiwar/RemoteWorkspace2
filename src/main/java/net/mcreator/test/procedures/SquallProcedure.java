package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.test.MushokuMod;

import java.util.Map;

public class SquallProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Squall!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		world.getWorldInfo().setRaining((true));
	}
}
