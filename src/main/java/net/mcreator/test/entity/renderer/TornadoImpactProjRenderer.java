package net.mcreator.test.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.test.item.TornadoImpactProjItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TornadoImpactProjRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TornadoImpactProjItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<TornadoImpactProjItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/entities/wind2.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(TornadoImpactProjItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelspikey();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(TornadoImpactProjItem.ArrowCustomEntity entity) {
			return texture;
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
