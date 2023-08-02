package net.mcreator.test.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.test.potion.SwordGodPassiveEFPotionEffect;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.Map;

public class SwordGodAffinityPickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure SwordGodAffinityPick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			String _setval = "Sword God";
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StyleAffinity = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SwordGodPassiveEFPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
		{
			boolean _setval = (true);
			entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SwordGodBeg = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
