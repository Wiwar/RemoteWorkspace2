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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}