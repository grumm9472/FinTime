
package net.en_jia.minecraft.forge.tpwa.abyss.time.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.en_jia.minecraft.forge.tpwa.abyss.time.itemgroup.TIMEItemGroup;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModElements;

@TimeModElements.ModElement.Tag
public class RottenPieItem extends TimeModElements.ModElement {
	@ObjectHolder("time:rotten_pie")
	public static final Item block = null;

	public RottenPieItem(TimeModElements instance) {
		super(instance, 737);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(TIMEItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("rotten_pie");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
