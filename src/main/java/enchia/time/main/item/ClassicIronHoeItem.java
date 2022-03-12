
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class ClassicIronHoeItem extends HoeItem {
	public ClassicIronHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.CLASSIC_IRON));
			}
		}, 0, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("classic_iron_hoe");
	}
}
