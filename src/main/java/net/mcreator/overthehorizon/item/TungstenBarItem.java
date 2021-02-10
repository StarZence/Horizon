
package net.mcreator.overthehorizon.item;

@OverthehorizonModElements.ModElement.Tag
public class TungstenBarItem extends OverthehorizonModElements.ModElement {

	@ObjectHolder("overthehorizon:tungsten_bar")
	public static final Item block = null;

	public TungstenBarItem(OverthehorizonModElements instance) {
		super(instance, 17);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tungsten_bar");
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
