package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModEnchantments;

public class GreatHammerToolInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(TimeModEnchantments.HAMMER, itemstack) != 0) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
		} else {
			(itemstack).enchant(TimeModEnchantments.HAMMER, 3);
		}
	}
}
