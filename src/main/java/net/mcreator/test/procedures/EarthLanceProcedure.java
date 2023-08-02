package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EarthLanceProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure EarthLance!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure EarthLance!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure EarthLance!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure EarthLance!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure EarthLance!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		entity.setMotion(0, 2, 0);
		new Object() {

			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				world.setBlockState(new BlockPos(x, y, z), Blocks.STONE.getDefaultState(), 3);
				world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.STONE.getDefaultState()));
				world.setBlockState(new BlockPos(x, y + 1, z), Blocks.DIRT.getDefaultState(), 3);
				world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.DIRT.getDefaultState()));
				world.setBlockState(new BlockPos(x, y + 2, z), Blocks.DIRT.getDefaultState(), 3);
				world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.DIRT.getDefaultState()));
				MinecraftForge.EVENT_BUS.unregister(this);
			}

		}.start(world, (int) 10);

	}

}
