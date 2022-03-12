
package enchia.time.main.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import enchia.time.main.procedures.CoordinateLocatorRightClickedOnBlockProcedure;
import enchia.time.main.init.TimeModTabs;

public class CoordinateLocatorItem extends Item {
	public CoordinateLocatorItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("coordinate_locator");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		CoordinateLocatorRightClickedOnBlockProcedure.execute(context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
