
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.world.biome.WindForestBiome;
import enchia.time.main.world.biome.WindForest2Biome;
import enchia.time.main.world.biome.SukuraPlainsBiome;
import enchia.time.main.world.biome.StoneMountainBiome;
import enchia.time.main.world.biome.SnowDesertBiome;
import enchia.time.main.world.biome.Snow1Biome;
import enchia.time.main.world.biome.SilentiaislandBiome;
import enchia.time.main.world.biome.SecMoonSharpForestBiome;
import enchia.time.main.world.biome.Sand1Biome;
import enchia.time.main.world.biome.SakuraForestBiome;
import enchia.time.main.world.biome.RuneLandBiome;
import enchia.time.main.world.biome.OldDesertBiome;
import enchia.time.main.world.biome.NetherMCY100Biome;
import enchia.time.main.world.biome.MushroommountainBiome;
import enchia.time.main.world.biome.MushroomDesertBiome;
import enchia.time.main.world.biome.MudBiome;
import enchia.time.main.world.biome.MoonlightForestBiome;
import enchia.time.main.world.biome.MoonSharpForestBiome;
import enchia.time.main.world.biome.MinecraftPlainsBiome;
import enchia.time.main.world.biome.Minecraft100NewDesert3Biome;
import enchia.time.main.world.biome.Minecraft100NewDesert2Biome;
import enchia.time.main.world.biome.Mcy400fORESTBiome;
import enchia.time.main.world.biome.Mcy100mountainBiome;
import enchia.time.main.world.biome.Mcy100PlainsBiome;
import enchia.time.main.world.biome.MCYnewDesertBiome;
import enchia.time.main.world.biome.MCY400UnderGroundBoimeBiome;
import enchia.time.main.world.biome.MCY400PlainsBiome;
import enchia.time.main.world.biome.MCY400ForestTwoBiome;
import enchia.time.main.world.biome.MCY25600T1Biome;
import enchia.time.main.world.biome.MCY25600PBiome;
import enchia.time.main.world.biome.MCY25600MabbooBiome;
import enchia.time.main.world.biome.MCY25600BEACHBiome;
import enchia.time.main.world.biome.MCY1600PlainsBiome;
import enchia.time.main.world.biome.MCY102400DesertBiome;
import enchia.time.main.world.biome.MCY0FORESTBiome;
import enchia.time.main.world.biome.IcePlainsBiome;
import enchia.time.main.world.biome.IceBiome;
import enchia.time.main.world.biome.ICEMOUNTAINBiome;
import enchia.time.main.world.biome.HavenForestBiome;
import enchia.time.main.world.biome.HavenBoimeBiome;
import enchia.time.main.world.biome.GhostBoimeBiome;
import enchia.time.main.world.biome.FireLandBiome;
import enchia.time.main.world.biome.FORESTmAGICBiome;
import enchia.time.main.world.biome.EmptyPhantomBiome;
import enchia.time.main.world.biome.DesertSandBiome;
import enchia.time.main.world.biome.ClearBiome;
import enchia.time.main.world.biome.ClassicplainsBiome;
import enchia.time.main.world.biome.ChocolateLandBiome;
import enchia.time.main.world.biome.CandyPlainsBiome;
import enchia.time.main.world.biome.CakeLandBiome;
import enchia.time.main.world.biome.CakeLand2Biome;
import enchia.time.main.world.biome.CactusForestBiome;
import enchia.time.main.world.biome.BoimeruneBiome;
import enchia.time.main.world.biome.BetaplainsBiome;
import enchia.time.main.world.biome.BermudabBiome;
import enchia.time.main.world.biome.BermudaABiome;
import enchia.time.main.world.biome.BambooBoimeBiome;
import enchia.time.main.world.biome.AncientRainForestBiome;
import enchia.time.main.world.biome.AncientForestSmallBiome;
import enchia.time.main.world.biome.A100tree1Biome;
import enchia.time.main.world.biome.A100TREE2Biome;
import enchia.time.main.TimeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome MINECRAFT_PLAINS = register("minecraft_plains", MinecraftPlainsBiome.createBiome());
	public static Biome WIND_FOREST = register("wind_forest", WindForestBiome.createBiome());
	public static Biome MCY_100_PLAINS = register("mcy_100_plains", Mcy100PlainsBiome.createBiome());
	public static Biome ANCIENT_RAIN_FOREST = register("ancient_rain_forest", AncientRainForestBiome.createBiome());
	public static Biome ANCIENT_FOREST_SMALL = register("ancient_forest_small", AncientForestSmallBiome.createBiome());
	public static Biome RUNE_LAND = register("rune_land", RuneLandBiome.createBiome());
	public static Biome CHOCOLATE_LAND = register("chocolate_land", ChocolateLandBiome.createBiome());
	public static Biome NETHER_MCY_100 = register("nether_mcy_100", NetherMCY100Biome.createBiome());
	public static Biome ICE_PLAINS = register("ice_plains", IcePlainsBiome.createBiome());
	public static Biome MCY_400_PLAINS = register("mcy_400_plains", MCY400PlainsBiome.createBiome());
	public static Biome MCY_400F_OREST = register("mcy_400f_orest", Mcy400fORESTBiome.createBiome());
	public static Biome ICE = register("ice", IceBiome.createBiome());
	public static Biome MCY_1600_PLAINS = register("mcy_1600_plains", MCY1600PlainsBiome.createBiome());
	public static Biome MUSHROOMMOUNTAIN = register("mushroommountain", MushroommountainBiome.createBiome());
	public static Biome SILENTIAISLAND = register("silentiaisland", SilentiaislandBiome.createBiome());
	public static Biome MCY_25600_T_1 = register("mcy_25600_t_1", MCY25600T1Biome.createBiome());
	public static Biome MCY_25600_P = register("mcy_25600_p", MCY25600PBiome.createBiome());
	public static Biome MCY_25600_MABBOO = register("mcy_25600_mabboo", MCY25600MabbooBiome.createBiome());
	public static Biome MCY_25600_BEACH = register("mcy_25600_beach", MCY25600BEACHBiome.createBiome());
	public static Biome MCY_100MOUNTAIN = register("mcy_100mountain", Mcy100mountainBiome.createBiome());
	public static Biome ICEMOUNTAIN = register("icemountain", ICEMOUNTAINBiome.createBiome());
	public static Biome MUD = register("mud", MudBiome.createBiome());
	public static Biome BETAPLAINS = register("betaplains", BetaplainsBiome.createBiome());
	public static Biome CLASSICPLAINS = register("classicplains", ClassicplainsBiome.createBiome());
	public static Biome BOIMERUNE = register("boimerune", BoimeruneBiome.createBiome());
	public static Biome FORES_TM_AGIC = register("fores_tm_agic", FORESTmAGICBiome.createBiome());
	public static Biome BAMBOO_BOIME = register("bamboo_boime", BambooBoimeBiome.createBiome());
	public static Biome CANDY_PLAINS = register("candy_plains", CandyPlainsBiome.createBiome());
	public static Biome CAKE_LAND = register("cake_land", CakeLandBiome.createBiome());
	public static Biome CAKE_LAND_2 = register("cake_land_2", CakeLand2Biome.createBiome());
	public static Biome MCY_102400_DESERT = register("mcy_102400_desert", MCY102400DesertBiome.createBiome());
	public static Biome DESERT_SAND = register("desert_sand", DesertSandBiome.createBiome());
	public static Biome OLD_DESERT = register("old_desert", OldDesertBiome.createBiome());
	public static Biome EMPTY_PHANTOM = register("empty_phantom", EmptyPhantomBiome.createBiome());
	public static Biome HAVEN_BOIME = register("haven_boime", HavenBoimeBiome.createBiome());
	public static Biome HAVEN_FOREST = register("haven_forest", HavenForestBiome.createBiome());
	public static Biome CLEAR = register("clear", ClearBiome.createBiome());
	public static Biome FIRE_LAND = register("fire_land", FireLandBiome.createBiome());
	public static Biome MCY_400_UNDER_GROUND_BOIME = register("mcy_400_under_ground_boime", MCY400UnderGroundBoimeBiome.createBiome());
	public static Biome A_100TREE_1 = register("a_100tree_1", A100tree1Biome.createBiome());
	public static Biome A_100_TREE_2 = register("a_100_tree_2", A100TREE2Biome.createBiome());
	public static Biome SNOW_1 = register("snow_1", Snow1Biome.createBiome());
	public static Biome SAND_1 = register("sand_1", Sand1Biome.createBiome());
	public static Biome BERMUDA_A = register("bermuda_a", BermudaABiome.createBiome());
	public static Biome BERMUDAB = register("bermudab", BermudabBiome.createBiome());
	public static Biome SNOW_DESERT = register("snow_desert", SnowDesertBiome.createBiome());
	public static Biome MUSHROOM_DESERT = register("mushroom_desert", MushroomDesertBiome.createBiome());
	public static Biome MC_YNEW_DESERT = register("mc_ynew_desert", MCYnewDesertBiome.createBiome());
	public static Biome MCY_0_FOREST = register("mcy_0_forest", MCY0FORESTBiome.createBiome());
	public static Biome MOONLIGHT_FOREST = register("moonlight_forest", MoonlightForestBiome.createBiome());
	public static Biome STONE_MOUNTAIN = register("stone_mountain", StoneMountainBiome.createBiome());
	public static Biome SAKURA_FOREST = register("sakura_forest", SakuraForestBiome.createBiome());
	public static Biome MOON_SHARP_FOREST = register("moon_sharp_forest", MoonSharpForestBiome.createBiome());
	public static Biome SEC_MOON_SHARP_FOREST = register("sec_moon_sharp_forest", SecMoonSharpForestBiome.createBiome());
	public static Biome GHOST_BOIME = register("ghost_boime", GhostBoimeBiome.createBiome());
	public static Biome WIND_FOREST_2 = register("wind_forest_2", WindForest2Biome.createBiome());
	public static Biome CACTUS_FOREST = register("cactus_forest", CactusForestBiome.createBiome());
	public static Biome MCY_400_FOREST_TWO = register("mcy_400_forest_two", MCY400ForestTwoBiome.createBiome());
	public static Biome SUKURA_PLAINS = register("sukura_plains", SukuraPlainsBiome.createBiome());
	public static Biome MINECRAFT_100_NEW_DESERT_2 = register("minecraft_100_new_desert_2", Minecraft100NewDesert2Biome.createBiome());
	public static Biome MINECRAFT_100_NEW_DESERT_3 = register("minecraft_100_new_desert_3", Minecraft100NewDesert3Biome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(TimeMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MinecraftPlainsBiome.init();
			WindForestBiome.init();
			Mcy100PlainsBiome.init();
			AncientRainForestBiome.init();
			AncientForestSmallBiome.init();
			RuneLandBiome.init();
			ChocolateLandBiome.init();
			NetherMCY100Biome.init();
			IcePlainsBiome.init();
			MCY400PlainsBiome.init();
			Mcy400fORESTBiome.init();
			IceBiome.init();
			MCY1600PlainsBiome.init();
			MushroommountainBiome.init();
			SilentiaislandBiome.init();
			MCY25600T1Biome.init();
			MCY25600PBiome.init();
			MCY25600MabbooBiome.init();
			MCY25600BEACHBiome.init();
			Mcy100mountainBiome.init();
			ICEMOUNTAINBiome.init();
			MudBiome.init();
			BetaplainsBiome.init();
			ClassicplainsBiome.init();
			BoimeruneBiome.init();
			FORESTmAGICBiome.init();
			BambooBoimeBiome.init();
			CandyPlainsBiome.init();
			CakeLandBiome.init();
			CakeLand2Biome.init();
			MCY102400DesertBiome.init();
			DesertSandBiome.init();
			OldDesertBiome.init();
			EmptyPhantomBiome.init();
			HavenBoimeBiome.init();
			HavenForestBiome.init();
			ClearBiome.init();
			FireLandBiome.init();
			MCY400UnderGroundBoimeBiome.init();
			A100tree1Biome.init();
			A100TREE2Biome.init();
			Snow1Biome.init();
			Sand1Biome.init();
			BermudaABiome.init();
			BermudabBiome.init();
			SnowDesertBiome.init();
			MushroomDesertBiome.init();
			MCYnewDesertBiome.init();
			MCY0FORESTBiome.init();
			MoonlightForestBiome.init();
			StoneMountainBiome.init();
			SakuraForestBiome.init();
			MoonSharpForestBiome.init();
			SecMoonSharpForestBiome.init();
			GhostBoimeBiome.init();
			WindForest2Biome.init();
			CactusForestBiome.init();
			MCY400ForestTwoBiome.init();
			SukuraPlainsBiome.init();
			Minecraft100NewDesert2Biome.init();
			Minecraft100NewDesert3Biome.init();
		});
	}
}
