
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class CrystalItemIceBlueItem extends Item {
	public CrystalItemIceBlueItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("crystal_item_ice_blue");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
