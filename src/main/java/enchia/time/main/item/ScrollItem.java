
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class ScrollItem extends Item {
	public ScrollItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(32).rarity(Rarity.COMMON));
		setRegistryName("scroll");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
