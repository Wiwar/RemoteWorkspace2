
package net.mcreator.test.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FlowGUIGuiWindow extends ContainerScreen<FlowGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = FlowGUIGui.guistate;

	public FlowGUIGuiWindow(FlowGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/screens/flow_gui.png");

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
		this.font.drawString(ms, "Flow", 74, 4, -16777216);
		this.font.drawString(ms, "Reflect incoming attacks back", 6, 31, -16777216);
		this.font.drawString(ms, "at your attacker", 7, 42, -16777216);
		this.font.drawString(ms, "Availible Skill Points : " + ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP) + "", 3, 15, -16777216);
		this.font.drawString(ms, "(Cost 50 Skill Points)", 26, 89, -16777216);
		this.font.drawString(ms, "Bind Skill", 57, 102, -16777216);
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
		this.addButton(new Button(this.guiLeft + 61, this.guiTop + -19, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FlowGUIGui.ButtonPressedMessage(0, x, y, z));
				FlowGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 41, this.guiTop + 66, 82, 20, new StringTextComponent("Unlock Flow"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FlowGUIGui.ButtonPressedMessage(1, x, y, z));
				FlowGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 5, this.guiTop + 114, 72, 20, new StringTextComponent("Skill One"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FlowGUIGui.ButtonPressedMessage(2, x, y, z));
				FlowGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 94, this.guiTop + 114, 72, 20, new StringTextComponent("Skill Two"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FlowGUIGui.ButtonPressedMessage(3, x, y, z));
				FlowGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 44, this.guiTop + 137, 82, 20, new StringTextComponent("Skill Three"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FlowGUIGui.ButtonPressedMessage(4, x, y, z));
				FlowGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
