
package enchia.time.main.world.features.plants;

import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HeightmapConfiguration;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.DefaultFlowerFeature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import java.util.Set;

import enchia.time.main.init.TimeModBlocks;

public class PrairieSageFeature extends DefaultFlowerFeature {
	public static final PrairieSageFeature FEATURE = (PrairieSageFeature) new PrairieSageFeature().setRegistryName("time:prairie_sage");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(
					new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(TimeModBlocks.PRAIRIE_SAGE.defaultBlockState()),
							SimpleBlockPlacer.INSTANCE).tries(64)

									.build())
			.decorated(FeatureDecorator.HEIGHTMAP.configured(new HeightmapConfiguration(Heightmap.Types.MOTION_BLOCKING))).squared().rarity(32)
			.count(5);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public PrairieSageFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("time:mcy_400")))
			dimensionCriteria = true;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("time:mcy_400_underground")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}
}
