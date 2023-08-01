
package net.mcreator.test.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.model.SilverfishModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.test.entity.MineFieldEntityEntity;

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
							return new ResourceLocation("mushoku:textures/entities/big_fire_orb.png");
						}
					});
		}
	}
}
