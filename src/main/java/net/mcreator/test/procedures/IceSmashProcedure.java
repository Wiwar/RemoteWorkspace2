package net.mcreator.test.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.item.IceSmashProjItem;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class IceSmashProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure IceSmash!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure IceSmash!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure IceSmash!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure IceSmash!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure IceSmash!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			World projectileLevel = _shootFrom.world;
			if (!projectileLevel.isRemote()) {
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
						AbstractArrowEntity entityToSpawn = new IceSmashProjItem.ArrowCustomEntity(IceSmashProjItem.arrow, world);
						entityToSpawn.setShooter(shooter);
						entityToSpawn.setDamage(damage);
						entityToSpawn.setKnockbackStrength(knockback);
						entityToSpawn.setSilent(true);

						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 3, 1);
				_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
				_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, (float) 1.5, 0);
				projectileLevel.addEntity(_entityToSpawn);
			}
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
