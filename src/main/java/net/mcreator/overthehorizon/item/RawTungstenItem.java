
package net.mcreator.overthehorizon.item;

@OverthehorizonModElements.ModElement.Tag
public class RawTungstenItem extends OverthehorizonModElements.ModElement {

	@ObjectHolder("overthehorizon:raw_tungsten")
	public static final Item block = null;

	public RawTungstenItem(OverthehorizonModElements instance) {
		super(instance, 15);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(32).rarity(Rarity.COMMON));
			setRegistryName("raw_tungsten");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("It's heavy isn't it?"));
		}

	}

}
