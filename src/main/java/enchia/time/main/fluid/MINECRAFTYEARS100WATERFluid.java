
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

public abstract class MINECRAFTYEARS100WATERFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TimeModFluids.MINECRAFTYEARS_100_WATER,
			() -> TimeModFluids.FLOWING_MINECRAFTYEARS_100_WATER,
			FluidAttributes.builder(new ResourceLocation("time:blocks/newwater100"), new ResourceLocation("time:blocks/newwater100"))

					.density(1115).viscosity(988)

	).explosionResistance(100f)

			.bucket(() -> TimeModItems.MINECRAFTYEARS_100_WATER_BUCKET).block(() -> (LiquidBlock) TimeModBlocks.MINECRAFTYEARS_100_WATER);

	private MINECRAFTYEARS100WATERFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MINECRAFTYEARS100WATERFluid {
		public Source() {
			super();
			setRegistryName("minecraftyears_100_water");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MINECRAFTYEARS100WATERFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_minecraftyears_100_water");
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
