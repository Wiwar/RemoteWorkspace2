package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ViolentStormEntityIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("ViolentStormX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormY", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormZ", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("ViolentStormMotion", (MathHelper.nextInt(new Random(), 1, 3)));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPersistentData().getDouble("ViolentStormX") + entity.getPosX()),
					(entity.getPersistentData().getDouble("ViolentStormY") + entity.getPosY()),
					(entity.getPersistentData().getDouble("ViolentStormZ") + entity.getPosZ()), (int) 20, 3, 3, 3, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX()) - (40 / 2d), (entity.getPosY()) - (40 / 2d), (entity.getPosZ()) - (40 / 2d),
									(entity.getPosX()) + (40 / 2d), (entity.getPosY()) + (40 / 2d), (entity.getPosZ()) + (40 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator == entity) {
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT,
								(entity.getPersistentData().getDouble("ViolentStormX") + entity.getPosX()),
								(entity.getPersistentData().getDouble("ViolentStormY") + entity.getPosY()),
								(entity.getPersistentData().getDouble("ViolentStormZ") + entity.getPosZ()), (int) 20, 3, 3, 3, 1);
					}
				} else {
					entityiterator.setMotion(0, (entity.getPersistentData().getDouble("ViolentStormMotion")), 0);
				}
			}
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
