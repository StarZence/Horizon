
package net.mcreator.overthehorizon.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.overthehorizon.block.SteelblockBlock;
import net.mcreator.overthehorizon.OverthehorizonModElements;

@OverthehorizonModElements.ModElement.Tag
public class SteelChestplateItem extends OverthehorizonModElements.ModElement {
	@ObjectHolder("overthehorizon:steel_chestplate_helmet")
	public static final Item helmet = null;
	@ObjectHolder("overthehorizon:steel_chestplate_chestplate")
	public static final Item body = null;
	@ObjectHolder("overthehorizon:steel_chestplate_leggings")
	public static final Item legs = null;
	@ObjectHolder("overthehorizon:steel_chestplate_boots")
	public static final Item boots = null;
	public SteelChestplateItem(OverthehorizonModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 7, 2}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SteelblockBlock.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "steel_chestplate";
			}

			public float getToughness() {
				return 1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "overthehorizon:textures/models/armor/steel_chestplate_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("steel_chestplate_chestplate"));
	}
}
