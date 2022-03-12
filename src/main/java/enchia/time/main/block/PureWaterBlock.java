
package enchia.time.main.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import enchia.time.main.init.TimeModFluids;

public class PureWaterBlock extends LiquidBlock {
	public PureWaterBlock() {
		super(TimeModFluids.PURE_WATER, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("pure_water");
	}
}
