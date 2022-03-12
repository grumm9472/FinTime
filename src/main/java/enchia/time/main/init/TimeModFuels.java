
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class TimeModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == TimeModItems.GOLDEN_COAL)
			event.setBurnTime(19800);
		else if (event.getItemStack().getItem() == TimeModItems.FROZEN_COALFUEL)
			event.setBurnTime(1600);
	}
}
