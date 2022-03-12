
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class LifeWaterItem extends Item {
	public LifeWaterItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("life_water");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
