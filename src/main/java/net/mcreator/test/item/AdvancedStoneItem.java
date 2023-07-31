
package net.mcreator.test.item;

import net.minecraft.entity.ai.attributes.Attributes;

@MushokuModElements.ModElement.Tag
public class AdvancedStoneItem extends MushokuModElements.ModElement {

	@ObjectHolder("mushoku:advanced_stone")
	public static final Item block = null;

	public AdvancedStoneItem(MushokuModElements instance) {
		super(instance, 160);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MushokuItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("advanced_stone");
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
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
