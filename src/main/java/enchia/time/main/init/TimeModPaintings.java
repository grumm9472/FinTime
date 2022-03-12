
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(16, 16).setRegistryName("paint_1"));
		event.getRegistry().register(new Motive(16, 32).setRegistryName("paint_2"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("paint_3"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("paint_4"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("paint_5"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("paint_6"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("paint_7"));
		event.getRegistry().register(new Motive(32, 16).setRegistryName("paint_8"));
	}
}
