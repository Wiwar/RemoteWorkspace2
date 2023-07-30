package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class MountianidleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Mountianidle!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure Mountianidle!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure Mountianidle!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure Mountianidle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Mountianidle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("MountianX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("MountainY", (MathHelper.nextInt(new Random(), -2, 20)));
		entity.getPersistentData().putDouble("MountianZ", (MathHelper.nextInt(new Random(), -20, 20)));
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
				entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
				entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.STONE.getDefaultState(), 3);
		world.playEvent(2001,
				new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
						entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
						entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()),
				Block.getStateId(Blocks.STONE.getDefaultState()));
		entity.getPersistentData().putDouble("MountianX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("MountainY", (MathHelper.nextInt(new Random(), -2, 20)));
		entity.getPersistentData().putDouble("MountianZ", (MathHelper.nextInt(new Random(), -20, 20)));
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
				entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
				entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.DIRT.getDefaultState(), 3);
		world.playEvent(2001,
				new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
						entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
						entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()),
				Block.getStateId(Blocks.DIRT.getDefaultState()));
		entity.getPersistentData().putDouble("MountanDiamond", (MathHelper.nextInt(new Random(), 1, 60)));
		if (entity.getPersistentData().getDouble("MountanDiamond") == 15) {
			world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
					entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
					entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.DIAMOND_ORE.getDefaultState(), 3);
			world.playEvent(2001, new BlockPos(x, y, z), Block.getStateId(Blocks.STONE.getDefaultState()));
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
