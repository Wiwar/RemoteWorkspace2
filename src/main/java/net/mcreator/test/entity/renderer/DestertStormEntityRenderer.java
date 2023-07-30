
package net.mcreator.test.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class DestertStormEntityRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DestertStormEntityEntity.entity,
					renderManager -> new MobRenderer(renderManager, new SilverfishModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("mushoku:textures/stone_cannon.png");
						}

					});

		}
	}

}
