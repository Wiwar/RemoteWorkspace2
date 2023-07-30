package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.test.MushokuMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class DesertStormIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure DesertStormIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure DesertStormIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("DesertStormX", (MathHelper.nextInt(new Random(), -30, 30)));
		entity.getPersistentData().putDouble("DesertStormY", (MathHelper.nextInt(new Random(), -1, 5)));
		entity.getPersistentData().putDouble("DesertStormZ", (MathHelper.nextInt(new Random(), -30, 30)));
		entity.getPersistentData().putDouble("DesertStormDamage", (MathHelper.nextInt(new Random(), 1, 5)));
		entity.getPersistentData().putDouble("DesertStormPushX", (MathHelper.nextInt(new Random(), -5, 5)));
		entity.getPersistentData().putDouble("DesertStormPushZ", (MathHelper.nextInt(new Random(), -5, 5)));
		world.playEvent(2001,
				new BlockPos(entity.getPersistentData().getDouble("DesertStormX") + entity.getPosX(),
						entity.getPersistentData().getDouble("DesertStormY") + entity.getPosY(),
						entity.getPersistentData().getDouble("DesertStormZ") + entity.getPosZ()),
				Block.getStateId(Blocks.SAND.getDefaultState()));
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPersistentData().getDouble("DesertStormX") + entity.getPosX()) - (8 / 2d),
									(entity.getPersistentData().getDouble("DesertStormY") + entity.getPosY()) - (8 / 2d),
									(entity.getPersistentData().getDouble("DesertStormZ") + entity.getPosZ()) - (8 / 2d),
									(entity.getPersistentData().getDouble("DesertStormX") + entity.getPosX()) + (8 / 2d),
									(entity.getPersistentData().getDouble("DesertStormY") + entity.getPosY()) + (8 / 2d),
									(entity.getPersistentData().getDouble("DesertStormZ") + entity.getPosZ()) + (8 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPersistentData().getDouble("DesertStormX") + entity.getPosX()),
							(entity.getPersistentData().getDouble("DesertStormY") + entity.getPosY()),
							(entity.getPersistentData().getDouble("DesertStormZ") + entity.getPosZ())))
					.collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity)
					((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
				entityiterator.setMotion((entity.getPersistentData().getDouble("DesertStormPushX")), 0,
						(entity.getPersistentData().getDouble("DesertStormPushZ")));
				if (entity.getPersistentData().getDouble("DesertStormDamage") == 3) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 3);
				}
			}
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
