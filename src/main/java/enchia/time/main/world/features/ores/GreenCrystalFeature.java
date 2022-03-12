
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
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Random;

import enchia.time.main.init.TimeModBlocks;

public class GreenCrystalFeature extends OreFeature {
	public static final GreenCrystalFeature FEATURE = (GreenCrystalFeature) new GreenCrystalFeature().setRegistryName("time:green_crystal");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(GreenCrystalFeatureRuleTest.INSTANCE, TimeModBlocks.GREEN_CRYSTAL.defaultBlockState(), 16))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)))).squared().count(12);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public GreenCrystalFeature() {
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

	private static class GreenCrystalFeatureRuleTest extends RuleTest {
		static final GreenCrystalFeatureRuleTest INSTANCE = new GreenCrystalFeatureRuleTest();
		static final com.mojang.serialization.Codec<GreenCrystalFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<GreenCrystalFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("time:green_crystal_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == TimeModBlocks.MCY_1600_STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
