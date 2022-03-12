
package enchia.time.main.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import enchia.time.main.procedures.PhagocytosispickaxeToolInInventoryTickProcedure;
import enchia.time.main.init.TimeModTabs;

public class PhagocytosispickaxeItem extends PickaxeItem {
	public PhagocytosispickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 111111;
			}

			public float getSpeed() {
				return 111111f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 111111;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.STONE));
			}
		}, 1, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("phagocytosispickaxe");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		PhagocytosispickaxeToolInInventoryTickProcedure.execute(entity);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
