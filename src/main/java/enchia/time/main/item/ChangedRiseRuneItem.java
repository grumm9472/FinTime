
package enchia.time.main.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import enchia.time.main.procedures.ChangedRiseRuneRightClickedOnBlockProcedure;
import enchia.time.main.init.TimeModTabs;

public class ChangedRiseRuneItem extends Item {
	public ChangedRiseRuneItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("changed_rise_rune");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ChangedRiseRuneRightClickedOnBlockProcedure.execute(

		);
		return retval;
	}
}
