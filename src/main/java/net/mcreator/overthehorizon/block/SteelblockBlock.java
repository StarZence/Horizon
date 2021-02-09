
package net.mcreator.overthehorizon.block;

import net.minecraft.block.material.Material;

@OverthehorizonModElements.ModElement.Tag
public class SteelblockBlock extends OverthehorizonModElements.ModElement {

	@ObjectHolder("overthehorizon:steelblock")
	public static final Block block = null;

	public SteelblockBlock(OverthehorizonModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.METAL).hardnessAndResistance(6f, 10f).lightValue(0).harvestLevel(2)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("steelblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
