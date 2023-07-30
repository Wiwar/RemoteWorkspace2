// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsmall_orb extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelsmall_orb() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 14).addBox(-3.0F, -5.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 10).addBox(-1.0F, -7.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(8, 15).addBox(3.0F, -5.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(9, 11).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(15, 0).addBox(-1.0F, -5.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 15).addBox(-1.0F, -5.0F, -4.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -6.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
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