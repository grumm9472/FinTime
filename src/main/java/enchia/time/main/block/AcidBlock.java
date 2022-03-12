
package enchia.time.main.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import enchia.time.main.init.TimeModFluids;

public class AcidBlock extends LiquidBlock {
	public AcidBlock() {
		super(TimeModFluids.ACID, BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
		setRegistryName("acid");
	}
}
