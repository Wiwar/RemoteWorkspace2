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

import net.mcreator.test.item.FlameSliceProjItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FlameSliceProjRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FlameSliceProjItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<FlameSliceProjItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/entities/big_fire_orb.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(FlameSliceProjItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelcresantbig();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(FlameSliceProjItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.8.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelcresantbig extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer bone2;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer bone7;
		private final ModelRenderer bone8;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;
		private final ModelRenderer bone11;
		private final ModelRenderer bone12;
		private final ModelRenderer bone13;

		public Modelcresantbig() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone, 0.0F, 3.1416F, 1.5708F);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone3);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone4);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(bone2);
			bone2.setTextureOffset(6, 18).addBox(1.0F, 6.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(13, 14).addBox(-2.0F, 9.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 13).addBox(-2.0F, -15.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 13).addBox(-6.0F, -16.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 13).addBox(-6.0F, 10.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(4.0F, -11.0F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(12, 16).addBox(1.0F, -13.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(3.0F, 3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(3.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(5.0F, -10.0F, -1.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(6.0F, -8.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(6, 0).addBox(6.0F, -6.0F, -1.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(1.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(1.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-9.0F, -14.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-8.0F, 10.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-9.0F, 9.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-8.0F, -15.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(0.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(0.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(2.0F, 5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(2.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-3.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(1, 1).addBox(-3.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone5);
			setRotationAngle(bone5, 0.0F, 3.1416F, -3.1416F);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone5.addChild(bone6);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone6.addChild(bone7);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone7.addChild(bone8);
			bone8.setTextureOffset(6, 18).addBox(0.0F, 10.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(13, 14).addBox(-3.0F, 13.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 13).addBox(-3.0F, -11.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 13).addBox(-7.0F, -12.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 13).addBox(-7.0F, 14.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(3.0F, -7.0F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(12, 16).addBox(0.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(2.0F, 7.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(2.0F, -6.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(4.0F, -6.0F, -1.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(5.0F, -4.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(6, 0).addBox(5.0F, -2.0F, -1.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(0.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(0.0F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-10.0F, -10.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-9.0F, 14.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-10.0F, 13.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-9.0F, -11.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-1.0F, 12.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-1.0F, -9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(1.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(1.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-4.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone8.setTextureOffset(1, 1).addBox(-4.0F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone5.addChild(bone9);
			setRotationAngle(bone9, 0.0F, 3.1416F, -3.1416F);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone9.addChild(bone10);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone10.addChild(bone11);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone11.addChild(bone12);
			bone12.setTextureOffset(6, 18).addBox(-1.0F, 6.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(13, 14).addBox(-4.0F, 9.0F, 1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 13).addBox(-4.0F, -15.0F, 1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 13).addBox(-8.0F, -16.0F, 1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 13).addBox(-8.0F, 10.0F, 1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(2.0F, -11.0F, 1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(12, 16).addBox(-1.0F, -13.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(1.0F, 3.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(1.0F, -10.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(3.0F, -10.0F, 1.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(4.0F, -8.0F, 1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(6, 0).addBox(4.0F, -6.0F, 1.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-1.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-1.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-11.0F, -14.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-10.0F, 10.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-11.0F, 9.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-10.0F, -15.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-2.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-2.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(0.0F, 5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(0.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-5.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone12.setTextureOffset(1, 1).addBox(-5.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13 = new ModelRenderer(this);
			bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone12.addChild(bone13);
			bone13.setTextureOffset(6, 18).addBox(-2.0F, 6.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(13, 14).addBox(-5.0F, 9.0F, 2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 13).addBox(-5.0F, -15.0F, 2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 13).addBox(-9.0F, -16.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 13).addBox(-9.0F, 10.0F, 2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(1.0F, -11.0F, 2.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(12, 16).addBox(-2.0F, -13.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(0.0F, 3.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(0.0F, -10.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(2.0F, -10.0F, 2.0F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(3.0F, -8.0F, 2.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(6, 0).addBox(3.0F, -6.0F, 2.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-2.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-2.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-12.0F, -14.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-11.0F, 10.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-12.0F, 9.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-11.0F, -15.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-3.0F, 8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-3.0F, -13.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-1.0F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-1.0F, -10.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-6.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone13.setTextureOffset(1, 1).addBox(-6.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
