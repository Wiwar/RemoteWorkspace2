package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.test.particle.WindParticle;
import net.mcreator.test.MushokuMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ViolentStormEntityIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ViolentStormEntityIdle!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure ViolentStormEntityIdle!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure ViolentStormEntityIdle!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure ViolentStormEntityIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ViolentStormEntityIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("ViolentStormX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormY", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormZ", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormMotion", (MathHelper.nextInt(new Random(), 1, 3)));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 10, 3, 3,
					3, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator == entity) {
					entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
				} else {
					entityiterator.setMotion(0, (entity.getPersistentData().getDouble("ViolentStormMotion")), 0);
				}
			}
		}
	}
}
