package enchia.time.main.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import enchia.time.main.init.TimeModMobEffects;
import enchia.time.main.init.TimeModItems;

public class BigxppotionFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(TimeModMobEffects.XPPOTION_POTION_ITEM, 6000, 1));
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(TimeModItems.BIG_BOTTLE);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
