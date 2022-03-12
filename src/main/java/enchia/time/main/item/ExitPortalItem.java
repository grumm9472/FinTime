
package enchia.time.main.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import enchia.time.main.procedures.ExitPortalRightClickedInAirProcedure;
import enchia.time.main.init.TimeModTabs;

public class ExitPortalItem extends Item {
	public ExitPortalItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("exit_portal");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ExitPortalRightClickedInAirProcedure.execute(world, entity);
		return ar;
	}
}
