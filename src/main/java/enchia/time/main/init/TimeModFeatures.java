
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import enchia.time.main.world.features.plants.WoodsiaFeature;
import enchia.time.main.world.features.plants.WhiteRuzovaFeature;
import enchia.time.main.world.features.plants.TurtleheadFeature;
import enchia.time.main.world.features.plants.StrawberriesPlantFeature;
import enchia.time.main.world.features.plants.ShurbFeature;
import enchia.time.main.world.features.plants.PrairieSageFeature;
import enchia.time.main.world.features.plants.MoonGrassFeature;
import enchia.time.main.world.features.plants.MoonGrass5Feature;
import enchia.time.main.world.features.plants.MoonGrass4Feature;
import enchia.time.main.world.features.plants.MoonGrass3Feature;
import enchia.time.main.world.features.plants.MoonGrass1Feature;
import enchia.time.main.world.features.plants.MagicSugercaneFeature;
import enchia.time.main.world.features.plants.MCY100GrassFeature;
import enchia.time.main.world.features.plants.IceGrassFeature;
import enchia.time.main.world.features.plants.IceFlowerFeature;
import enchia.time.main.world.features.plants.HydrangeaRedFeature;
import enchia.time.main.world.features.plants.Glowshroom2Feature;
import enchia.time.main.world.features.plants.GlowMushroomFeature;
import enchia.time.main.world.features.plants.GingerFeature;
import enchia.time.main.world.features.plants.GhoulItemPlant2Feature;
import enchia.time.main.world.features.plants.GhoulItemPlant1Feature;
import enchia.time.main.world.features.plants.FrozenFlowerFeature;
import enchia.time.main.world.features.plants.FrostyReedsFeature;
import enchia.time.main.world.features.plants.Ether6Feature;
import enchia.time.main.world.features.plants.Ether5Feature;
import enchia.time.main.world.features.plants.Ether4Feature;
import enchia.time.main.world.features.plants.Ether3Feature;
import enchia.time.main.world.features.plants.Ether2Feature;
import enchia.time.main.world.features.plants.CucturFeature;
import enchia.time.main.world.features.plants.CentellaFeature;
import enchia.time.main.world.features.plants.CactusFeature;
import enchia.time.main.world.features.plants.Cactus400Feature;
import enchia.time.main.world.features.plants.Cactus2Feature;
import enchia.time.main.world.features.plants.BellFlowerFeature;
import enchia.time.main.world.features.ores.WitherBoneOreFeature;
import enchia.time.main.world.features.ores.WhitediamondOreFeature;
import enchia.time.main.world.features.ores.WhiteGlowstoneFeature;
import enchia.time.main.world.features.ores.WhiteCrystalFeature;
import enchia.time.main.world.features.ores.TinOreFeature;
import enchia.time.main.world.features.ores.TimeGemOreFeature;
import enchia.time.main.world.features.ores.TerameriaiumoreFeature;
import enchia.time.main.world.features.ores.StoneGrassFeature;
import enchia.time.main.world.features.ores.SpawnDungeon25600BlockFeature;
import enchia.time.main.world.features.ores.SpaceGemOreFeature;
import enchia.time.main.world.features.ores.RuneOreFeature;
import enchia.time.main.world.features.ores.RedGlowstoneFeature;
import enchia.time.main.world.features.ores.RedCrystalFeature;
import enchia.time.main.world.features.ores.PurplppeGlowstoneFeature;
import enchia.time.main.world.features.ores.PinkSandFeature;
import enchia.time.main.world.features.ores.PinkGlowstoneFeature;
import enchia.time.main.world.features.ores.PinkCrystalFeature;
import enchia.time.main.world.features.ores.PerafriumOreFeature;
import enchia.time.main.world.features.ores.NetheronoreFeature;
import enchia.time.main.world.features.ores.NetherGrassFeature;
import enchia.time.main.world.features.ores.NetherDirtFeature;
import enchia.time.main.world.features.ores.MushroomLampFeature;
import enchia.time.main.world.features.ores.MudBlockFeature;
import enchia.time.main.world.features.ores.MossyStoneFeature;
import enchia.time.main.world.features.ores.MorcantOreFeature;
import enchia.time.main.world.features.ores.MistarilleOreFeature;
import enchia.time.main.world.features.ores.MCY400UndergroundPortalFeature;
import enchia.time.main.world.features.ores.MCY400GroundPortalFeature;
import enchia.time.main.world.features.ores.MCY400EmeraldOreFeature;
import enchia.time.main.world.features.ores.MCY400DiamondOreFeature;
import enchia.time.main.world.features.ores.MCY1600EmeraldOreFeature;
import enchia.time.main.world.features.ores.MCY1600DiamondOreFeature;
import enchia.time.main.world.features.ores.MCY102400SmoothStoneFeature;
import enchia.time.main.world.features.ores.MCY100EmeraldOreFeature;
import enchia.time.main.world.features.ores.MCY100CoalOreFeature;
import enchia.time.main.world.features.ores.LimeGreenCrystalFeature;
import enchia.time.main.world.features.ores.LightRockFeature;
import enchia.time.main.world.features.ores.JadeOreFeature;
import enchia.time.main.world.features.ores.IchorOreFeature;
import enchia.time.main.world.features.ores.IceCrystalFeature;
import enchia.time.main.world.features.ores.IceBlueCrystalFeature;
import enchia.time.main.world.features.ores.HealthystoneorenetherFeature;
import enchia.time.main.world.features.ores.HealthyStoneOreFeature;
import enchia.time.main.world.features.ores.HardboneOreFeature;
import enchia.time.main.world.features.ores.GreenGlowstoneFeature;
import enchia.time.main.world.features.ores.GreenCrystalFeature;
import enchia.time.main.world.features.ores.GoldenCoalOreFeature;
import enchia.time.main.world.features.ores.GlowingIceFeature;
import enchia.time.main.world.features.ores.GhoulMatterFeature;
import enchia.time.main.world.features.ores.GhoulLampFeature;
import enchia.time.main.world.features.ores.FrozenSandFeature;
import enchia.time.main.world.features.ores.FrozenCoalOreFeature;
import enchia.time.main.world.features.ores.FragileGhoulStoneFeature;
import enchia.time.main.world.features.ores.FishOreFeature;
import enchia.time.main.world.features.ores.FakeCoalFeature;
import enchia.time.main.world.features.ores.FakeBedrockFeature;
import enchia.time.main.world.features.ores.DimensionGemOreFeature;
import enchia.time.main.world.features.ores.DesertEmeraldOreFeature;
import enchia.time.main.world.features.ores.DesertDiamondOreFeature;
import enchia.time.main.world.features.ores.CyanGlowstoneFeature;
import enchia.time.main.world.features.ores.CrystalOreFeature;
import enchia.time.main.world.features.ores.CreeperOreFeature;
import enchia.time.main.world.features.ores.CreeperEggFeature;
import enchia.time.main.world.features.ores.CopperOreFeature;
import enchia.time.main.world.features.ores.ColdSteelOreFeature;
import enchia.time.main.world.features.ores.ClassicIronOreFeature;
import enchia.time.main.world.features.ores.ClassicDiamondOreFeature;
import enchia.time.main.world.features.ores.CherryLeaves2Feature;
import enchia.time.main.world.features.ores.ChaosCrystalOreFeature;
import enchia.time.main.world.features.ores.Cake7Feature;
import enchia.time.main.world.features.ores.Cake6Feature;
import enchia.time.main.world.features.ores.Cake3Feature;
import enchia.time.main.world.features.ores.Cake2Feature;
import enchia.time.main.world.features.ores.BlueSandFeature;
import enchia.time.main.world.features.ores.BlueGlowstoneFeature;
import enchia.time.main.world.features.ores.BlackSandStoneFeature;
import enchia.time.main.world.features.ores.BlackSandFeature;
import enchia.time.main.world.features.ores.BlackGlowstoneFeature;
import enchia.time.main.world.features.ores.BlackCrystalFeature;
import enchia.time.main.world.features.ores.AquamarineOreFeature;
import enchia.time.main.world.features.ores.AncientGlowstoneFeature;
import enchia.time.main.world.features.ores.AmethystOreFeature;
import enchia.time.main.world.features.lakes.PureWaterFeature;
import enchia.time.main.world.features.lakes.MINECRAFTYEARS100WATERFeature;
import enchia.time.main.world.features.lakes.IceWaterFeature;
import enchia.time.main.world.features.lakes.AcidFeature;
import enchia.time.main.world.features.Underg2Feature;
import enchia.time.main.world.features.Underg1Feature;
import enchia.time.main.world.features.Tree1Feature;
import enchia.time.main.world.features.T3Feature;
import enchia.time.main.world.features.T2Feature;
import enchia.time.main.world.features.T1Feature;
import enchia.time.main.world.features.Structure1Feature;
import enchia.time.main.world.features.Sea409600Feature;
import enchia.time.main.world.features.Sea4096007Feature;
import enchia.time.main.world.features.Sea4096006Feature;
import enchia.time.main.world.features.Sea4096005Feature;
import enchia.time.main.world.features.Sea4096004Feature;
import enchia.time.main.world.features.Sea4096003Feature;
import enchia.time.main.world.features.Sea4096002Feature;
import enchia.time.main.world.features.Rune7Feature;
import enchia.time.main.world.features.Rune6Feature;
import enchia.time.main.world.features.Rune5Feature;
import enchia.time.main.world.features.Rune4Feature;
import enchia.time.main.world.features.Rune3Feature;
import enchia.time.main.world.features.Rune2Feature;
import enchia.time.main.world.features.Rune1Feature;
import enchia.time.main.world.features.RiserislandFeature;
import enchia.time.main.world.features.RandomcenterFeature;
import enchia.time.main.world.features.PhantomTreeNormal3Feature;
import enchia.time.main.world.features.PhantomTreeNormal2Feature;
import enchia.time.main.world.features.PhantomTreeNormal1Feature;
import enchia.time.main.world.features.PORALCANDYSPAWNFeature;
import enchia.time.main.world.features.Oak2Feature;
import enchia.time.main.world.features.Oak1Feature;
import enchia.time.main.world.features.Mushroom8Feature;
import enchia.time.main.world.features.Mushroom7Feature;
import enchia.time.main.world.features.Mushroom6Feature;
import enchia.time.main.world.features.Mushroom5Feature;
import enchia.time.main.world.features.Mushroom4Feature;
import enchia.time.main.world.features.Mushroom3Feature;
import enchia.time.main.world.features.Mushroom1Feature;
import enchia.time.main.world.features.MCY1600SpawnFeature;
import enchia.time.main.world.features.MCY100ForestTreeFeature;
import enchia.time.main.world.features.IcespickFeature;
import enchia.time.main.world.features.IcelordaltatFeature;
import enchia.time.main.world.features.IceTreeNewFeature;
import enchia.time.main.world.features.IceTreeNew2Feature;
import enchia.time.main.world.features.IceDungeonFeature;
import enchia.time.main.world.features.House88Feature;
import enchia.time.main.world.features.House7Feature;
import enchia.time.main.world.features.House6Feature;
import enchia.time.main.world.features.House5Feature;
import enchia.time.main.world.features.House4Feature;
import enchia.time.main.world.features.House3Feature;
import enchia.time.main.world.features.House2Feature;
import enchia.time.main.world.features.House1Feature;
import enchia.time.main.world.features.GreensmallFeature;
import enchia.time.main.world.features.GreenbigFeature;
import enchia.time.main.world.features.Foresttree3Feature;
import enchia.time.main.world.features.Dungeon1Feature;
import enchia.time.main.world.features.Desert9Feature;
import enchia.time.main.world.features.Desert8Feature;
import enchia.time.main.world.features.Desert7Feature;
import enchia.time.main.world.features.Desert6Feature;
import enchia.time.main.world.features.Desert5Feature;
import enchia.time.main.world.features.Desert4Feature;
import enchia.time.main.world.features.Desert3Feature;
import enchia.time.main.world.features.Desert2Feature;
import enchia.time.main.world.features.Desert1Feature;
import enchia.time.main.world.features.CrystalBOSSAltarFeature;
import enchia.time.main.world.features.CherryTreeFeature;
import enchia.time.main.world.features.CandyStickStr9Feature;
import enchia.time.main.world.features.CandyStickStr8Feature;
import enchia.time.main.world.features.CandyStickStr7Feature;
import enchia.time.main.world.features.CandyStickStr6Feature;
import enchia.time.main.world.features.CandyStickStr5Feature;
import enchia.time.main.world.features.CandyStickStr4Feature;
import enchia.time.main.world.features.CandyStickStr3Feature;
import enchia.time.main.world.features.CandyStickStr2Feature;
import enchia.time.main.world.features.CandyStickStr1Feature;
import enchia.time.main.world.features.CandyStickStr12Feature;
import enchia.time.main.world.features.CandyStickStr11Feature;
import enchia.time.main.world.features.CandyStickStr10Feature;
import enchia.time.main.world.features.Boss1Feature;
import enchia.time.main.world.features.BluesmallFeature;
import enchia.time.main.world.features.BluebigFeature;
import enchia.time.main.world.features.BambooFeature;
import enchia.time.main.world.features.Ball9Feature;
import enchia.time.main.world.features.Ball8Feature;
import enchia.time.main.world.features.Ball7Feature;
import enchia.time.main.world.features.Ball6Feature;
import enchia.time.main.world.features.Ball5Feature;
import enchia.time.main.world.features.Ball4Feature;
import enchia.time.main.world.features.Ball3Feature;
import enchia.time.main.world.features.Ball2Feature;
import enchia.time.main.world.features.Ball1Feature;
import enchia.time.main.world.features.Ball14Feature;
import enchia.time.main.world.features.Ball13Feature;
import enchia.time.main.world.features.Ball12Feature;
import enchia.time.main.world.features.Ball11Feature;
import enchia.time.main.world.features.Ball10Feature;
import enchia.time.main.world.features.AwdFeature;
import enchia.time.main.world.features.ANCALTARFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(FakeCoalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FakeCoalFeature.GENERATE_BIOMES,
				FakeCoalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FrozenCoalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				FrozenCoalOreFeature.GENERATE_BIOMES, FrozenCoalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ColdSteelOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ColdSteelOreFeature.GENERATE_BIOMES, ColdSteelOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MorcantOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MorcantOreFeature.GENERATE_BIOMES,
				MorcantOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MistarilleOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MistarilleOreFeature.GENERATE_BIOMES, MistarilleOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TerameriaiumoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				TerameriaiumoreFeature.GENERATE_BIOMES, TerameriaiumoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CopperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES,
				CopperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(JadeOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JadeOreFeature.GENERATE_BIOMES,
				JadeOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PerafriumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PerafriumOreFeature.GENERATE_BIOMES, PerafriumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DesertEmeraldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DesertEmeraldOreFeature.GENERATE_BIOMES, DesertEmeraldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DesertDiamondOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DesertDiamondOreFeature.GENERATE_BIOMES, DesertDiamondOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY400DiamondOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY400DiamondOreFeature.GENERATE_BIOMES, MCY400DiamondOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY400EmeraldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY400EmeraldOreFeature.GENERATE_BIOMES, MCY400EmeraldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoldenCoalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GoldenCoalOreFeature.GENERATE_BIOMES, GoldenCoalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AmethystOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AmethystOreFeature.GENERATE_BIOMES, AmethystOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IchorOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IchorOreFeature.GENERATE_BIOMES,
				IchorOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AquamarineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AquamarineOreFeature.GENERATE_BIOMES, AquamarineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ChaosCrystalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ChaosCrystalOreFeature.GENERATE_BIOMES, ChaosCrystalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY100CoalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY100CoalOreFeature.GENERATE_BIOMES, MCY100CoalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY1600DiamondOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY1600DiamondOreFeature.GENERATE_BIOMES, MCY1600DiamondOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY1600EmeraldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY1600EmeraldOreFeature.GENERATE_BIOMES, MCY1600EmeraldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HealthyStoneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HealthyStoneOreFeature.GENERATE_BIOMES, HealthyStoneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY100EmeraldOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY100EmeraldOreFeature.GENERATE_BIOMES, MCY100EmeraldOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RuneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RuneOreFeature.GENERATE_BIOMES,
				RuneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TimeGemOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TimeGemOreFeature.GENERATE_BIOMES,
				TimeGemOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DimensionGemOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DimensionGemOreFeature.GENERATE_BIOMES, DimensionGemOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FishOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FishOreFeature.GENERATE_BIOMES,
				FishOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ClassicDiamondOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ClassicDiamondOreFeature.GENERATE_BIOMES, ClassicDiamondOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ClassicIronOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ClassicIronOreFeature.GENERATE_BIOMES, ClassicIronOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HealthystoneorenetherFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HealthystoneorenetherFeature.GENERATE_BIOMES, HealthystoneorenetherFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetheronoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				NetheronoreFeature.GENERATE_BIOMES, NetheronoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WitherBoneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				WitherBoneOreFeature.GENERATE_BIOMES, WitherBoneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CreeperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CreeperOreFeature.GENERATE_BIOMES,
				CreeperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CrystalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CrystalOreFeature.GENERATE_BIOMES,
				CrystalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RedCrystalFeature.GENERATE_BIOMES,
				RedCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WhiteCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				WhiteCrystalFeature.GENERATE_BIOMES, WhiteCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LimeGreenCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				LimeGreenCrystalFeature.GENERATE_BIOMES, LimeGreenCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PinkCrystalFeature.GENERATE_BIOMES, PinkCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlackCrystalFeature.GENERATE_BIOMES, BlackCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceBlueCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				IceBlueCrystalFeature.GENERATE_BIOMES, IceBlueCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreenCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GreenCrystalFeature.GENERATE_BIOMES, GreenCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Cake6Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Cake6Feature.GENERATE_BIOMES, Cake6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Cake7Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Cake7Feature.GENERATE_BIOMES, Cake7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Cake2Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Cake2Feature.GENERATE_BIOMES, Cake2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Cake3Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, Cake3Feature.GENERATE_BIOMES, Cake3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherDirtFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NetherDirtFeature.GENERATE_BIOMES,
				NetherDirtFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CherryLeaves2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CherryLeaves2Feature.GENERATE_BIOMES, CherryLeaves2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(FrozenSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FrozenSandFeature.GENERATE_BIOMES,
				FrozenSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PinkSandFeature.GENERATE_BIOMES,
				PinkSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY102400SmoothStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY102400SmoothStoneFeature.GENERATE_BIOMES, MCY102400SmoothStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HardboneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				HardboneOreFeature.GENERATE_BIOMES, HardboneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackSandStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlackSandStoneFeature.GENERATE_BIOMES, BlackSandStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BlackSandFeature.GENERATE_BIOMES,
				BlackSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LightRockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LightRockFeature.GENERATE_BIOMES,
				LightRockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FakeBedrockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				FakeBedrockFeature.GENERATE_BIOMES, FakeBedrockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FragileGhoulStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				FragileGhoulStoneFeature.GENERATE_BIOMES, FragileGhoulStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AncientGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AncientGlowstoneFeature.GENERATE_BIOMES, AncientGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceCrystalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IceCrystalFeature.GENERATE_BIOMES,
				IceCrystalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MudBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MudBlockFeature.GENERATE_BIOMES,
				MudBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PureWaterFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, PureWaterFeature.GENERATE_BIOMES, PureWaterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MINECRAFTYEARS100WATERFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.LAKES,
				MINECRAFTYEARS100WATERFeature.GENERATE_BIOMES, MINECRAFTYEARS100WATERFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceWaterFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, IceWaterFeature.GENERATE_BIOMES, IceWaterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AcidFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, AcidFeature.GENERATE_BIOMES, AcidFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagicSugercaneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MagicSugercaneFeature.GENERATE_BIOMES, MagicSugercaneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StrawberriesPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				StrawberriesPlantFeature.GENERATE_BIOMES, StrawberriesPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY100GrassFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MCY100GrassFeature.GENERATE_BIOMES, MCY100GrassFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceGrassFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, IceGrassFeature.GENERATE_BIOMES,
				IceGrassFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ShurbFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ShurbFeature.GENERATE_BIOMES, ShurbFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GlowMushroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				GlowMushroomFeature.GENERATE_BIOMES, GlowMushroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CentellaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CentellaFeature.GENERATE_BIOMES,
				CentellaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WoodsiaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WoodsiaFeature.GENERATE_BIOMES,
				WoodsiaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TurtleheadFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				TurtleheadFeature.GENERATE_BIOMES, TurtleheadFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Glowshroom2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				Glowshroom2Feature.GENERATE_BIOMES, Glowshroom2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(WhiteRuzovaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				WhiteRuzovaFeature.GENERATE_BIOMES, WhiteRuzovaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MoonGrass3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MoonGrass3Feature.GENERATE_BIOMES, MoonGrass3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MoonGrassFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MoonGrassFeature.GENERATE_BIOMES,
				MoonGrassFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, IceFlowerFeature.GENERATE_BIOMES,
				IceFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CactusFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CactusFeature.GENERATE_BIOMES,
				CactusFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Cactus400Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Cactus400Feature.GENERATE_BIOMES,
				Cactus400Feature.CONFIGURED_FEATURE));
		REGISTRY.put(FrostyReedsFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				FrostyReedsFeature.GENERATE_BIOMES, FrostyReedsFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Ether5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Ether5Feature.GENERATE_BIOMES,
				Ether5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ether6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Ether6Feature.GENERATE_BIOMES,
				Ether6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ether4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Ether4Feature.GENERATE_BIOMES,
				Ether4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ether3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Ether3Feature.GENERATE_BIOMES,
				Ether3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ether2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Ether2Feature.GENERATE_BIOMES,
				Ether2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(GhoulItemPlant2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				GhoulItemPlant2Feature.GENERATE_BIOMES, GhoulItemPlant2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(GhoulItemPlant1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				GhoulItemPlant1Feature.GENERATE_BIOMES, GhoulItemPlant1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Cactus2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, Cactus2Feature.GENERATE_BIOMES,
				Cactus2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CucturFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CucturFeature.GENERATE_BIOMES,
				CucturFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FrozenFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				FrozenFlowerFeature.GENERATE_BIOMES, FrozenFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HydrangeaRedFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				HydrangeaRedFeature.GENERATE_BIOMES, HydrangeaRedFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PrairieSageFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				PrairieSageFeature.GENERATE_BIOMES, PrairieSageFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BellFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				BellFlowerFeature.GENERATE_BIOMES, BellFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MoonGrass1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MoonGrass1Feature.GENERATE_BIOMES, MoonGrass1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MoonGrass4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MoonGrass4Feature.GENERATE_BIOMES, MoonGrass4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MoonGrass5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				MoonGrass5Feature.GENERATE_BIOMES, MoonGrass5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(TinOreFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GhoulLampFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GhoulLampFeature.GENERATE_BIOMES,
				GhoulLampFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlackGlowstoneFeature.GENERATE_BIOMES, BlackGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				RedGlowstoneFeature.GENERATE_BIOMES, RedGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BlueGlowstoneFeature.GENERATE_BIOMES, BlueGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CyanGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CyanGlowstoneFeature.GENERATE_BIOMES, CyanGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreenGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GreenGlowstoneFeature.GENERATE_BIOMES, GreenGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PinkGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PinkGlowstoneFeature.GENERATE_BIOMES, PinkGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PurplppeGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PurplppeGlowstoneFeature.GENERATE_BIOMES, PurplppeGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WhiteGlowstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				WhiteGlowstoneFeature.GENERATE_BIOMES, WhiteGlowstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MossyStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MossyStoneFeature.GENERATE_BIOMES,
				MossyStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MushroomLampFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MushroomLampFeature.GENERATE_BIOMES, MushroomLampFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GlowingIceFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GlowingIceFeature.GENERATE_BIOMES,
				GlowingIceFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SpawnDungeon25600BlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SpawnDungeon25600BlockFeature.GENERATE_BIOMES, SpawnDungeon25600BlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CreeperEggFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CreeperEggFeature.GENERATE_BIOMES,
				CreeperEggFeature.CONFIGURED_FEATURE));
		REGISTRY.put(StoneGrassFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StoneGrassFeature.GENERATE_BIOMES,
				StoneGrassFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlueSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BlueSandFeature.GENERATE_BIOMES,
				BlueSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Foresttree3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Foresttree3Feature.GENERATE_BIOMES, Foresttree3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AwdFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AwdFeature.GENERATE_BIOMES, AwdFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NetherGrassFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				NetherGrassFeature.GENERATE_BIOMES, NetherGrassFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY100ForestTreeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MCY100ForestTreeFeature.GENERATE_BIOMES, MCY100ForestTreeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RiserislandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, RiserislandFeature.GENERATE_BIOMES,
				RiserislandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IcelordaltatFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				IcelordaltatFeature.GENERATE_BIOMES, IcelordaltatFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreenbigFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GreenbigFeature.GENERATE_BIOMES,
				GreenbigFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreensmallFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				GreensmallFeature.GENERATE_BIOMES, GreensmallFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BluebigFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BluebigFeature.GENERATE_BIOMES,
				BluebigFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BluesmallFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BluesmallFeature.GENERATE_BIOMES,
				BluesmallFeature.CONFIGURED_FEATURE));
		REGISTRY.put(T1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, T1Feature.GENERATE_BIOMES, T1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(T2Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, T2Feature.GENERATE_BIOMES, T2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(T3Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, T3Feature.GENERATE_BIOMES, T3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(BambooFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BambooFeature.GENERATE_BIOMES,
				BambooFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceDungeonFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				IceDungeonFeature.GENERATE_BIOMES, IceDungeonFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CrystalBOSSAltarFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION,
				CrystalBOSSAltarFeature.GENERATE_BIOMES, CrystalBOSSAltarFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune1Feature.GENERATE_BIOMES, Rune1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune2Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune2Feature.GENERATE_BIOMES, Rune2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune3Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune3Feature.GENERATE_BIOMES, Rune3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune4Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune4Feature.GENERATE_BIOMES, Rune4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune5Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune5Feature.GENERATE_BIOMES, Rune5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune6Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune6Feature.GENERATE_BIOMES, Rune6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Rune7Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Rune7Feature.GENERATE_BIOMES, Rune7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(IcespickFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, IcespickFeature.GENERATE_BIOMES,
				IcespickFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Dungeon1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				Dungeon1Feature.GENERATE_BIOMES, Dungeon1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House1Feature.GENERATE_BIOMES,
				House1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Tree1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Tree1Feature.GENERATE_BIOMES, Tree1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(ANCALTARFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				ANCALTARFeature.GENERATE_BIOMES, ANCALTARFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GingerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GingerFeature.GENERATE_BIOMES,
				GingerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PORALCANDYSPAWNFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PORALCANDYSPAWNFeature.GENERATE_BIOMES, PORALCANDYSPAWNFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr1Feature.GENERATE_BIOMES, CandyStickStr1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr2Feature.GENERATE_BIOMES, CandyStickStr2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr3Feature.GENERATE_BIOMES, CandyStickStr3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr4Feature.GENERATE_BIOMES, CandyStickStr4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr5Feature.GENERATE_BIOMES, CandyStickStr5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr6Feature.GENERATE_BIOMES, CandyStickStr6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr7Feature.GENERATE_BIOMES, CandyStickStr7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr8Feature.GENERATE_BIOMES, CandyStickStr8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr9Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr9Feature.GENERATE_BIOMES, CandyStickStr9Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr10Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr10Feature.GENERATE_BIOMES, CandyStickStr10Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr11Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr11Feature.GENERATE_BIOMES, CandyStickStr11Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CandyStickStr12Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CandyStickStr12Feature.GENERATE_BIOMES, CandyStickStr12Feature.CONFIGURED_FEATURE));
		REGISTRY.put(RandomcenterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				RandomcenterFeature.GENERATE_BIOMES, RandomcenterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PhantomTreeNormal1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PhantomTreeNormal1Feature.GENERATE_BIOMES, PhantomTreeNormal1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PhantomTreeNormal2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PhantomTreeNormal2Feature.GENERATE_BIOMES, PhantomTreeNormal2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(PhantomTreeNormal3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				PhantomTreeNormal3Feature.GENERATE_BIOMES, PhantomTreeNormal3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(IceTreeNewFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				IceTreeNewFeature.GENERATE_BIOMES, IceTreeNewFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IceTreeNew2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				IceTreeNew2Feature.GENERATE_BIOMES, IceTreeNew2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(CherryTreeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				CherryTreeFeature.GENERATE_BIOMES, CherryTreeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Oak1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Oak1Feature.GENERATE_BIOMES, Oak1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Oak2Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Oak2Feature.GENERATE_BIOMES, Oak2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY400GroundPortalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY400GroundPortalFeature.GENERATE_BIOMES, MCY400GroundPortalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Structure1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Structure1Feature.GENERATE_BIOMES, Structure1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House2Feature.GENERATE_BIOMES,
				House2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House3Feature.GENERATE_BIOMES,
				House3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House4Feature.GENERATE_BIOMES,
				House4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House5Feature.GENERATE_BIOMES,
				House5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House6Feature.GENERATE_BIOMES,
				House6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House7Feature.GENERATE_BIOMES,
				House7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(House88Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, House88Feature.GENERATE_BIOMES,
				House88Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Underg1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Underg1Feature.GENERATE_BIOMES,
				Underg1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Underg2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Underg2Feature.GENERATE_BIOMES,
				Underg2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Boss1Feature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Boss1Feature.GENERATE_BIOMES, Boss1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY400UndergroundPortalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MCY400UndergroundPortalFeature.GENERATE_BIOMES, MCY400UndergroundPortalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball1Feature.GENERATE_BIOMES,
				Ball1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball2Feature.GENERATE_BIOMES,
				Ball2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball3Feature.GENERATE_BIOMES,
				Ball3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball4Feature.GENERATE_BIOMES,
				Ball4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball5Feature.GENERATE_BIOMES,
				Ball5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball6Feature.GENERATE_BIOMES,
				Ball6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball7Feature.GENERATE_BIOMES,
				Ball7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball8Feature.GENERATE_BIOMES,
				Ball8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball9Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball9Feature.GENERATE_BIOMES,
				Ball9Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball10Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball10Feature.GENERATE_BIOMES,
				Ball10Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball11Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball11Feature.GENERATE_BIOMES,
				Ball11Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball12Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball12Feature.GENERATE_BIOMES,
				Ball12Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball13Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball13Feature.GENERATE_BIOMES,
				Ball13Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Ball14Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Ball14Feature.GENERATE_BIOMES,
				Ball14Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert1Feature.GENERATE_BIOMES,
				Desert1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert2Feature.GENERATE_BIOMES,
				Desert2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert3Feature.GENERATE_BIOMES,
				Desert3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert4Feature.GENERATE_BIOMES,
				Desert4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert5Feature.GENERATE_BIOMES,
				Desert5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert6Feature.GENERATE_BIOMES,
				Desert6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert7Feature.GENERATE_BIOMES,
				Desert7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert8Feature.GENERATE_BIOMES,
				Desert8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Desert9Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Desert9Feature.GENERATE_BIOMES,
				Desert9Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea409600Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea409600Feature.GENERATE_BIOMES,
				Sea409600Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096002Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096002Feature.GENERATE_BIOMES,
				Sea4096002Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096003Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096003Feature.GENERATE_BIOMES,
				Sea4096003Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096004Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096004Feature.GENERATE_BIOMES,
				Sea4096004Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096005Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096005Feature.GENERATE_BIOMES,
				Sea4096005Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096006Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096006Feature.GENERATE_BIOMES,
				Sea4096006Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Sea4096007Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, Sea4096007Feature.GENERATE_BIOMES,
				Sea4096007Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom1Feature.GENERATE_BIOMES,
				Mushroom1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom3Feature.GENERATE_BIOMES,
				Mushroom3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom4Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom4Feature.GENERATE_BIOMES,
				Mushroom4Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom5Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom5Feature.GENERATE_BIOMES,
				Mushroom5Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom6Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom6Feature.GENERATE_BIOMES,
				Mushroom6Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom7Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom7Feature.GENERATE_BIOMES,
				Mushroom7Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Mushroom8Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Mushroom8Feature.GENERATE_BIOMES,
				Mushroom8Feature.CONFIGURED_FEATURE));
		REGISTRY.put(GhoulMatterFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GhoulMatterFeature.GENERATE_BIOMES, GhoulMatterFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MCY1600SpawnFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				MCY1600SpawnFeature.GENERATE_BIOMES, MCY1600SpawnFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SpaceGemOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				SpaceGemOreFeature.GENERATE_BIOMES, SpaceGemOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WhitediamondOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				WhitediamondOreFeature.GENERATE_BIOMES, WhitediamondOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
