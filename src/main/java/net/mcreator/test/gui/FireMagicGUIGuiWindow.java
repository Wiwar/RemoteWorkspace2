
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
public class FireMagicGUIGuiWindow extends ContainerScreen<FireMagicGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = FireMagicGUIGui.guistate;

	public FireMagicGUIGuiWindow(FireMagicGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mushoku:textures/screens/bookback.png"));
		this.blit(ms, this.guiLeft + -43, this.guiTop + -9, 0, 0, 271, 180, 271, 180);

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
		this.font.drawString(ms, "Elementary", -2, 7, -3407872);
		this.font.drawString(ms, "Fireball", -11, 16, -16777216);
		this.font.drawString(ms, "Heat Hand", -11, 25, -16777216);
		this.font.drawString(ms, "Burning Place", -11, 34, -16777216);
		this.font.drawString(ms, "Intermediate", -2, 52, -3407872);
		this.font.drawString(ms, "Explosion", -11, 61, -16777216);
		this.font.drawString(ms, "Flamethrower", -11, 70, -16777216);
		this.font.drawString(ms, "Flame Slice", -11, 79, -16777216);
		this.font.drawString(ms, "Ex Flame", -11, 88, -16777216);
		this.font.drawString(ms, "Advanced", 132, 7, -3407872);
		this.font.drawString(ms, "Exodus Flame", 123, 16, -16777216);
		this.font.drawString(ms, "Magma Gush", 123, 25, -16777216);
		this.font.drawString(ms, "Saint", 132, 43, -3407872);
		this.font.drawString(ms, "Flash Over", 123, 52, -16777216);
		this.font.drawString(ms, "Mine Field", 123, 79, -16777216);
		this.font.drawString(ms, "King", 132, 70, -3407872);
		this.font.drawString(ms, "Imperial", 132, 97, -3407872);
		this.font.drawString(ms, "Nuclear Strike", 123, 106, -16777216);
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
		this.addButton(new Button(this.guiLeft + -20, this.guiTop + 133, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new FireMagicGUIGui.ButtonPressedMessage(0, x, y, z));
				FireMagicGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
