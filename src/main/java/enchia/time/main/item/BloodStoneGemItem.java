
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import enchia.time.main.init.TimeModTabs;

public class BloodStoneGemItem extends Item {
	public BloodStoneGemItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(63).rarity(Rarity.COMMON));
		setRegistryName("blood_stone_gem");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
