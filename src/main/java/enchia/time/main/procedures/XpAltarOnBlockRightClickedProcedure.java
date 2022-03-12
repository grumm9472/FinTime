package enchia.time.main.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import enchia.time.main.network.TimeModVariables;
import enchia.time.main.init.TimeModEntities;
import enchia.time.main.init.TimeModBlocks;
import enchia.time.main.entity.ExpLordEntity;

public class XpAltarOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == TimeModBlocks.XP_BLOCKO) {
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == TimeModBlocks.XP_BLOCKO) {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == TimeModBlocks.MAGIC_BLOCKO) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == TimeModBlocks.MAGIC_BLOCKO) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ExpLordEntity(TimeModEntities.EXP_LORD, _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (TimeModVariables.MapVariables.get(world).Language == 0) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("Exp Lord summoned!"), (false));
						}
						if (TimeModVariables.MapVariables.get(world).Language == 1) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("???????"), (false));
						}
						if (TimeModVariables.MapVariables.get(world).Language == 2) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("?????????"), (false));
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
										SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof Level _level && !_level.isClientSide())
							_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos((int) x, (int) y, (int) z)));
							entityToSpawn.setVisualOnly(false);
							_level.addFreshEntity(entityToSpawn);
						}
						world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 2)), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos((int) (x - 2), (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
