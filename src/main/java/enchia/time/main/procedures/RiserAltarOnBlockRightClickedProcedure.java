package enchia.time.main.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import enchia.time.main.network.TimeModVariables;
import enchia.time.main.init.TimeModItems;
import enchia.time.main.init.TimeModEntities;
import enchia.time.main.entity.RiserEntity;

public class RiserAltarOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().isThundering()) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(TimeModItems.CHANGED_RISE_RUNE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(TimeModItems.CHANGED_RISE_RUNE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("Riser is awake now\uFF01"), ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RiserEntity(TimeModEntities.RISER, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				world.getLevelData().setRaining((true));
				if (world instanceof ServerLevel _level)
					_level.setDayTime(20000);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("time:stone_normal")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("time:stone_normal")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else {
				if (TimeModVariables.MapVariables.get(world).Language == 0) {
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("You do not have Rise Rune?"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
				if (TimeModVariables.MapVariables.get(world).Language == 1) {
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("???????????"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
				if (TimeModVariables.MapVariables.get(world).Language == 2) {
					if (!world.isClientSide()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().broadcastMessage(new TextComponent("??????????!"), ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
		} else {
			if (TimeModVariables.MapVariables.get(world).Language == 0) {
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("The Weather is not thunderstorm\uFF01"), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
			}
			if (TimeModVariables.MapVariables.get(world).Language == 1) {
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("??????????"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			}
			if (TimeModVariables.MapVariables.get(world).Language == 2) {
				if (!world.isClientSide()) {
					MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
					if (mcserv != null)
						mcserv.getPlayerList().broadcastMessage(new TextComponent("??????????"), ChatType.SYSTEM, Util.NIL_UUID);
				}
			}
		}
	}
}
