package enchia.time.main.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModBlocks;

public class BlockCouldRunBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos((int) (x + 1), (int) y, (int) z))) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), TimeModBlocks.BLOCK_COULD_RUN.defaultBlockState(), 3);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 6);
		}
	}
}
