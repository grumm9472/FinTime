package enchia.time.main.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CheatCiGUIKaiQiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("breakfast")) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(1000);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else {
			if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("goodnight")) {
				if (entity instanceof Player _player)
					_player.closeContainer();
				if (world instanceof ServerLevel _level)
					_level.setDayTime(13000);
			} else {
				if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("rocket")) {
					if (entity instanceof Player _player)
						_player.closeContainer();
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000000, 5, (false), (false)));
				} else {
					if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("milk")) {
						if (entity instanceof Player _player)
							_player.closeContainer();
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands()
										.performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect clear @s");
						}
					} else {
						if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
								.equals("goodbye")) {
							if (entity instanceof Player _player)
								_player.closeContainer();
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands()
											.performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "kill");
							}
						} else {
							if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
									.equals("skyfall")) {
								if (entity instanceof Player _player)
									_player.closeContainer();
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null)
										_ent.getServer().getCommands().performCommand(
												_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tp @s ~ 255 ~");
								}
							} else {
								if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
										.equals("loser!!!")) {
									if (entity instanceof Player _player)
										_player.closeContainer();
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000000, 255, (false), (false)));
								} else {
									if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
											.equals("main")) {
										if (entity instanceof Player _player)
											_player.closeContainer();
										if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
											ResourceKey<Level> destinationType = Level.OVERWORLD;
											if (_player.level.dimension() == destinationType)
												return;
											ServerLevel nextLevel = _player.server.getLevel(destinationType);
											if (nextLevel != null) {
												_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
												_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(),
														nextLevel.getSharedSpawnPos().getY() + 1, nextLevel.getSharedSpawnPos().getZ(),
														_player.getYRot(), _player.getXRot());
												_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
												for (MobEffectInstance effectinstance : _player.getActiveEffects())
													_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), effectinstance));
												_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
											}
										}
									} else {
										if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
												.equals("gm1")) {
											if (entity instanceof Player _player)
												_player.closeContainer();
											if (world instanceof ServerLevel _level)
												_level.getServer().getCommands().performCommand(
														new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
																new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
														"gamemode survival");
										} else {
											if ((guistate.containsKey("text:Cheat_code")
													? ((EditBox) guistate.get("text:Cheat_code")).getValue()
													: "").equals("loser!!!")) {
												if (entity instanceof Player _player)
													_player.closeContainer();
												if (entity instanceof LivingEntity _entity)
													_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000000, 255, (false), (false)));
											} else {
												if (entity instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(new TextComponent("Invalid content!"), (false));
												if (entity instanceof Player _player)
													_player.closeContainer();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
