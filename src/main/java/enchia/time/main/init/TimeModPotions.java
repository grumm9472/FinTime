
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion ANCIENTPOWERTWINS_POTION_ITEM = register(
			new Potion(new MobEffectInstance(TimeModMobEffects.ANCIENTPOWERTWINS_POTION_ITEM, 3600, 0, false, true))
					.setRegistryName("ancientpowertwins_potion_item"));
	public static final Potion TIME_CHAOS_POTION_ITEM = register(
			new Potion(new MobEffectInstance(TimeModMobEffects.TIME_CHAOS_POTION_ITEM, 3600, 0, false, true))
					.setRegistryName("time_chaos_potion_item"));
	public static final Potion XPPOTION_POTION_ITEM = register(
			new Potion(new MobEffectInstance(TimeModMobEffects.XPPOTION_POTION_ITEM, 3600, 0, false, true)).setRegistryName("xppotion_potion_item"));
	public static final Potion WARM = register(
			new Potion(new MobEffectInstance(TimeModMobEffects.WARM, 3600, 0, false, true)).setRegistryName("warm"));
	public static final Potion WARM_1 = register(
			new Potion(new MobEffectInstance(TimeModMobEffects.WARM_1, 3600, 0, false, true)).setRegistryName("warm_1"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
