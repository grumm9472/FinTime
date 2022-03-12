
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import enchia.time.main.network.PanelOpenMessage;
import enchia.time.main.network.CheatopenMessage;
import enchia.time.main.TimeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TimeModKeyMappings {
	public static final KeyMapping CHEATOPEN = new KeyMapping("key.time.cheatopen", GLFW.GLFW_KEY_F8, "key.categories.misc");
	public static final KeyMapping PANEL_OPEN = new KeyMapping("key.time.panel_open", GLFW.GLFW_KEY_F9, "key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(CHEATOPEN);
		ClientRegistry.registerKeyBinding(PANEL_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == CHEATOPEN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TimeMod.PACKET_HANDLER.sendToServer(new CheatopenMessage(0, 0));
						CheatopenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == PANEL_OPEN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TimeMod.PACKET_HANDLER.sendToServer(new PanelOpenMessage(0, 0));
						PanelOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
