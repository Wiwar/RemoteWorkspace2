
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

import net.mcreator.test.procedures.LsOSSkillButtCondProcedure;
import net.mcreator.test.procedures.LsOSSkillAquireProcedure;
import net.mcreator.test.MushokuModVariables;
import net.mcreator.test.MushokuMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LsOSGUIGuiWindow extends ContainerScreen<LsOSGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = LsOSGUIGui.guistate;

	public LsOSGUIGuiWindow(LsOSGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mushoku:textures/screens/ls_osgui.png");

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
		this.font.drawString(ms, "Longsword of Silence", 29, 9, -16777216);
		if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Bind Skill", 56, 101, -16777216);
		this.font.drawString(ms, "Swing your sword at past", 13, 23, -16777216);
		this.font.drawString(ms, "the speed of sound", 12, 35, -16777216);
		if (LsOSSkillAquireProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "(Skill Point Cost 200)", 27, 88, -16777216);
		if (LsOSSkillAquireProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
			this.font.drawString(ms, "Availible Skill Points : " + ((entity.getCapability(MushokuModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MushokuModVariables.PlayerVariables())).TechniqueSP) + "", 5, 51, -16777216);
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
			if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				MushokuMod.PACKET_HANDLER.sendToServer(new LsOSGUIGui.ButtonPressedMessage(0, x, y, z));
				LsOSGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 95, this.guiTop + 115, 72, 20, new StringTextComponent("Skill Two"), e -> {
			if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				MushokuMod.PACKET_HANDLER.sendToServer(new LsOSGUIGui.ButtonPressedMessage(1, x, y, z));
				LsOSGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 44, this.guiTop + 139, 82, 20, new StringTextComponent("Skill Three"), e -> {
			if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				MushokuMod.PACKET_HANDLER.sendToServer(new LsOSGUIGui.ButtonPressedMessage(2, x, y, z));
				LsOSGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (LsOSSkillButtCondProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 39, this.guiTop + 65, 87, 20, new StringTextComponent("Unlock Skill"), e -> {
			if (LsOSSkillAquireProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				MushokuMod.PACKET_HANDLER.sendToServer(new LsOSGUIGui.ButtonPressedMessage(3, x, y, z));
				LsOSGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (LsOSSkillAquireProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 57, this.guiTop + -19, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				MushokuMod.PACKET_HANDLER.sendToServer(new LsOSGUIGui.ButtonPressedMessage(4, x, y, z));
				LsOSGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
