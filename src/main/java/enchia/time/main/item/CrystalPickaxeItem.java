
package enchia.time.main.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import enchia.time.main.procedures.CrystalPickaxeBlockDestroyedWithToolProcedure;
import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class CrystalPickaxeItem extends PickaxeItem {
	public CrystalPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4028;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.CRYSTAL_GEM));
			}
		}, 1, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("crystal_pickaxe");
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		CrystalPickaxeBlockDestroyedWithToolProcedure.execute(world, x, y, z);
		return retval;
	}
}
