
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class BigBottleItem extends Item {
	public BigBottleItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("big_bottle");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
