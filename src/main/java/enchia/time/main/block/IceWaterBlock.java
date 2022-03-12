
package enchia.time.main.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import enchia.time.main.init.TimeModFluids;

public class IceWaterBlock extends LiquidBlock {
	public IceWaterBlock() {
		super(TimeModFluids.ICE_WATER, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("ice_water");
	}
}
