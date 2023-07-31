
package net.mcreator.test.item;

import net.minecraft.entity.ai.attributes.Attributes;

@MushokuModElements.ModElement.Tag
public class ImperialStoneItem extends MushokuModElements.ModElement {

	@ObjectHolder("mushoku:imperial_stone")
	public static final Item block = null;

	public ImperialStoneItem(MushokuModElements instance) {
		super(instance, 164);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MushokuItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("imperial_stone");
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
