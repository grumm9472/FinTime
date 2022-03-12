
package enchia.time.main.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import enchia.time.main.init.TimeModFluids;

public class MINECRAFTYEARS100WATERBlock extends LiquidBlock {
	public MINECRAFTYEARS100WATERBlock() {
		super(TimeModFluids.MINECRAFTYEARS_100_WATER, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("minecraftyears_100_water");
	}
}
