package net.mcreator.test.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.Map;

public class ExplosionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Explosion!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Explosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("ExplosionX",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()));
		entity.getPersistentData().putDouble("ExplosionY",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()));
		entity.getPersistentData().putDouble("ExplosionZ",
				(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * 20, entity.getLook(1f).y * 20, entity.getLook(1f).z * 20),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (entity.getPersistentData().getDouble("ExplosionX")),
					(int) (entity.getPersistentData().getDouble("ExplosionY")), (int) (entity.getPersistentData().getDouble("ExplosionZ")), (float) 3,
					Explosion.Mode.BREAK);
		}
	}
}
