package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class ElectricEffProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ElectricEff!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ElectricEff!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("ElectricX",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()));
		entity.getPersistentData().putDouble("ElectricY",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()));
		entity.getPersistentData().putDouble("ElectricZ",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPersistentData().getDouble("ElectricX")),
					(entity.getPersistentData().getDouble("ElectricY")), (entity.getPersistentData().getDouble("ElectricZ")), (int) 15, 3, 3, 3, 1);
		}
		if (((Entity) world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(
				(entity.getPersistentData().getDouble("ElectricX")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricY")) - (4 / 2d),
				(entity.getPersistentData().getDouble("ElectricZ")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricX")) + (4 / 2d),
				(entity.getPersistentData().getDouble("ElectricY")) + (4 / 2d), (entity.getPersistentData().getDouble("ElectricZ")) + (4 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf((entity.getPersistentData().getDouble("ElectricX")), (entity.getPersistentData().getDouble("ElectricY")),
						(entity.getPersistentData().getDouble("ElectricZ"))))
				.findFirst().orElse(null)) instanceof LivingEntity)
			((LivingEntity) ((Entity) world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(
					(entity.getPersistentData().getDouble("ElectricX")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricY")) - (4 / 2d),
					(entity.getPersistentData().getDouble("ElectricZ")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricX")) + (4 / 2d),
					(entity.getPersistentData().getDouble("ElectricY")) + (4 / 2d), (entity.getPersistentData().getDouble("ElectricZ")) + (4 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPersistentData().getDouble("ElectricX")), (entity.getPersistentData().getDouble("ElectricY")),
							(entity.getPersistentData().getDouble("ElectricZ"))))
					.findFirst().orElse(null))).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 7, (false), (true)));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPersistentData().getDouble("ElectricX")),
					(entity.getPersistentData().getDouble("ElectricY")), (entity.getPersistentData().getDouble("ElectricZ")), (int) 15, 3, 3, 3, 1);
		}
		if (((Entity) world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(
				(entity.getPersistentData().getDouble("ElectricX")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricY")) - (4 / 2d),
				(entity.getPersistentData().getDouble("ElectricZ")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricX")) + (4 / 2d),
				(entity.getPersistentData().getDouble("ElectricY")) + (4 / 2d), (entity.getPersistentData().getDouble("ElectricZ")) + (4 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf((entity.getPersistentData().getDouble("ElectricX")), (entity.getPersistentData().getDouble("ElectricY")),
						(entity.getPersistentData().getDouble("ElectricZ"))))
				.findFirst().orElse(null)) instanceof LivingEntity)
			((LivingEntity) ((Entity) world.getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(
					(entity.getPersistentData().getDouble("ElectricX")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricY")) - (4 / 2d),
					(entity.getPersistentData().getDouble("ElectricZ")) - (4 / 2d), (entity.getPersistentData().getDouble("ElectricX")) + (4 / 2d),
					(entity.getPersistentData().getDouble("ElectricY")) + (4 / 2d), (entity.getPersistentData().getDouble("ElectricZ")) + (4 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPersistentData().getDouble("ElectricX")), (entity.getPersistentData().getDouble("ElectricY")),
							(entity.getPersistentData().getDouble("ElectricZ"))))
					.findFirst().orElse(null))).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 40, (int) 255, (false), (true)));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPersistentData().getDouble("ElectricX")),
					(entity.getPersistentData().getDouble("ElectricY")), (entity.getPersistentData().getDouble("ElectricZ")), (int) 15, 3, 3, 3, 1);
		}
	}
}
