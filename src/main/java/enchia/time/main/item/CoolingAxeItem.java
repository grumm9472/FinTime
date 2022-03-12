
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import enchia.time.main.init.TimeModTabs;

public class CoolingAxeItem extends AxeItem {
	public CoolingAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 51f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 83;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("cooling_axe");
	}
}
