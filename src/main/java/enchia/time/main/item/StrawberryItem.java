
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import enchia.time.main.init.TimeModTabs;

public class StrawberryItem extends Item {
	public StrawberryItem() {
		super(new Item.Properties().tab(TimeModTabs.TAB_TIME).stacksTo(16).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.2f).alwaysEat()

						.build()));
		setRegistryName("strawberry");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Some strawberries are a little sour"));
		list.add(new TextComponent("but most of them are sweet."));
	}
}
