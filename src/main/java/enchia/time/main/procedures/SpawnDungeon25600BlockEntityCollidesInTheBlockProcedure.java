package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class SpawnDungeon25600BlockEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.RADOMBLOCKO.defaultBlockState(), 3);
	}
}
