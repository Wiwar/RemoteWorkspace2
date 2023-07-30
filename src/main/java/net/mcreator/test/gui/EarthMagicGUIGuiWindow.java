
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

import net.mcreator.test.MushokuMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EarthMagicGUIGuiWindow extends ContainerScreen<EarthMagicGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = EarthMagicGUIGui.guistate;

	public EarthMagicGUIGuiWindow(EarthMagicGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mushoku:textures/bookback.png"));
		this.blit(ms, this.guiLeft + -38, this.guiTop + -11, 0, 0, 271, 180, 271, 180);

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
		this.font.drawString(ms, "Elementary", 6, 7, -6724096);
		this.font.drawString(ms, "Rock Bullet", -11, 16, -16777216);
		this.font.drawString(ms, "Earth Blade", -11, 25, -16777216);
		this.font.drawString(ms, "Dig", -11, 34, -16777216);
		this.font.drawString(ms, "Intermediate", 6, 52, -6724096);
		this.font.drawString(ms, "Stone Cannon", -11, 61, -16777216);
		this.font.drawString(ms, "Earth Pillar", -11, 70, -16777216);
		this.font.drawString(ms, "Earth Lance", -11, 79, -16777216);
		this.font.drawString(ms, "Advanced", 141, 7, -6724096);
		this.font.drawString(ms, "Earth Fortress", 114, 16, -16777216);
		this.font.drawString(ms, "Earth Wall", 114, 25, -16777216);
		this.font.drawString(ms, "Earth Hedgehog", 114, 34, -16777216);
		this.font.drawString(ms, "Saint", 141, 52, -6724096);
		this.font.drawString(ms, "SandStorm", 114, 61, -16777216);
		this.font.drawString(ms, "King", 141, 79, -6724096);
		this.font.drawString(ms, "Desert Storm", 114, 88, -16777216);
		this.font.drawString(ms, "Imperial", 141, 106, -6724096);
		this.font.drawString(ms, "Mountain", 114, 115, -16777216);
		this.font.drawString(ms, "Earth Drill", 114, 124, -16777216);
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
		this.addButton(new Button(this.guiLeft + -11, this.guiTop + 133, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new EarthMagicGUIGui.ButtonPressedMessage(0, x, y, z));
				EarthMagicGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
