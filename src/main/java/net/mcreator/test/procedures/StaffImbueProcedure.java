package net.mcreator.test.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.mcreator.test.MushokuMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class StaffImbueProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MushokuMod.LOGGER.warn("Failed to load dependency entity for procedure StaffImbue!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MushokuMod.LOGGER.warn("Failed to load dependency guistate for procedure StaffImbue!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1)))).setDisplayName(new StringTextComponent((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:ImbueStaff");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText())));
	}
}
