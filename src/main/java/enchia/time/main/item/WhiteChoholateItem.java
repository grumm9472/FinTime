
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import enchia.time.main.init.TimeModTabs;

public class WhiteChoholateItem extends Item {
	public WhiteChoholateItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("white_choholate");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 12;
	}
}
