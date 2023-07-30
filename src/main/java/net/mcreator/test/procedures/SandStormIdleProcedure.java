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

public class SandStormIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure SandStormIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure SandStormIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("SandStormX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("SandStormY", (MathHelper.nextInt(new Random(), -1, 5)));
		entity.getPersistentData().putDouble("SandStormZ", (MathHelper.nextInt(new Random(), -20, 20)));
		world.playEvent(2001,
				new BlockPos(entity.getPersistentData().getDouble("SandStormX") + entity.getPosX(),
						entity.getPersistentData().getDouble("SandStormY") + entity.getPosY(),
						entity.getPersistentData().getDouble("SandStormZ") + entity.getPosZ()),
				Block.getStateId(Blocks.SAND.getDefaultState()));
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPersistentData().getDouble("SandStormX") + entity.getPosX()) - (4 / 2d),
									(entity.getPersistentData().getDouble("SandStormY") + entity.getPosY()) - (4 / 2d),
									(entity.getPersistentData().getDouble("SandStormZ") + entity.getPosZ()) - (4 / 2d),
									(entity.getPersistentData().getDouble("SandStormX") + entity.getPosX()) + (4 / 2d),
									(entity.getPersistentData().getDouble("SandStormY") + entity.getPosY()) + (4 / 2d),
									(entity.getPersistentData().getDouble("SandStormZ") + entity.getPosZ()) + (4 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPersistentData().getDouble("SandStormX") + entity.getPosX()),
							(entity.getPersistentData().getDouble("SandStormY") + entity.getPosY()),
							(entity.getPersistentData().getDouble("SandStormZ") + entity.getPosZ())))
					.collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity)
					((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
			}
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
