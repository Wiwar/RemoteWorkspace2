package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class EarthFortressProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure EarthFortress!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure EarthFortress!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure EarthFortress!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure EarthFortress!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure EarthFortress!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (30); index0++) {
			entity.getPersistentData().putDouble("EarthFortX", (MathHelper.nextInt(new Random(), -4, 4)));
			entity.getPersistentData().putDouble("EarthFortY", (MathHelper.nextInt(new Random(), 0, 3)));
			entity.getPersistentData().putDouble("EarthFortZ", (MathHelper.nextInt(new Random(), -4, 4)));
			if ((world.getBlockState(new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
					entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
					entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ")))).getBlock() == Blocks.AIR) {
				{
					BlockPos _bp = new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
							entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
							entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ"));
					BlockState _bs = Blocks.DIRT.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
				world.playEvent(2001,
						new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
								entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
								entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ")),
						Block.getStateId(Blocks.DIRT.getDefaultState()));
			} else {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			}
			entity.getPersistentData().putDouble("EarthFortX", (MathHelper.nextInt(new Random(), -4, 4)));
			entity.getPersistentData().putDouble("EarthFortY", (MathHelper.nextInt(new Random(), 0, 3)));
			entity.getPersistentData().putDouble("EarthFortZ", (MathHelper.nextInt(new Random(), -4, 4)));
			if ((world.getBlockState(new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
					entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
					entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ")))).getBlock() == Blocks.AIR) {
				{
					BlockPos _bp = new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
							entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
							entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ"));
					BlockState _bs = Blocks.STONE.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
				world.playEvent(2001,
						new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("EarthFortX"),
								entity.getPosY() + entity.getPersistentData().getDouble("EarthFortY"),
								entity.getPosZ() + entity.getPersistentData().getDouble("EarthFortZ")),
						Block.getStateId(Blocks.STONE.getDefaultState()));
			} else {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
				}
			}
		}
	}
}
