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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Mountianidle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("MountianX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("MountainY", (MathHelper.nextInt(new Random(), -2, 20)));
		entity.getPersistentData().putDouble("MountianZ", (MathHelper.nextInt(new Random(), -20, 20)));
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
				entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
				entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.STONE.getDefaultState(), 3);
		entity.getPersistentData().putDouble("MountianX", (MathHelper.nextInt(new Random(), -20, 20)));
		entity.getPersistentData().putDouble("MountainY", (MathHelper.nextInt(new Random(), -2, 20)));
		entity.getPersistentData().putDouble("MountianZ", (MathHelper.nextInt(new Random(), -20, 20)));
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
				entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
				entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.DIRT.getDefaultState(), 3);
		entity.getPersistentData().putDouble("MountanDiamond", (MathHelper.nextInt(new Random(), 1, 60)));
		if (entity.getPersistentData().getDouble("MountanDiamond") == 15) {
			world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("MountianX") + entity.getPosX(),
					entity.getPersistentData().getDouble("MountainY") + entity.getPosY(),
					entity.getPersistentData().getDouble("MountianZ") + entity.getPosZ()), Blocks.DIAMOND_ORE.getDefaultState(), 3);
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
