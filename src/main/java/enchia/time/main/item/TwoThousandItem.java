
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class TwoThousandItem extends Item {
	public TwoThousandItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("two_thousand");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
