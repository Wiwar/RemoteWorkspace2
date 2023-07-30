// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSkull extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bb_main;

	public ModelSkull() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(1, 1).addBox(0.0F, -7.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, -1.0F);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -7.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -8.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -9.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -9.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -11.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -9.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(2.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(2.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(1.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(0.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(1, 1).addBox(-1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		bone3.setTextureOffset(1, 1).addBox(2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(2.0F, -11.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(2.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(1.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(1.0F, -13.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(1.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(0.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(0.0F, -15.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(1, 1).addBox(2.0F, -13.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, 0.0F, 0.0F);
		bone2.addChild(bone4);
		bone4.setTextureOffset(1, 1).addBox(2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(1, 1).addBox(3.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -3.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -5.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -5.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -6.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -7.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -5.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -5.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -7.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -7.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -3.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -8.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -8.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -9.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -10.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -10.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -11.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -13.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -13.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -11.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(0.0F, -11.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -7.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -8.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -5.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -4.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -3.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(5.0F, -5.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(5.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(5.0F, -7.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(5.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -10.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -12.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -11.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -12.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -11.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -13.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -13.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -14.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -14.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -14.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-1.0F, -15.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -11.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -12.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -14.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -13.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -14.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -15.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(1.0F, -15.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -14.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -12.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(4.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -6.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(3.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(2.0F, -6.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -6.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -6.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -10.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -11.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-5.0F, -12.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -13.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-4.0F, -14.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-3.0F, -15.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 1).addBox(-2.0F, -15.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}