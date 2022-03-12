package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class CheatGuanBiCiGUIShiProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("breakfast")) {
			if (world instanceof ServerLevel _level)
				_level.setDayTime(1000);
		} else {
			if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("goodnight")) {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(13000);
			} else {
				if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("rocket")) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000000, 5, (false), (false)));
				} else {
					if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "").equals("milk")) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands()
										.performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect clear @s");
						}
					} else {
						if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
								.equals("goodbye")) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands()
											.performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "kill");
							}
						} else {
							if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
									.equals("skyfall")) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null)
										_ent.getServer().getCommands().performCommand(
												_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tp @s ~ 255 ~");
								}
							} else {
								if ((guistate.containsKey("text:Cheat_code") ? ((EditBox) guistate.get("text:Cheat_code")).getValue() : "")
										.equals("loser!!!")) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000000, 255, (false), (false)));
									if (entity instanceof Player _player)
										_player.closeContainer();
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
