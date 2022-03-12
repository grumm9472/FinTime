package enchia.time.main.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModItems;

public class MineralizationScrollRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(TimeModItems.MINERALIZATION_SCROLL);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.STONE) {
			if (Math.random() < 0.3) {
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.COAL_ORE.defaultBlockState(), 3);
			} else {
				if (Math.random() < 0.3) {
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.IRON_ORE.defaultBlockState(), 3);
				} else {
					if (Math.random() < 0.3) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.REDSTONE_ORE.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.3) {
							world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.GOLD_ORE.defaultBlockState(), 3);
						} else {
							if (Math.random() < 0.3) {
								world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.LAPIS_ORE.defaultBlockState(), 3);
							} else {
								if (Math.random() < 0.3) {
									world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.LAPIS_ORE.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
