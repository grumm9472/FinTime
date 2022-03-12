
package enchia.time.main.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import enchia.time.main.init.TimeModItems;
import enchia.time.main.init.TimeModFluids;
import enchia.time.main.init.TimeModBlocks;

public abstract class PureWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TimeModFluids.PURE_WATER,
			() -> TimeModFluids.FLOWING_PURE_WATER,
			FluidAttributes.builder(new ResourceLocation("time:blocks/newwater102400"), new ResourceLocation("time:blocks/newwater102400"))

	).explosionResistance(100f)

			.bucket(() -> TimeModItems.PURE_WATER_BUCKET).block(() -> (LiquidBlock) TimeModBlocks.PURE_WATER);

	private PureWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PureWaterFluid {
		public Source() {
			super();
			setRegistryName("pure_water");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PureWaterFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_pure_water");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
