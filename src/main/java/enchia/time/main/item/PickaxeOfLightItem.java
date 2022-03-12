
package enchia.time.main.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class PickaxeOfLightItem extends PickaxeItem {
	public PickaxeOfLightItem() {
		super(new Tier() {
			public int getUses() {
				return 1;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 300;
			}

			public int getEnchantmentValue() {
				return 8;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 7.7f, new Item.Properties().tab(TimeModTabs.TAB_TIME).fireResistant());
		setRegistryName("pickaxe_of_light");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
