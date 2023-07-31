package net.mcreator.test.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ExodusFlameHitProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ExodusFlameHit!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ExodusFlameHit!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX()) - (3 / 2d), (entity.getPosY()) - (3 / 2d), (entity.getPosZ()) - (3 / 2d),
									(entity.getPosX()) + (3 / 2d), (entity.getPosY()) + (3 / 2d), (entity.getPosZ()) + (3 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 7);
			}
		}
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ()), (float) 10,
					Explosion.Mode.BREAK);
		}
	}
}
