
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModFluids;

public class MINECRAFTYEARS100WATERItem extends BucketItem {
	public MINECRAFTYEARS100WATERItem() {
		super(() -> TimeModFluids.MINECRAFTYEARS_100_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(TimeModTabs.TAB_TIME));
		setRegistryName("minecraftyears_100_water_bucket");
	}
}
