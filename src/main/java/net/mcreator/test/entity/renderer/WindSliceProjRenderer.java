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

import net.mcreator.test.item.WindSliceProjItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WindSliceProjRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WindSliceProjItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<WindSliceProjItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/windslice.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(WindSliceProjItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelcresant();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(WindSliceProjItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.8.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcresant extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone2;

		public Modelcresant() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 3.1416F, 1.5708F);
			bone.setTextureOffset(18, 16).addBox(-1.0F, 5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 6).addBox(-3.0F, 7.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 3).addBox(-3.0F, -8.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(1.0F, -4.0F, 0.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(0.0F, 2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(0.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(2.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 19).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone3);
			bone3.setTextureOffset(16, 9).addBox(-3.0F, 5.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(12, 0).addBox(-6.0F, 7.0F, 1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(6, 10).addBox(-6.0F, -9.0F, 1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 1.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(0.0F, -1.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(6, 15).addBox(-3.0F, -6.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone4);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(bone2);
			bone2.setTextureOffset(6, 18).addBox(1.0F, 5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(13, 14).addBox(-1.0F, 7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 13).addBox(-1.0F, -7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(3.0F, -4.0F, -1.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(12, 16).addBox(1.0F, -6.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(19, 5).addBox(-8.0F, 9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(15, 12).addBox(-8.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(15, 12).addBox(-4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(15, 12).addBox(-4.0F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(2.0F, 2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(2.0F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(4.0F, -2.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
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
