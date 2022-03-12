
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.fluid.PureWaterFluid;
import enchia.time.main.fluid.MINECRAFTYEARS100WATERFluid;
import enchia.time.main.fluid.IceWaterFluid;
import enchia.time.main.fluid.AcidFluid;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModFluids {
	private static final List<Fluid> REGISTRY = new ArrayList<>();
	public static final FlowingFluid PURE_WATER = register(new PureWaterFluid.Source());
	public static final FlowingFluid FLOWING_PURE_WATER = register(new PureWaterFluid.Flowing());
	public static final FlowingFluid MINECRAFTYEARS_100_WATER = register(new MINECRAFTYEARS100WATERFluid.Source());
	public static final FlowingFluid FLOWING_MINECRAFTYEARS_100_WATER = register(new MINECRAFTYEARS100WATERFluid.Flowing());
	public static final FlowingFluid ICE_WATER = register(new IceWaterFluid.Source());
	public static final FlowingFluid FLOWING_ICE_WATER = register(new IceWaterFluid.Flowing());
	public static final FlowingFluid ACID = register(new AcidFluid.Source());
	public static final FlowingFluid FLOWING_ACID = register(new AcidFluid.Flowing());

	private static FlowingFluid register(FlowingFluid fluid) {
		REGISTRY.add(fluid);
		return fluid;
	}

	@SubscribeEvent
	public static void registerFluids(RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Fluid[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PURE_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PURE_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MINECRAFTYEARS_100_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MINECRAFTYEARS_100_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ICE_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ICE_WATER, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ACID, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID, renderType -> renderType == RenderType.translucent());
		}
	}
}
