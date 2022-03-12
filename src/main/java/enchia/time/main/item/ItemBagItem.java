
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import enchia.time.main.procedures.ItemBagYouJianDanJiShiProcedure;
import enchia.time.main.init.TimeModTabs;

public class ItemBagItem extends Item {
	public ItemBagItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("item_bag");
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
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ItemBagYouJianDanJiShiProcedure.execute(entity);
		return ar;
	}
}
