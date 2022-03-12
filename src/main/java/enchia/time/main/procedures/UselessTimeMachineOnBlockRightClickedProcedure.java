package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModItems;
import enchia.time.main.init.TimeModBlocks;

public class UselessTimeMachineOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(TimeModItems.POWERED_CHAOS_CRYSTAL))
				: false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TimeModItems.POWERED_CHAOS_CRYSTAL);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.TIME_MACHINE.defaultBlockState(), 3);
		}
	}
}
