
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import enchia.time.main.init.TimeModTabs;

public class CandyCane2RelItem extends Item {
	public CandyCane2RelItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

						.build()));
		setRegistryName("candy_cane_2_rel");
	}
}
