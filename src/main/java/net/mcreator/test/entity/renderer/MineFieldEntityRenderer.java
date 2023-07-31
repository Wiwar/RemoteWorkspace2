
package net.mcreator.test.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class MineFieldEntityRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MineFieldEntityEntity.entity,
					renderManager -> new MobRenderer(renderManager, new SilverfishModel(), 0.5f) {

						@Override
						public ResourceLocation getEntityTexture(Entity entity) {
							return new ResourceLocation("mushoku:textures/big_fire_orb.png");
						}

					});

		}
	}

}
