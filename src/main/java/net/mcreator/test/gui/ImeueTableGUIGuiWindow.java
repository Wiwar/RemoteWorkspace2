
package net.mcreator.test.gui;

import net.mcreator.test.MushokuMod;

@OnlyIn(Dist.CLIENT)
public class ImeueTableGUIGuiWindow extends ContainerScreen<ImeueTableGUIGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = ImeueTableGUIGui.guistate;

	TextFieldWidget ImbueStaff;

	public ImeueTableGUIGuiWindow(ImeueTableGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/imeue_table_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

		ImbueStaff.render(ms, mouseX, mouseY, partialTicks);
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

		if (ImbueStaff.isFocused())
			return ImbueStaff.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		ImbueStaff.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
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

		ImbueStaff = new TextFieldWidget(this.font, this.guiLeft + 26, this.guiTop + 12, 120, 20, new StringTextComponent("Imbue Staff")) {
			{
				setSuggestion("Imbue Staff");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);

				if (getText().isEmpty())
					setSuggestion("Imbue Staff");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);

				if (getText().isEmpty())
					setSuggestion("Imbue Staff");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:ImbueStaff", ImbueStaff);
		ImbueStaff.setMaxStringLength(32767);
		this.children.add(this.ImbueStaff);
		this.addButton(new Button(this.guiLeft + 92, this.guiTop + 44, 51, 20, new StringTextComponent("Imbue"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ImeueTableGUIGui.ButtonPressedMessage(0, x, y, z));
				ImeueTableGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}

}
