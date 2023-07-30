package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.state.Property;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class EarthDrillIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure EarthDrillIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure EarthDrillIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("EarthDrillX", (MathHelper.nextInt(new Random(), -5, 5) + entity.getPosX()));
		entity.getPersistentData().putDouble("EarthDrillY", (MathHelper.nextInt(new Random(), 1, 90)));
		entity.getPersistentData().putDouble("EarthDrillZ", (MathHelper.nextInt(new Random(), -5, 5) + entity.getPosZ()));
		{
			BlockPos _bp = new BlockPos(entity.getPersistentData().getDouble("EarthDrillX"), entity.getPersistentData().getDouble("EarthDrillY"),
					entity.getPersistentData().getDouble("EarthDrillZ"));
			BlockState _bs = Blocks.AIR.getDefaultState();
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
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.1);
	}
}
