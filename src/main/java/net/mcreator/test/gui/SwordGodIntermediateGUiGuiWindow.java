
package net.mcreator.test.gui;

import net.mcreator.test.MushokuMod;

@OnlyIn(Dist.CLIENT)
public class SwordGodIntermediateGUiGuiWindow extends ContainerScreen<SwordGodIntermediateGUiGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = SwordGodIntermediateGUiGui.guistate;

	public SwordGodIntermediateGUiGuiWindow(SwordGodIntermediateGUiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/screens/sword_god_intermediate_g_ui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Intermediate", 54, 4, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);

		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 41, 66, 20, new StringTextComponent("Arm Chop"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordGodIntermediateGUiGui.ButtonPressedMessage(0, x, y, z));
				SwordGodIntermediateGUiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 59, this.guiTop + -20, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordGodIntermediateGUiGui.ButtonPressedMessage(1, x, y, z));
				SwordGodIntermediateGUiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 42, this.guiTop + 97, 87, 20, new StringTextComponent("Quick Stikes"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordGodIntermediateGUiGui.ButtonPressedMessage(2, x, y, z));
				SwordGodIntermediateGUiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}

}
