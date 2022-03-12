
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import enchia.time.main.init.TimeModTabs;

public class BCCLItem extends Item {
	public BCCLItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("bccl");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("It used to be a shining pearl. But now it's just useless rubbish."));
	}
}
