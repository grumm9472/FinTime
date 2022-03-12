
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModFluids;

public class IceWaterItem extends BucketItem {
	public IceWaterItem() {
		super(() -> TimeModFluids.ICE_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(TimeModTabs.TAB_TIME));
		setRegistryName("ice_water_bucket");
	}
}
