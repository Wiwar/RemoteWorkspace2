
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.test.itemgroup.MushokuItemGroup;
import net.mcreator.test.MushokuModElements;

@MushokuModElements.ModElement.Tag
public class SaintStoneItem extends MushokuModElements.ModElement {
	@ObjectHolder("mushoku:saint_stone")
	public static final Item block = null;

	public SaintStoneItem(MushokuModElements instance) {
		super(instance, 161);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MushokuItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("saint_stone");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
