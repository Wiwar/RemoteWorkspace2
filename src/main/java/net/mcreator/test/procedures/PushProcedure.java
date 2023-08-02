package net.mcreator.test.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.item.PushProjItem;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class PushProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Push!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			World projectileLevel = _shootFrom.world;
			if (!projectileLevel.isRemote()) {
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
						AbstractArrowEntity entityToSpawn = new PushProjItem.ArrowCustomEntity(PushProjItem.arrow, world);
						entityToSpawn.setShooter(shooter);
						entityToSpawn.setDamage(damage);
						entityToSpawn.setKnockbackStrength(knockback);
						entityToSpawn.setSilent(true);

						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, -1, 5);
				_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
				_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 3, 0);
				projectileLevel.addEntity(_entityToSpawn);
			}
		}
	}
}
