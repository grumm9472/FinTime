
package enchia.time.main.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import enchia.time.main.procedures.ImmobilizationScrollRightClickedOnBlockProcedure;
import enchia.time.main.procedures.ImmobilizationScrollLivingEntityIsHitWithItemProcedure;
import enchia.time.main.init.TimeModTabs;

public class ImmobilizationScrollItem extends Item {
	public ImmobilizationScrollItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("immobilization_scroll");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ImmobilizationScrollRightClickedOnBlockProcedure.execute(context.getPlayer());
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ImmobilizationScrollLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
