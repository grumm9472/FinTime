
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class MummyHeartItem extends Item {
	public MummyHeartItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("mummy_heart");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
