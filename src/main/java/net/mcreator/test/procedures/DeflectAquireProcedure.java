package net.mcreator.test.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.DeflectEfPotionEffect;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class DeflectAquireProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure DeflectAquire!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP >= 50) {
			{
				boolean _setval = (true);
				entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Deflect = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putBoolean("Deflect", (true));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DeflectEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
			{
				double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP - 50);
				entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TechniqueSP = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
