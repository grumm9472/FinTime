
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class ObsdiamonSwordItem extends SwordItem {
	public ObsdiamonSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 706;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 29;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.OBSDIAMOND));
			}
		}, 3, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("obsdiamon_sword");
	}
}
