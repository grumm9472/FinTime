package enchia.time.main.world.features.treedecorators;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.core.BlockPos;

import java.util.function.BiConsumer;
import java.util.Random;
import java.util.List;

public class IceLeaveDecorator extends LeaveVineDecorator {
	public static final IceLeaveDecorator INSTANCE = new IceLeaveDecorator();
	public static com.mojang.serialization.Codec<LeaveVineDecorator> codec;
	public static TreeDecoratorType<?> tdt;
	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("ice_tree_leave_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos,
			List<BlockPos> listBlockPos2) {
		listBlockPos2.forEach((blockpos) -> {
			if (random.nextInt(4) == 0) {
				BlockPos bp = blockpos.below();
				if (Feature.isAir(level, bp)) {
					addVine(level, bp, biConsumer);
				}
			}
		});
	}

	private static void addVine(LevelSimulatedReader levelReader, BlockPos blockPos, BiConsumer<BlockPos, BlockState> biConsumer) {
		biConsumer.accept(blockPos, Blocks.AIR.defaultBlockState());
		int i = 4;
		for (BlockPos blockpos = blockPos.below(); Feature.isAir(levelReader, blockpos) && i > 0; --i) {
			biConsumer.accept(blockpos, Blocks.AIR.defaultBlockState());
			blockpos = blockpos.below();
		}
	}
}
