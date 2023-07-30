package net.mcreator.test.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class ExFlameProjRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ExFlameProjItem.arrow, renderManager -> new CustomRender(renderManager));
		}

	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<ExFlameProjItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/big_fire_orb.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(ExFlameProjItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelBIGORB();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();

			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(ExFlameProjItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.8.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports

	public static class ModelBIGORB extends EntityModel<Entity> {
		private final ModelRenderer bone2;

		public ModelBIGORB() {
			textureWidth = 64;
			textureHeight = 64;

			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(bone2, 0.0F, -0.0436F, 0.0F);
			bone2.setTextureOffset(18, 17).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(32, 5).addBox(-3.0F, -9.0F, -5.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(36, 17).addBox(-1.0F, -3.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(16, 36).addBox(-5.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(32, 36).addBox(-1.0F, -11.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(8, 23).addBox(-2.0F, -8.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(20, 40).addBox(-5.0F, -11.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 35).addBox(5.0F, -8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(10, 36).addBox(-6.0F, -8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(14, 24).addBox(-5.0F, -9.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			bone2.setTextureOffset(38, 38).addBox(-1.0F, -11.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(0, 23).addBox(4.0F, -9.0F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(6, 35).addBox(3.0F, -7.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(28, 29).addBox(-3.0F, -9.0F, 4.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 16).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(3.0F, -7.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(40, 22).addBox(3.0F, -11.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(34, 24).addBox(-5.0F, -7.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(32, 12).addBox(-2.0F, -8.0F, 5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(24, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(0, 4).addBox(-5.0F, -7.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(22, 24).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(36, 0).addBox(3.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone2.setTextureOffset(24, 36).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
