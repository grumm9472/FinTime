
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

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TimeModFluids.ACID,
			() -> TimeModFluids.FLOWING_ACID, FluidAttributes
					.builder(new ResourceLocation("time:blocks/newwater1600"), new ResourceLocation("time:blocks/newwater1600")).luminosity(100)

	).explosionResistance(100f)

			.bucket(() -> TimeModItems.ACID_BUCKET).block(() -> (LiquidBlock) TimeModBlocks.ACID);

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public Source() {
			super();
			setRegistryName("acid");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_acid");
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
