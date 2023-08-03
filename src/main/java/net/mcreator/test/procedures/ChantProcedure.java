package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ChantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies){
			if(dependencies.get("world") == null) {
				if(!dependencies.containsKey("world"))
					MushokuMod.LOGGER.warn("Failed to load dependency world for procedure Chant!");
				return;
			}
			if(dependencies.get("x") == null) {
				if(!dependencies.containsKey("x"))
					MushokuMod.LOGGER.warn("Failed to load dependency x for procedure Chant!");
				return;
			}
			if(dependencies.get("y") == null) {
				if(!dependencies.containsKey("y"))
					MushokuMod.LOGGER.warn("Failed to load dependency y for procedure Chant!");
				return;
			}
			if(dependencies.get("z") == null) {
				if(!dependencies.containsKey("z"))
					MushokuMod.LOGGER.warn("Failed to load dependency z for procedure Chant!");
				return;
			}
			if(dependencies.get("entity") == null) {
				if(!dependencies.containsKey("entity"))
					MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure Chant!");
				return;
			}
			if(dependencies.get("guistate") == null) {
				if(!dependencies.containsKey("guistate"))
					MushokuMod.LOGGER.warn("Failed to load dependency guistate for procedure Chant!");
				return;
			}

				IWorld world = (IWorld) dependencies.get("world");
				double x = dependencies.get("x") instanceof Integer
					? (int) dependencies.get("x") : (double) dependencies.get("x");
				double y = dependencies.get("y") instanceof Integer
					? (int) dependencies.get("y") : (double) dependencies.get("y");
				double z = dependencies.get("z") instanceof Integer
					? (int) dependencies.get("z") : (double) dependencies.get("z");
				Entity entity = (Entity) dependencies.get("entity");
				HashMap guistate = (HashMap) dependencies.get("guistate");


		{
  String _setval = (new Object(){
	public String getText(){
		TextFieldWidget _tf=(TextFieldWidget)guistate.get("text:Chant");
		if(_tf!=null){
			return _tf.getText();
		}
		return"";
	}
}.getText());
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}if ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {

	Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana>30) {if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Waterball")) {    


        WaterballProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Ice Smash")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        IceSmashProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Water Arrow")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        WaterArrowProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Ice Blade")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        IceBladeproProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Rock Bullet")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        RockBulletProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Fireball")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        FireBallProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Heat Hand")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        HeatHandProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Burning Place")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        BurningPlaceProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Earth Blade")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        EarthBladeProjProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Dig")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        DigProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Blast")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        BlastProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Push")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        PushProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Pull")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        PullProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Healing")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}    


        HealingProcedure.executeProcedure(Stream.of(
        new AbstractMap.SimpleEntry<>("world", world),new AbstractMap.SimpleEntry<>("x", x),new AbstractMap.SimpleEntry<>("y", y),new AbstractMap.SimpleEntry<>("z", z),new AbstractMap.SimpleEntry<>("entity", entity)
        ).collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))
;
new Object() {

    private int ticks = 0;
    private float waitTicks;
    private IWorld world;

    public void start(IWorld world, int waitTicks) {
		this.waitTicks = waitTicks;
		MinecraftForge.EVENT_BUS.register(this);
		this.world = world;
	}

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.ticks += 1;
            if (this.ticks >= this.waitTicks)
                run();
        }
    }

    private void run() {
        {
  String _setval = "empty";
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.ChantSpell = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
        MinecraftForge.EVENT_BUS.unregister(this);
    }

}.start(world, (int) 2);
}if (((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).ChantSpell).equals("Cancer")) {if(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
) instanceof PlayerEntity)
        ((PlayerEntity) ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
)).closeScreen();{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).MaxMana+5);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.MaxMana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}{
  double _setval = ((((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new MushokuModVariables.PlayerVariables())).Mana-30);
  ((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
).getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
    capability.Mana = _setval;
    capability.syncPlayerVariables(((Entity) world.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(
            x - (0.5 / 2d), y - (0.5 / 2d), z - (0.5 / 2d),
            x + (0.5 / 2d), y + (0.5 / 2d), z + (0.5 / 2d)), null)
    .stream()
	.sorted(new Object() {
		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
		    return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
		}
	}.compareDistOf(x, y, z))
    .findFirst().orElse(null)
));
  });
}
	}

}
