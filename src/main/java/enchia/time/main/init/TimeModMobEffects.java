
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.potion.XppotionMobEffect;
import enchia.time.main.potion.WarmMobEffect;
import enchia.time.main.potion.Warm1MobEffect;
import enchia.time.main.potion.TimeChaosMobEffect;
import enchia.time.main.potion.AncientpowertwinsMobEffect;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect ANCIENTPOWERTWINS_POTION_ITEM = register(new AncientpowertwinsMobEffect());
	public static final MobEffect TIME_CHAOS_POTION_ITEM = register(new TimeChaosMobEffect());
	public static final MobEffect XPPOTION_POTION_ITEM = register(new XppotionMobEffect());
	public static final MobEffect WARM = register(new WarmMobEffect());
	public static final MobEffect WARM_1 = register(new Warm1MobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
