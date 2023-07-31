package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class EyeoftheStormProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure EyeoftheStorm!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure EyeoftheStorm!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure EyeoftheStorm!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		Entity entity = (Entity) dependencies.get("entity");

		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPosX() + 15), y, (entity.getPosZ() + 15), (int) 40, 15, 3, 15, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX() + 15) - (25 / 2d), y - (25 / 2d), (entity.getPosZ() + 15) - (25 / 2d),
									(entity.getPosX() + 15) + (25 / 2d), y + (25 / 2d), (entity.getPosZ() + 15) + (25 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX() + 15), y, (entity.getPosZ() + 15))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.setMotion(0, 5, 0);
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
						entityiterator.setMotion(0, (-2), 0);
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 20);

			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPosX() - 15), y, (entity.getPosZ() + 15), (int) 40, 15, 3, 15, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX() - 15) - (25 / 2d), y - (25 / 2d), (entity.getPosZ() + 15) - (25 / 2d),
									(entity.getPosX() - 15) + (25 / 2d), y + (25 / 2d), (entity.getPosZ() + 15) + (25 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX() - 15), y, (entity.getPosZ() + 15))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.setMotion(0, 5, 0);
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
						entityiterator.setMotion(0, (-2), 0);
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 20);

			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPosX() + 15), y, (entity.getPosZ() - 15), (int) 40, 15, 3, 15, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX() + 15) - (25 / 2d), y - (25 / 2d), (entity.getPosZ() - 15) - (25 / 2d),
									(entity.getPosX() + 15) + (25 / 2d), y + (25 / 2d), (entity.getPosZ() - 15) + (25 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX() + 15), y, (entity.getPosZ() - 15))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.setMotion(0, 5, 0);
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
						entityiterator.setMotion(0, (-2), 0);
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 20);

			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPosX() - 15), y, (entity.getPosZ() - 15), (int) 40, 15, 3, 15, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX() - 15) - (25 / 2d), y - (25 / 2d), (entity.getPosZ() - 15) - (25 / 2d),
									(entity.getPosX() - 15) + (25 / 2d), y + (25 / 2d), (entity.getPosZ() - 15) + (25 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX() - 15), y, (entity.getPosZ() - 15))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.setMotion(0, 5, 0);
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
						entityiterator.setMotion(0, (-2), 0);
						MinecraftForge.EVENT_BUS.unregister(this);
					}

				}.start(world, (int) 20);

			}
		}
	}

}
