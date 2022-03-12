package enchia.time.main.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;
import java.util.Collections;

import enchia.time.main.init.TimeModBlocks;

public class MCY400UndergroundPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos((int) 0, (int) 100, (int) 0), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) 0, (int) 101, (int) 0), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) 0, (int) 102, (int) 0), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) 0, (int) 109, (int) 0), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos((int) 0, (int) 108, (int) 0), TimeModBlocks.GLOW_STONE_BRICK.defaultBlockState(), 3);
		{
			Entity _ent = entity;
			_ent.teleportTo(0, 100, 0);
			if (_ent instanceof ServerPlayer _serverPlayer) {
				_serverPlayer.connection.teleport(0, 100, 0, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
			}
		}
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("time:eternal_frost"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
	}
}
