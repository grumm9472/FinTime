
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class CrystalItemOrangeItem extends Item {
	public CrystalItemOrangeItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("crystal_item_orange");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
