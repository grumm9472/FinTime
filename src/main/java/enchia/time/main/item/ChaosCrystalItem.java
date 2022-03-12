
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import enchia.time.main.procedures.ChaosCrystalItemInInventoryTickProcedure;
import enchia.time.main.init.TimeModTabs;

public class ChaosCrystalItem extends Item {
	public ChaosCrystalItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("chaos_crystal");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ChaosCrystalItemInInventoryTickProcedure.execute(entity);
	}
}
