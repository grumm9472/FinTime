
package enchia.time.main.world.dimension;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import java.util.Set;
import java.util.HashSet;

import enchia.time.main.procedures.MCY400PlayerEntersDimensionProcedure;
import enchia.time.main.init.TimeModBlocks;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class MCY400Dimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(TimeModBlocks.MCY_400_STONE);
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("frozen_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("frozen_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("frozen_river")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("frozen_river")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:icemountain")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:icemountain")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("ice_spikes")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("ice_spikes")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:snow_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:snow_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400_forest_two")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400_forest_two")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:ice")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:ice")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("deep_frozen_ocean")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("deep_frozen_ocean")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400f_orest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("time:mcy_400f_orest")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.4, 0.4, 1);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("time:mcy_400"), customEffect));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("time:mcy_400"))) {

			MCY400PlayerEntersDimensionProcedure.execute(entity);
		}
	}
}
