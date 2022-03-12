
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class NetheronAlloyHoeItem extends HoeItem {
	public NetheronAlloyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3072;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.NETHERON));
			}
		}, 0, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("netheron_alloy_hoe");
	}
}
