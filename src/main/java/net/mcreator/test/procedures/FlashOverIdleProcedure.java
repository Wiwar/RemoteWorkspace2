package net.mcreator.test.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
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

public class FlashOverIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure FlashOverIdle!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure FlashOverIdle!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure FlashOverIdle!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure FlashOverIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure FlashOverIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("FlashOverX", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.getPersistentData().putDouble("FlashOverY", (MathHelper.nextInt(new Random(), -1, 1)));
		entity.getPersistentData().putDouble("FlashOverZ", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.getPersistentData().putDouble("FlashOverSound", (MathHelper.nextInt(new Random(), 1, 15)));
		if ((world.getBlockState(new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("FlashOverX"),
				entity.getPosY() + entity.getPersistentData().getDouble("FlashOverY"),
				entity.getPosZ() + entity.getPersistentData().getDouble("FlashOverZ")))).getBlock() == Blocks.AIR) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.LAVA, (entity.getPosX() + entity.getPersistentData().getDouble("FlashOverX")),
						(entity.getPosY() + entity.getPersistentData().getDouble("FlashOverY")),
						(entity.getPosZ() + entity.getPersistentData().getDouble("FlashOverZ")), (int) 5, 3, 3, 3, 1);
			}
		} else {
			{
				BlockPos _bp = new BlockPos(entity.getPosX() + entity.getPersistentData().getDouble("FlashOverX"),
						entity.getPosY() + entity.getPersistentData().getDouble("FlashOverY") + 1,
						entity.getPosZ() + entity.getPersistentData().getDouble("FlashOverZ"));
				BlockState _bs = Blocks.FIRE.getDefaultState();
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
		if (entity.getPersistentData().getDouble("FlashOverSound") == 3) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
