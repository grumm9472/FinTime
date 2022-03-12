
package enchia.time.main.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;

import java.util.HashMap;
import java.util.Arrays;

import enchia.time.main.procedures.TimeStructureSpawn2CommandExecutedProcedure;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class TimeStructureSpawn2Command {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("TimeStructureSpawn Dungeon_1").requires(s -> s.hasPermission(4))
						.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(TimeStructureSpawn2Command::execute))
						.executes(TimeStructureSpawn2Command::execute));
	}

	private static int execute(CommandContext<CommandSourceStack> ctx) {
		ServerLevel world = ctx.getSource().getLevel();
		double x = ctx.getSource().getPosition().x();
		double y = ctx.getSource().getPosition().y();
		double z = ctx.getSource().getPosition().z();
		Entity entity = ctx.getSource().getEntity();
		if (entity == null)
			entity = FakePlayerFactory.getMinecraft(world);
		HashMap<String, String> cmdparams = new HashMap<>();
		int[] index = {-1};
		Arrays.stream(ctx.getInput().split("\\s+")).forEach(param -> {
			if (index[0] >= 0)
				cmdparams.put(Integer.toString(index[0]), param);
			index[0]++;
		});

		TimeStructureSpawn2CommandExecutedProcedure.execute(world, x, y, z);
		return 0;
	}
}
