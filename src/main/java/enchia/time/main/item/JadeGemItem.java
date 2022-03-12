
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class JadeGemItem extends Item {
	public JadeGemItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("jade_gem");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
