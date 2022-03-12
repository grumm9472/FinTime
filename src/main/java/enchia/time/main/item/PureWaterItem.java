
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModFluids;

public class PureWaterItem extends BucketItem {
	public PureWaterItem() {
		super(() -> TimeModFluids.PURE_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(TimeModTabs.TAB_TIME));
		setRegistryName("pure_water_bucket");
	}
}
