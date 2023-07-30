package net.mcreator.test.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.particle.WindParticle;
import net.mcreator.test.item.PushProjItem;
import net.mcreator.test.MushokuMod;

import java.util.Random;
import java.util.Map;

public class ViolentStormEntityIdleProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ViolentStormEntityIdle!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ViolentStormEntityIdle!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("ViolentStormX", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.getPersistentData().putDouble("ViolentStormY", (MathHelper.nextInt(new Random(), 0, 4)));
		entity.getPersistentData().putDouble("ViolentStormZ", (MathHelper.nextInt(new Random(), -10, 10)));
		entity.rotationYaw = (float) (0);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 15, 3, 3,
					3, 1);
		}
		entity.rotationYaw = (float) (20);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (40);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (60);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (80);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 15, 3, 3,
					3, 1);
		}
		entity.rotationYaw = (float) (100);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (120);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (140);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (160);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 15, 3, 3,
					3, 1);
		}
		entity.rotationYaw = (float) (180);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (200);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (220);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (240);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (260);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 15, 3, 3,
					3, 1);
		}
		entity.rotationYaw = (float) (280);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (300);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (320);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (340);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		entity.rotationYaw = (float) (360);
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (10);
		if (entity instanceof LivingEntity) {
			LivingEntity _ent = (LivingEntity) entity;
			if (!_ent.world.isRemote()) {
				PushProjItem.shoot(_ent.world, _ent, new Random(), 2, 0, 5);
			}
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(WindParticle.particle, (entity.getPersistentData().getDouble("ViolentStormX")),
					(entity.getPersistentData().getDouble("ViolentStormY")), (entity.getPersistentData().getDouble("ViolentStormZ")), (int) 15, 3, 3,
					3, 1);
		}
	}
}
