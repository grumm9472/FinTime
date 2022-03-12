
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import enchia.time.main.init.TimeModTabs;

public class CherriesItem extends Item {
	public CherriesItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("cherries");
	}
}
