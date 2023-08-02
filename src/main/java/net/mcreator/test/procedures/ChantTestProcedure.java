package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcreator.test.MushokuMod;

import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.AbstractMap;

public class ChantTestProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ChantTest!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure ChantTest!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure ChantTest!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure ChantTest!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ChantTest!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MushokuMod.LOGGER.warn("Failed to load dependency guistate for procedure ChantTest!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("Waterball")) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d), x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PlayerEntity)
				((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d), x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null))).closeScreen();
			WaterballProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("entity", entity))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		}
	}
}
