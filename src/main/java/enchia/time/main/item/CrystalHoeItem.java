
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class CrystalHoeItem extends HoeItem {
	public CrystalHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4028;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.CRYSTAL_GEM));
			}
		}, 0, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("crystal_hoe");
	}
}
