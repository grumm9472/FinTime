
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import java.util.Set;
import java.util.HashSet;

import enchia.time.main.procedures.SkyPlayerEntersDimensionProcedure;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class SkyDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(Blocks.STONE);
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("mushroom_fields")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("mushroom_fields")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("mountains")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("mountains")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("forest")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("forest")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_mountains")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_mountains")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_spruce_taiga")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_spruce_taiga")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("birch_forest")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("birch_forest")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("cold_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("cold_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("deep_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("deep_ocean")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_spruce_taiga_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_spruce_taiga_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("bamboo_jungle")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("bamboo_jungle")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_badlands_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_badlands_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("dark_forest")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("dark_forest")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("plains")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("plains")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("jungle_edge")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("jungle_edge")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("savanna")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("savanna")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_beach")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_beach")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("savanna_plateau")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("savanna_plateau")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_taiga_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_taiga_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_tree_taiga_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_tree_taiga_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("shattered_savanna")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("shattered_savanna")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("bamboo_jungle_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("bamboo_jungle_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("taiga")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("taiga")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("wooded_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("wooded_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("swamp")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("swamp")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("birch_forest_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("birch_forest_hills")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_taiga")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("snowy_taiga")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_gravelly_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_gravelly_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("eroded_badlands")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("eroded_badlands")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_wooded_badlands_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("modified_wooded_badlands_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("badlands")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("badlands")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("shattered_savanna_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("shattered_savanna_plateau")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("ocean")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("ocean")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_tree_taiga")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("giant_tree_taiga")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("river")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("river")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("stone_shore")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("stone_shore")).getGenerationSettings().getSurfaceBuilder()
					.get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("desert")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("desert")).getGenerationSettings().getSurfaceBuilder().get()
					.config().getUnderMaterial().getBlock());
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
					return new Vec3(0.8, 1, 0.8);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("time:sky"), customEffect));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("time:sky"))) {

			SkyPlayerEntersDimensionProcedure.execute(world, x, y, z);
		}
	}
}
