package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class TornadoIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure TornadoIdle!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure TornadoIdle!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure TornadoIdle!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure TornadoIdle!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");

		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("mushoku:destert_storm_entity"))
						.contains(entityiterator.getType())) {
					if (!entityiterator.world.isRemote())
						entityiterator.remove();
					world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.SAND.getDefaultState()));
				}
				if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("mushoku:sand_storm_entity")).contains(entityiterator.getType())) {
					if (!entityiterator.world.isRemote())
						entityiterator.remove();
					world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.SAND.getDefaultState()));
				}
				if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("mushoku:violent_storm_entity"))
						.contains(entityiterator.getType())) {
					if (!entityiterator.world.isRemote())
						entityiterator.remove();
					world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.QUARTZ_BLOCK.getDefaultState()));
				}
			}
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.horse.hurt")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.horse.hurt")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}

}
