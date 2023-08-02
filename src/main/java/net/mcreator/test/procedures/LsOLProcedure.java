package net.mcreator.test.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.LsOLEfPotionEffect;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class LsOLProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure LsOL!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).Mana >= 75) {
			entity.setMotion((entity.getLookVec().x + entity.getLookVec().x + entity.getLookVec().x + entity.getLookVec().x),
					(entity.getLookVec().y + entity.getLookVec().y + entity.getLookVec().y + entity.getLookVec().y),
					(entity.getLookVec().z + entity.getLookVec().z + entity.getLookVec().z + entity.getLookVec().z));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(LsOLEfPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
			{
				double _setval = ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MushokuModVariables.PlayerVariables())).Mana - 75);
				entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Mana = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
