
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import enchia.time.main.client.renderer.WoodRenderer;
import enchia.time.main.client.renderer.WaterRenderer;
import enchia.time.main.client.renderer.SpikeRenderer;
import enchia.time.main.client.renderer.SnowMonsterRenderer;
import enchia.time.main.client.renderer.SnowMonster5Renderer;
import enchia.time.main.client.renderer.SnowMonster4Renderer;
import enchia.time.main.client.renderer.SnowMonster3Renderer;
import enchia.time.main.client.renderer.SnowMonster2Renderer;
import enchia.time.main.client.renderer.SilentCreeperRenderer;
import enchia.time.main.client.renderer.Robber5Renderer;
import enchia.time.main.client.renderer.Robber4Renderer;
import enchia.time.main.client.renderer.Robber3Renderer;
import enchia.time.main.client.renderer.Robber2Renderer;
import enchia.time.main.client.renderer.Robber1Renderer;
import enchia.time.main.client.renderer.RiserRenderer;
import enchia.time.main.client.renderer.Riser2Renderer;
import enchia.time.main.client.renderer.PumpkinspiderRenderer;
import enchia.time.main.client.renderer.MummyZomibeRenderer;
import enchia.time.main.client.renderer.MummyKingRenderer;
import enchia.time.main.client.renderer.MimicRenderer;
import enchia.time.main.client.renderer.LivingFungiRenderer;
import enchia.time.main.client.renderer.IcebrumpRenderer;
import enchia.time.main.client.renderer.HumanRenderer;
import enchia.time.main.client.renderer.HeadlesszombieRenderer;
import enchia.time.main.client.renderer.GoldRenderer;
import enchia.time.main.client.renderer.FrogRenderer;
import enchia.time.main.client.renderer.ForstGolemRenderer;
import enchia.time.main.client.renderer.FireRenderer;
import enchia.time.main.client.renderer.ExpLordRenderer;
import enchia.time.main.client.renderer.EvilSnowmanRenderer;
import enchia.time.main.client.renderer.DevilSnowmanRenderer;
import enchia.time.main.client.renderer.DemonSpiderRenderer;
import enchia.time.main.client.renderer.DeadlyFireRenderer;
import enchia.time.main.client.renderer.DarkpropagaterRenderer;
import enchia.time.main.client.renderer.CrystalSpiderRenderer;
import enchia.time.main.client.renderer.CrystalGuardianRenderer;
import enchia.time.main.client.renderer.CluckshroomRenderer;
import enchia.time.main.client.renderer.BoneSpiderRenderer;
import enchia.time.main.client.renderer.AirRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TimeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TimeModEntities.STAR_FURY, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.IRON_EGG, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.DIAMOND_EGG, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.BLAZING_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.ICICLE_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.EVIL_SNOWMAN, EvilSnowmanRenderer::new);
		event.registerEntityRenderer(TimeModEntities.DEVIL_SNOWMAN, DevilSnowmanRenderer::new);
		event.registerEntityRenderer(TimeModEntities.SILENT_CREEPER, SilentCreeperRenderer::new);
		event.registerEntityRenderer(TimeModEntities.SPIKE, SpikeRenderer::new);
		event.registerEntityRenderer(TimeModEntities.RISER_2, Riser2Renderer::new);
		event.registerEntityRenderer(TimeModEntities.DEMON_SPIDER, DemonSpiderRenderer::new);
		event.registerEntityRenderer(TimeModEntities.EXP_LORD, ExpLordRenderer::new);
		event.registerEntityRenderer(TimeModEntities.MUMMY_KING, MummyKingRenderer::new);
		event.registerEntityRenderer(TimeModEntities.SNOW_MONSTER_4, SnowMonster4Renderer::new);
		event.registerEntityRenderer(TimeModEntities.SNOW_MONSTER_5, SnowMonster5Renderer::new);
		event.registerEntityRenderer(TimeModEntities.SNOW_MONSTER_2, SnowMonster2Renderer::new);
		event.registerEntityRenderer(TimeModEntities.SNOW_MONSTER_3, SnowMonster3Renderer::new);
		event.registerEntityRenderer(TimeModEntities.FROG, FrogRenderer::new);
		event.registerEntityRenderer(TimeModEntities.DARKPROPAGATER, DarkpropagaterRenderer::new);
		event.registerEntityRenderer(TimeModEntities.SNOW_MONSTER, SnowMonsterRenderer::new);
		event.registerEntityRenderer(TimeModEntities.HEADLESSZOMBIE, HeadlesszombieRenderer::new);
		event.registerEntityRenderer(TimeModEntities.CLUCKSHROOM, CluckshroomRenderer::new);
		event.registerEntityRenderer(TimeModEntities.LIVING_FUNGI, LivingFungiRenderer::new);
		event.registerEntityRenderer(TimeModEntities.CRYSTAL_GUARDIAN, CrystalGuardianRenderer::new);
		event.registerEntityRenderer(TimeModEntities.ICEBRUMP, IcebrumpRenderer::new);
		event.registerEntityRenderer(TimeModEntities.AIR, AirRenderer::new);
		event.registerEntityRenderer(TimeModEntities.WOOD, WoodRenderer::new);
		event.registerEntityRenderer(TimeModEntities.GOLD, GoldRenderer::new);
		event.registerEntityRenderer(TimeModEntities.FIRE, FireRenderer::new);
		event.registerEntityRenderer(TimeModEntities.ROBBER_1, Robber1Renderer::new);
		event.registerEntityRenderer(TimeModEntities.ROBBER_2, Robber2Renderer::new);
		event.registerEntityRenderer(TimeModEntities.ROBBER_3, Robber3Renderer::new);
		event.registerEntityRenderer(TimeModEntities.ROBBER_5, Robber5Renderer::new);
		event.registerEntityRenderer(TimeModEntities.ROBBER_4, Robber4Renderer::new);
		event.registerEntityRenderer(TimeModEntities.WATER, WaterRenderer::new);
		event.registerEntityRenderer(TimeModEntities.HUMAN, HumanRenderer::new);
		event.registerEntityRenderer(TimeModEntities.PUMPKINSPIDER, PumpkinspiderRenderer::new);
		event.registerEntityRenderer(TimeModEntities.DEADLY_FIRE, DeadlyFireRenderer::new);
		event.registerEntityRenderer(TimeModEntities.BONE_SPIDER, BoneSpiderRenderer::new);
		event.registerEntityRenderer(TimeModEntities.CRYSTAL_SPIDER, CrystalSpiderRenderer::new);
		event.registerEntityRenderer(TimeModEntities.FORST_GOLEM, ForstGolemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.MUMMY_ZOMIBE, MummyZomibeRenderer::new);
		event.registerEntityRenderer(TimeModEntities.SUPER_TORCH, ThrownItemRenderer::new);
		event.registerEntityRenderer(TimeModEntities.RISER, RiserRenderer::new);
		event.registerEntityRenderer(TimeModEntities.MIMIC, MimicRenderer::new);
	}
}
