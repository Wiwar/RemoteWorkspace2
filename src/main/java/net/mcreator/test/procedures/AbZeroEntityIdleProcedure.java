package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.state.Property;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class AbZeroEntityIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure AbZeroEntityIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure AbZeroEntityIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 10, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("AbZeroX", (MathHelper.nextInt(new Random(), -30, 30)));
		entity.getPersistentData().putDouble("AbZeroY", (MathHelper.nextInt(new Random(), -3, 3)));
		entity.getPersistentData().putDouble("AbZeroZ", (MathHelper.nextInt(new Random(), -30, 30)));
		if ((world.getBlockState(new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX"),
				entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY"),
				entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ")))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX")),
						(entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY")),
						(entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ")), (int) 15, 3, 3, 3, 1);
			}
		} else {
			{
				BlockPos _bp = new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX"),
						entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY"),
						entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ"));
				BlockState _bs = Blocks.SNOW_BLOCK.getDefaultState();
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
		}
		entity.getPersistentData().putDouble("AbZeroX", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.getPersistentData().putDouble("AbZeroY", (MathHelper.nextInt(new Random(), -3, 3)));
		entity.getPersistentData().putDouble("AbZeroZ", (MathHelper.nextInt(new Random(), -10, 10)));
		if ((world.getBlockState(new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX"),
				entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY"),
				entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ")))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.EFFECT, (entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX")),
						(entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY")),
						(entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ")), (int) 15, 3, 3, 3, 1);
			}
		} else {
			{
				BlockPos _bp = new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("AbZeroX"),
						entity.getPosY() + entity.getPersistentData().getDouble("AbZeroY"),
						entity.getPosZ() + entity.getPersistentData().getDouble("AbZeroZ"));
				BlockState _bs = Blocks.ICE.getDefaultState();
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
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.02);
	}
}
