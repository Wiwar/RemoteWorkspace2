package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class ChantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Chant!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure Chant!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure Chant!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure Chant!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Chant!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MushokuMod.LOGGER.warn("Failed to load dependency guistate for procedure Chant!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if (entity.getPersistentData().getDouble("Mana") > 30) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Waterball")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				WaterballProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("y", y),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Ice Smash")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				IceSmashProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Water Arrow")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				WaterArrowProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Ice Blade")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				IceBladeproProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Rock Bullet")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				RockBulletProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Fireball")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				FireBallProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Blade")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				EarthBladeProjProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Blast")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				BlastProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Push")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				PushProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Healing")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				HealingProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("1")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				OneriseProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Skull")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 5);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 30));
				SKULLSHOTProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 80) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Ice Pillar")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				IcePillarProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Water Cannon")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				WaterCannonProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("y", y),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Icicle Lance")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				IcicleLanceProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Stone Cannon")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				StoneCannonProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Pillar")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				EarthPillarProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Explosion")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				ExplosionProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Flamethrower")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				FlamethrowerProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Lance")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				EarthLanceProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("X Healing")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 7);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 80));
				XHealingProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 200) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Blizzard Storm")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				BlizardStormProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Squall")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				SquallProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Ice Fortress")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				IceFortressProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Fortress")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				EarthFortressProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Wall")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				EarthWallProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Shine Healing")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 10);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 200));
				ShineHealingProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 400) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Cumulonimbus")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 400));
				CumulonimbusProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Sandstorm")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 400));
				SandStormProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Violent Storm")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 400));
				ViolentStormProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 800) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Lightning Strike")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 800));
				LightningStrikeProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 1600) {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Absolute Zero")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 1600));
				AbsoluteZeroProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Electric")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 1600));
				ElectricProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Mountian")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 1600));
				MountianProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Chant");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).contains("Earth Drill")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				{
					double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MushokuModVariables.PlayerVariables())).MaxMana + 15);
					entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MaxMana = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") - 1600));
				EarthDrillProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
	}
}
