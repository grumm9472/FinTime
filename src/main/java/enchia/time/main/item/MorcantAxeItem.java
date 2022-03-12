
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class MorcantAxeItem extends AxeItem {
	public MorcantAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 520;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.MORCANT_GEM));
			}
		}, 1, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("morcant_axe");
	}
}