package net.mcreator.overthehorizon.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.overthehorizon.OverthehorizonModElements;

import java.util.Map;

@OverthehorizonModElements.ModElement.Tag
public class SteelRepeaterRangedItemUsedProcedure extends OverthehorizonModElements.ModElement {
	public SteelRepeaterRangedItemUsedProcedure(OverthehorizonModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SteelRepeaterRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() < 30)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.ARROW, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
