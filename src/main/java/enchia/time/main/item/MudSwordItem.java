
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class MudSwordItem extends SwordItem {
	public MudSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 36;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.MUD_BALL));
			}
		}, 3, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("mud_sword");
	}
}
