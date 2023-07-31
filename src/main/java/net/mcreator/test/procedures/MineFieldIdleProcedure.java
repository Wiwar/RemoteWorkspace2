package net.mcreator.test.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class MineFieldIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure MineFieldIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure MineFieldIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
		entity.getPersistentData().putDouble("MineFieldX", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.getPersistentData().putDouble("MineFieldY", (MathHelper.nextInt(new Random(), -3, 3)));
		entity.getPersistentData().putDouble("MineFieldZ", (MathHelper.nextInt(new Random(), -10, 10)));
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (entity.getPersistentData().getDouble("MineFieldX") + entity.getPosX()),
					(int) (entity.getPersistentData().getDouble("MineFieldY") + entity.getPosY()),
					(int) (entity.getPersistentData().getDouble("MineFieldZ") + entity.getPosZ()), (float) 4, Explosion.Mode.BREAK);
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.5);
	}
}
