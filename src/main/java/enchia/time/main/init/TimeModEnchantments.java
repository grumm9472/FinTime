
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.enchantment.Enchantment;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.enchantment.ProtectlessEnchantment;
import enchia.time.main.enchantment.HammerEnchantment;
import enchia.time.main.enchantment.DeslaggingEnchantment;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment PROTECTLESS = register("time:protectless", new ProtectlessEnchantment());
	public static final Enchantment DESLAGGING = register("time:deslagging", new DeslaggingEnchantment());
	public static final Enchantment HAMMER = register("time:hammer", new HammerEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}
