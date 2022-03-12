
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class WhitediamondPickaxeItem extends PickaxeItem {
	public WhitediamondPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1800;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.WHITEDIAMOND_GEM));
			}
		}, 1, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("whitediamond_pickaxe");
	}
}
