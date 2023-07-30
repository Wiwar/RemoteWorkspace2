package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.test.MushokuMod;

import java.util.Map;

public class EarthWallProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure EarthWall!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure EarthWall!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("EarthWallX",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()));
		entity.getPersistentData().putDouble("EarthWallY",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()));
		entity.getPersistentData().putDouble("EarthWallZ",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ")), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY") + -1,
				entity.getPersistentData().getDouble("EarthWallZ")), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY") + 1,
				entity.getPersistentData().getDouble("EarthWallZ")), Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + -1, entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ")), Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + -1,
				entity.getPersistentData().getDouble("EarthWallY") + -1, entity.getPersistentData().getDouble("EarthWallZ")),
				Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + -1,
				entity.getPersistentData().getDouble("EarthWallY") + 1, entity.getPersistentData().getDouble("EarthWallZ")),
				Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + 1, entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ")), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + 1,
				entity.getPersistentData().getDouble("EarthWallY") + -1, entity.getPersistentData().getDouble("EarthWallZ")),
				Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX") + 1,
				entity.getPersistentData().getDouble("EarthWallY") + 1, entity.getPersistentData().getDouble("EarthWallZ")),
				Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ") + -1), Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY") + -1,
				entity.getPersistentData().getDouble("EarthWallZ") + -1), Blocks.DIRT.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY") + 1,
				entity.getPersistentData().getDouble("EarthWallZ") + -1), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ") + 1), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ") + 1), Blocks.STONE.getDefaultState(), 3);
		world.setBlockState(new BlockPos(entity.getPersistentData().getDouble("EarthWallX"), entity.getPersistentData().getDouble("EarthWallY"),
				entity.getPersistentData().getDouble("EarthWallZ") + 1), Blocks.STONE.getDefaultState(), 3);
	}
}
