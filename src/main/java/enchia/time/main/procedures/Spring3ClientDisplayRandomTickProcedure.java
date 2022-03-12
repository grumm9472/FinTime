package enchia.time.main.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class Spring3ClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.56) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.SPRING.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), TimeModBlocks.TIME_MACHINE_WALL.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
