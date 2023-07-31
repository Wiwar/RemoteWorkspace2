
package net.mcreator.test.itemgroup;

@MushokuModElements.ModElement.Tag
public class MushokuItemGroup extends MushokuModElements.ModElement {

	public MushokuItemGroup(MushokuModElements instance) {
		super(instance, 157);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmushoku") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GrimoireItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
