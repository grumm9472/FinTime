package enchia.time.main.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class CrystalPickaxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof Level) {
			Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
		}
	}
}
