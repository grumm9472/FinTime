
package net.en_jia.minecraft.forge.tpwa.abyss.time.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.en_jia.minecraft.forge.tpwa.abyss.time.itemgroup.TIMEItemGroup;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModElements;

@TimeModElements.ModElement.Tag
public class NetherrackShovelItem extends TimeModElements.ModElement {
	@ObjectHolder("time:netherrack_shovel")
	public static final Item block = null;

	public NetherrackShovelItem(TimeModElements instance) {
		super(instance, 135);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 152;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.NETHERRACK));
			}
		}, 1, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("netherrack_shovel"));
	}
}