
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import enchia.time.main.procedures.SuperCrystalItemIsCraftedsmeltedProcedure;
import enchia.time.main.init.TimeModTabs;

public class SuperCrystalItem extends Item {
	public SuperCrystalItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("super_crystal");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SuperCrystalItemIsCraftedsmeltedProcedure.execute(entity);
	}
}
