
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import enchia.time.main.client.gui.Timebook2Screen;
import enchia.time.main.client.gui.Timebook1Screen;
import enchia.time.main.client.gui.StructureSpawnScreen;
import enchia.time.main.client.gui.ScrollBenchGUIScreen;
import enchia.time.main.client.gui.QuiverguiScreen;
import enchia.time.main.client.gui.PadScreen;
import enchia.time.main.client.gui.LanguagePadScreen;
import enchia.time.main.client.gui.KpguiScreen;
import enchia.time.main.client.gui.ErrorScreen;
import enchia.time.main.client.gui.CheatScreen;
import enchia.time.main.client.gui.ChallengeDreamScreen;
import enchia.time.main.client.gui.CauldonGuiScreen;
import enchia.time.main.client.gui.Begin3Screen;
import enchia.time.main.client.gui.Begin2Screen;
import enchia.time.main.client.gui.Begin1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TimeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TimeModMenus.TIMEBOOK_1, Timebook1Screen::new);
			MenuScreens.register(TimeModMenus.TIMEBOOK_2, Timebook2Screen::new);
			MenuScreens.register(TimeModMenus.BEGIN_1, Begin1Screen::new);
			MenuScreens.register(TimeModMenus.CAULDON_GUI, CauldonGuiScreen::new);
			MenuScreens.register(TimeModMenus.QUIVERGUI, QuiverguiScreen::new);
			MenuScreens.register(TimeModMenus.STRUCTURE_SPAWN, StructureSpawnScreen::new);
			MenuScreens.register(TimeModMenus.ERROR, ErrorScreen::new);
			MenuScreens.register(TimeModMenus.CHALLENGE_DREAM, ChallengeDreamScreen::new);
			MenuScreens.register(TimeModMenus.SCROLL_BENCH_GUI, ScrollBenchGUIScreen::new);
			MenuScreens.register(TimeModMenus.KPGUI, KpguiScreen::new);
			MenuScreens.register(TimeModMenus.CHEAT, CheatScreen::new);
			MenuScreens.register(TimeModMenus.LANGUAGE_PAD, LanguagePadScreen::new);
			MenuScreens.register(TimeModMenus.PAD, PadScreen::new);
			MenuScreens.register(TimeModMenus.BEGIN_2, Begin2Screen::new);
			MenuScreens.register(TimeModMenus.BEGIN_3, Begin3Screen::new);
		});
	}
}
