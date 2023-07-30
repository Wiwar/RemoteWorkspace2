package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.stream.Stream;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class ScrollUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MushokuMod.LOGGER.warn("Failed to load dependency world for procedure ScrollUse!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MushokuMod.LOGGER.warn("Failed to load dependency x for procedure ScrollUse!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MushokuMod.LOGGER.warn("Failed to load dependency y for procedure ScrollUse!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MushokuMod.LOGGER.warn("Failed to load dependency z for procedure ScrollUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure ScrollUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("Mana") > 30) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Waterball")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				WaterballProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("y", y),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Ice Smash")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				IceSmashProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Water Arrow")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				WaterArrowProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Ice Blade")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				IceBladeproProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Rock Bullet")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				RockBulletProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Fireball")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				FireBallProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Blade")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthBladeProjProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Dig")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				DigProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Blast")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				BlastProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Push")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				PushProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Healing")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				HealingProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 80) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Ice Pillar")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				IcePillarProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Water Cannon")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				WaterCannonProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("y", y),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Icicle Lance")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				IcicleLanceProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Stone Cannon")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				StoneCannonProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Pillar")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthPillarProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Explosion")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				ExplosionProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Flamethrower")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				FlamethrowerProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Lance")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthLanceProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("X Healing")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				XHealingProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Feast")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				FeastProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 200) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Blizzard Storm")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				BlizardStormProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Squall")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				SquallProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Ice Fortress")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				IceFortressProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Fortress")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthFortressProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Wall")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthWallProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Hedgehog")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthHedgehogProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Shine Healing")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthWallProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Fall Negation")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				AddFallNegationProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 400) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Cumulonimbus")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				CumulonimbusProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Sandstorm")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				SandStormProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Violent Storm")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				ViolentStormProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 800) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Lightning Strike")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				LightningStrikeProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
		if (entity.getPersistentData().getDouble("Mana") > 1600) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Absolute Zero")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				AbsoluteZeroProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Electric")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				ElectricProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Mountain")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				MountianProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getDisplayName().getString())
					.equals("Earth Drill")) {
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
				{
					ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				EarthDrillProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			}
		}
	}
}
