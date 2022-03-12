
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import enchia.time.main.procedures.XpLordHeartItemInInventoryTickProcedure;
import enchia.time.main.init.TimeModTabs;

public class XpLordHeartItem extends Item {
	public XpLordHeartItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.COMMON));
		setRegistryName("xp_lord_heart");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		XpLordHeartItemInInventoryTickProcedure.execute(entity);
	}
}
