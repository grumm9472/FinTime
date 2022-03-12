
package enchia.time.main.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class IceStickItem extends Item {
	public IceStickItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ice_stick");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
