
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class SnowflakeItem extends Item {
	public SnowflakeItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("snowflake");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
