
package net.mcreator.test.gui;

import net.mcreator.test.MushokuMod;

@OnlyIn(Dist.CLIENT)
public class ArmChopBindGUIGuiWindow extends ContainerScreen<ArmChopBindGUIGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = ArmChopBindGUIGui.guistate;

	public ArmChopBindGUIGuiWindow(ArmChopBindGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/screens/arm_chop_bind_gui.png");

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
		this.font.drawString(ms, "Arm Chop", 62, 10, -16777216);
		if (

		ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap()))
			this.font.drawString(ms, "Bind Skill", 56, 101, -16777216);
		this.font.drawString(ms, "Swing at your enemys arm,", 13, 23, -16777216);
		this.font.drawString(ms, "breifly disarming them and ", 13, 36, -16777216);
		this.font.drawString(ms, "causing damage", 12, 49, -16777216);
		if (

		ArmChopSkillAquireProcedure.executeProcedure(Collections.emptyMap()))
			this.font.drawString(ms, "(Skill Point Cost 50)", 27, 88, -16777216);
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

		this.addButton(new Button(this.guiLeft + 6, this.guiTop + 115, 72, 20, new StringTextComponent("Skill One"), e -> {
			if (

			ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap())) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ArmChopBindGUIGui.ButtonPressedMessage(0, x, y, z));
				ArmChopBindGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (

				ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap()))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 95, this.guiTop + 115, 72, 20, new StringTextComponent("Skill Two"), e -> {
			if (

			ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap())) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ArmChopBindGUIGui.ButtonPressedMessage(1, x, y, z));
				ArmChopBindGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (

				ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap()))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 44, this.guiTop + 139, 82, 20, new StringTextComponent("Skill Three"), e -> {
			if (

			ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap())) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ArmChopBindGUIGui.ButtonPressedMessage(2, x, y, z));
				ArmChopBindGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (

				ArmChopSkillButtCondProcedure.executeProcedure(Collections.emptyMap()))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 39, this.guiTop + 66, 87, 20, new StringTextComponent("Unlock Skill"), e -> {
			if (

			ArmChopSkillAquireProcedure.executeProcedure(Collections.emptyMap())) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ArmChopBindGUIGui.ButtonPressedMessage(3, x, y, z));
				ArmChopBindGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (

				ArmChopSkillAquireProcedure.executeProcedure(Collections.emptyMap()))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 57, this.guiTop + -19, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new ArmChopBindGUIGui.ButtonPressedMessage(4, x, y, z));
				ArmChopBindGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}

}
