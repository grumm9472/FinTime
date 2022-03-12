package enchia.time.main.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Collections;

import enchia.time.main.init.TimeModBlocks;

public class SpringEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.break")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.break")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else {
			if (world.isEmptyBlock(new BlockPos((int) x, (int) (y + 30), (int) z))) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("time:spring")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("time:spring")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (y + 30), z);
					if (_ent instanceof ServerPlayer _serverPlayer) {
						_serverPlayer.connection.teleport(x, (y + 30), z, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.SPRING_3.defaultBlockState(), 3);
				world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), TimeModBlocks.SPRING_2.defaultBlockState(), 3);
			}
		}
	}
}
