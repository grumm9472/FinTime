package enchia.time.main.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlazingBowBulletHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) x, (int) y, (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}
