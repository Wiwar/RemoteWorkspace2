
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
public class GrimoireGuiGuiWindow extends ContainerScreen<GrimoireGuiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = GrimoireGuiGui.guistate;

	public GrimoireGuiGuiWindow(GrimoireGuiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
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
		this.blit(ms, this.guiLeft + -47, this.guiTop + -11, 0, 0, 271, 180, 271, 180);

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
		this.font.drawString(ms, "Grimoire", -2, -2, -16777216);
		this.font.drawString(ms, "Elements", 132, -2, -16777216);
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
		this.addButton(new Button(this.guiLeft + -11, this.guiTop + 43, 82, 20, new StringTextComponent("Water Magic"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new GrimoireGuiGui.ButtonPressedMessage(0, x, y, z));
				GrimoireGuiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -11, this.guiTop + 97, 77, 20, new StringTextComponent("Fire Magic"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new GrimoireGuiGui.ButtonPressedMessage(1, x, y, z));
				GrimoireGuiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 43, 82, 20, new StringTextComponent("Earth Magic"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new GrimoireGuiGui.ButtonPressedMessage(2, x, y, z));
				GrimoireGuiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 97, 82, 20, new StringTextComponent("Wind Magic"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new GrimoireGuiGui.ButtonPressedMessage(3, x, y, z));
				GrimoireGuiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
