package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class SilentiaDirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.SILENTIA_GRASS.defaultBlockState(), 3);
		}
	}
}