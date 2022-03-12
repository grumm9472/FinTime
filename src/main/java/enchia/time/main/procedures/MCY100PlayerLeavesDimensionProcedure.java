package enchia.time.main.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import enchia.time.main.init.TimeModMobEffects;
import enchia.time.main.init.TimeModBlocks;

public class MCY100PlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(TimeModBlocks.MCY_100_OBSIDIAN)) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(TimeModMobEffects.ANCIENTPOWERTWINS_POTION_ITEM, 999999, 1));
		}
	}
}
