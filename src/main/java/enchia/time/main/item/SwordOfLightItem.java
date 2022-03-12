
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class SwordOfLightItem extends SwordItem {
	public SwordOfLightItem() {
		super(new Tier() {
			public int getUses() {
				return 1;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 99997f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 15.200000000000003f, new Item.Properties().tab(TimeModTabs.TAB_TIME).fireResistant());
		setRegistryName("sword_of_light");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
