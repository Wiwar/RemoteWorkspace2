
package net.mcreator.test.gui;

import net.mcreator.test.MushokuMod;

@OnlyIn(Dist.CLIENT)
public class SwordStyleInitialPickGuiWindow extends ContainerScreen<SwordStyleInitialPickGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = SwordStyleInitialPickGui.guistate;

	public SwordStyleInitialPickGuiWindow(SwordStyleInitialPickGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/screens/sword_style_initial_pick.png");

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
		this.font.drawString(ms, "Choose a Style", 51, 7, -16777216);
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

		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 34, 103, 20, new StringTextComponent("Sword God Style"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordStyleInitialPickGui.ButtonPressedMessage(0, x, y, z));
				SwordStyleInitialPickGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 70, 103, 20, new StringTextComponent("Water God Style"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordStyleInitialPickGui.ButtonPressedMessage(1, x, y, z));
				SwordStyleInitialPickGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 106, 103, 20, new StringTextComponent("North God Style"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new SwordStyleInitialPickGui.ButtonPressedMessage(2, x, y, z));
				SwordStyleInitialPickGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}

}
