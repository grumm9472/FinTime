
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ZivicioItem extends Item {
	public ZivicioItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("zivicio");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
