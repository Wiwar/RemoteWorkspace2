package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SKULLSHOTProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure SKULLSHOT!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				SkullprojectileItem.shoot(_ent.world, _ent, new Random(), 1, 5, 5);
			}
		}
	}

}
