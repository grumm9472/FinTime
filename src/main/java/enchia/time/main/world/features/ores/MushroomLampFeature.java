
package enchia.time.main.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Random;

import enchia.time.main.init.TimeModBlocks;

public class MushroomLampFeature extends OreFeature {
	public static final MushroomLampFeature FEATURE = (MushroomLampFeature) new MushroomLampFeature().setRegistryName("time:mushroom_lamp");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(MushroomLampFeatureRuleTest.INSTANCE, TimeModBlocks.MUSHROOM_LAMP.defaultBlockState(), 32))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)))).squared().count(32);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public MushroomLampFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("time:mcy_1600")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class MushroomLampFeatureRuleTest extends RuleTest {
		static final MushroomLampFeatureRuleTest INSTANCE = new MushroomLampFeatureRuleTest();
		static final com.mojang.serialization.Codec<MushroomLampFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<MushroomLampFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("time:mushroom_lamp_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == TimeModBlocks.MUSHROOMTREEBLUE)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.MUSHROOMTREEGREEN)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.BIGMUSHROOM_2)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.GLOW_MUSHROOM)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.BIGMUSHROOM)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.YELLOW_MUSHROOM)
				blockCriteria = true;
			if (blockAt.getBlock() == TimeModBlocks.RED_MUSHROOM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.RED_MUSHROOM_BLOCK)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
