
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class SuperNetherStarItem extends Item {
	public SuperNetherStarItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("super_nether_star");
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
