
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class UserItem extends Item {
	public UserItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("user");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
