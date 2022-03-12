
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TimeModTabs {
	public static CreativeModeTab TAB_TIME;

	public static void load() {
		TAB_TIME = new CreativeModeTab("tabtime") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TimeModItems.LOGO);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
