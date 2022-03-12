package enchia.time.main.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import enchia.time.main.network.TimeModVariables;

public class UpdateCheakProcedure {
	public static void execute(LevelAccessor world) {
		if (TimeModVariables.MapVariables.get(world).Language == 0) {
			if (!world.isClientSide()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().broadcastMessage(new TextComponent(
							"The current version is not the latest version. Please go to curseforge or our discord to download the latest version."),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
		if (TimeModVariables.MapVariables.get(world).Language == 1) {
			if (!world.isClientSide()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().broadcastMessage(new TextComponent("?????????????????Discord???????????"), ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
		if (TimeModVariables.MapVariables.get(world).Language == 2) {
			if (!world.isClientSide()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().broadcastMessage(new TextComponent("?????????????????QQ???????????"), ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
