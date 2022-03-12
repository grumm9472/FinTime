
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class ClassicGoldenItem extends Item {
	public ClassicGoldenItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("classic_golden");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
