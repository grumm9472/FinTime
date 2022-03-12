package enchia.time.main.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import enchia.time.main.init.TimeModItems;
import enchia.time.main.init.TimeModBlocks;

@Mod.EventBusSubscriber
public class TickMCY100Procedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("time:longlongago")))
						.isDone()
				: false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(TimeModItems.USER)) : false) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(""), (true));
			} else {
				if (Math.random() < 0.01) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("\u00A74Warning! The timeline is out of order! You are in danger!"), (false));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos((int) x, (int) y, (int) z)));
						entityToSpawn.setVisualOnly(false);
						_level.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.TIME_MACHINE.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.LAVA.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), Blocks.WATER.defaultBlockState(), 3);
					world.setBlock(new BlockPos((int) x, (int) y, (int) z), TimeModBlocks.BREADBLOCK.defaultBlockState(), 3);
					if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
						Arrow entityToSpawn = new Arrow(_ent_sa.level, _ent_sa);
						entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1, 0);
						entityToSpawn.setBaseDamage(5);
						entityToSpawn.setKnockback(5);
						_ent_sa.level.addFreshEntity(entityToSpawn);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(TimeModBlocks.RUNE_GRASS);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
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
					if (world instanceof ServerLevel _level)
						_level.setDayTime(1);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Back to the portal!"), (false));
					if (Math.random() < 0.3) {
						if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY,
									new ResourceLocation("time:silentia"));
							if (_player.level.dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
										nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
		}
	}
}
