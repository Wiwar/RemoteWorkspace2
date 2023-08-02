
package net.mcreator.test.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LsOSEfPotionEffect {

	@ObjectHolder("mushoku:ls_os_ef")
	public static final Effect potion = null;

	@SubscribeEvent
	public static void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	public static class EffectCustom extends Effect {

		public EffectCustom() {
			super(EffectType.NEUTRAL, -1);
			setRegistryName("ls_os_ef");
		}

		@Override
		public String getName() {
			return "effect.ls_os_ef";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void performEffect(LivingEntity entity, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			LsOSEfEfProcedure.executeProcedure(Collections.emptyMap());
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}

	}

}
