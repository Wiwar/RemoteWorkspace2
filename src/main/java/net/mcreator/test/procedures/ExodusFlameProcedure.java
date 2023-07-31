package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExodusFlameProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ExodusFlame!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ExodusFlame!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 25, (int) 10, (false), (false)));
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new ExodusFlameEntityEntity.CustomEntity(ExodusFlameEntityEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY() + 2), (entity.getPosZ()), (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			entityToSpawn.setRotationYawHead((float) 0);
			entityToSpawn.setMotion(0, 0, 0);

			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);

			world.addEntity(entityToSpawn);
		}
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
				((Entity) world
						.getEntitiesWithinAABB(ExodusFlameEntityEntity.CustomEntity.class,
								new AxisAlignedBB((entity.getPosX()) - (3 / 2d), (entity.getPosY() + 2) - (3 / 2d), (entity.getPosZ()) - (3 / 2d),
										(entity.getPosX()) + (3 / 2d), (entity.getPosY() + 2) + (3 / 2d), (entity.getPosZ()) + (3 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entity.getPosX()), (entity.getPosY() + 2), (entity.getPosZ()))).findFirst().orElse(null))
						.setMotion((entity.getLookVec().x + entity.getLookVec().x), (entity.getLookVec().y + entity.getLookVec().y),
								(entity.getLookVec().z + entity.getLookVec().z));
				MinecraftForge.EVENT_BUS.unregister(this);
			}

		}.start(world, (int) 20);

	}

}
