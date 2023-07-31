package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ManaSleepProcedure {

	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerInBed(PlayerSleepInBedEvent event) {
			PlayerEntity entity = event.getPlayer();
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ManaSleep!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		{
			double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).Mana
					+ (entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana / 2);
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}

}
