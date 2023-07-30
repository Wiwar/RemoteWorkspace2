package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ElectricProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Electric!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Electric!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT,
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
					(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
							RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
					(int) 20, 3, 3, 3, 1);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(
									(entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
															entity.getLook(1f).z * 15),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY()) - (4 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX())
											- (4 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getZ())
											- (4 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY()) + (4 / 2d),
									(entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f)
															.add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX()) + (4 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15,
													entity.getLook(1f).z * 15),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + (4 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 15, entity.getLook(1f).y * 15, entity.getLook(1f).z * 15),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
					.collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity)
					((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 30, (int) 1, (false), (false)));
				if (entityiterator instanceof LivingEntity)
					((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 30, (int) 10, (false), (false)));
				entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 5);
			}
		}
	}
}
