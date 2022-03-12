
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class XpBottleOfInfinityItem extends Item {
	public XpBottleOfInfinityItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("xp_bottle_of_infinity");
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
