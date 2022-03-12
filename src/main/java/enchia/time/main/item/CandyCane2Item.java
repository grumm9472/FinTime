
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CandyCane2Item extends Item {
	public CandyCane2Item() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("candy_cane_2");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
