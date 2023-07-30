
package net.mcreator.test.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.test.entity.EarthGroundSpikeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EarthGroundSpikeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EarthGroundSpikeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelspikey(), 1f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mushoku:textures/stone_cannon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.8.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelspikey extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;

		public Modelspikey() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-1.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 0.0F, 1.5708F);
			bone.setTextureOffset(23, 15).addBox(-14.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 16).addBox(-5.0F, -4.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-14.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 22).addBox(-14.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(15, 0).addBox(-5.0F, 2.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(20, 8).addBox(-10.0F, -1.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(8, 24).addBox(-14.0F, -2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(-12.0F, -2.0F, -2.0F, 9.0F, 3.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-6.0F, -3.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(5, 20).addBox(-17.0F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(8, 22).addBox(-10.0F, 1.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(17, 20).addBox(-10.0F, -1.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(21, 10).addBox(-10.0F, -3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(20, 4).addBox(-5.0F, -2.0F, 2.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(14, 16).addBox(-5.0F, -2.0F, -4.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 20).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
