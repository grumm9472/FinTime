
package enchia.time.main.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class GlowstoneStairsBlock extends StairBlock {
	public GlowstoneStairsBlock() {
		super(() -> new Block(
				BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.2f, 10f).lightLevel(s -> 15).dynamicShape())
						.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.2f, 10f).lightLevel(s -> 15).dynamicShape());
		setRegistryName("glowstone_stairs");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
