
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.world.inventory.Timebook2Menu;
import enchia.time.main.world.inventory.Timebook1Menu;
import enchia.time.main.world.inventory.StructureSpawnMenu;
import enchia.time.main.world.inventory.ScrollBenchGUIMenu;
import enchia.time.main.world.inventory.QuiverguiMenu;
import enchia.time.main.world.inventory.PadMenu;
import enchia.time.main.world.inventory.LanguagePadMenu;
import enchia.time.main.world.inventory.KpguiMenu;
import enchia.time.main.world.inventory.ErrorMenu;
import enchia.time.main.world.inventory.CheatMenu;
import enchia.time.main.world.inventory.ChallengeDreamMenu;
import enchia.time.main.world.inventory.CauldonGuiMenu;
import enchia.time.main.world.inventory.Begin3Menu;
import enchia.time.main.world.inventory.Begin2Menu;
import enchia.time.main.world.inventory.Begin1Menu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<Timebook1Menu> TIMEBOOK_1 = register("timebook_1", (id, inv, extraData) -> new Timebook1Menu(id, inv, extraData));
	public static final MenuType<Timebook2Menu> TIMEBOOK_2 = register("timebook_2", (id, inv, extraData) -> new Timebook2Menu(id, inv, extraData));
	public static final MenuType<Begin1Menu> BEGIN_1 = register("begin_1", (id, inv, extraData) -> new Begin1Menu(id, inv, extraData));
	public static final MenuType<CauldonGuiMenu> CAULDON_GUI = register("cauldon_gui",
			(id, inv, extraData) -> new CauldonGuiMenu(id, inv, extraData));
	public static final MenuType<QuiverguiMenu> QUIVERGUI = register("quivergui", (id, inv, extraData) -> new QuiverguiMenu(id, inv, extraData));
	public static final MenuType<StructureSpawnMenu> STRUCTURE_SPAWN = register("structure_spawn",
			(id, inv, extraData) -> new StructureSpawnMenu(id, inv, extraData));
	public static final MenuType<ErrorMenu> ERROR = register("error", (id, inv, extraData) -> new ErrorMenu(id, inv, extraData));
	public static final MenuType<ChallengeDreamMenu> CHALLENGE_DREAM = register("challenge_dream",
			(id, inv, extraData) -> new ChallengeDreamMenu(id, inv, extraData));
	public static final MenuType<ScrollBenchGUIMenu> SCROLL_BENCH_GUI = register("scroll_bench_gui",
			(id, inv, extraData) -> new ScrollBenchGUIMenu(id, inv, extraData));
	public static final MenuType<KpguiMenu> KPGUI = register("kpgui", (id, inv, extraData) -> new KpguiMenu(id, inv, extraData));
	public static final MenuType<CheatMenu> CHEAT = register("cheat", (id, inv, extraData) -> new CheatMenu(id, inv, extraData));
	public static final MenuType<LanguagePadMenu> LANGUAGE_PAD = register("language_pad",
			(id, inv, extraData) -> new LanguagePadMenu(id, inv, extraData));
	public static final MenuType<PadMenu> PAD = register("pad", (id, inv, extraData) -> new PadMenu(id, inv, extraData));
	public static final MenuType<Begin2Menu> BEGIN_2 = register("begin_2", (id, inv, extraData) -> new Begin2Menu(id, inv, extraData));
	public static final MenuType<Begin3Menu> BEGIN_3 = register("begin_3", (id, inv, extraData) -> new Begin3Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
