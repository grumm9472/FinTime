package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class MCY102400DirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.1) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.MCY_102400_GRASS.defaultBlockState(), 3);
		}
	}
}
