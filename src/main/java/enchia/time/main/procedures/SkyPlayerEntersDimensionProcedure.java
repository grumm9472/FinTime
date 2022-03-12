package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class SkyPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) (y - 3), (int) z), TimeModBlocks.BACK_PORTAL_SKY.defaultBlockState(), 3);
	}
}
