
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class ColdSteelHoeItem extends HoeItem {
	public ColdSteelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 98;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.COLD_STEEL_INGOT));
			}
		}, 0, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("cold_steel_hoe");
	}
}
