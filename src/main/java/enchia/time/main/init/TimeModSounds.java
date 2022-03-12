
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("time", "tfacenim"), new SoundEvent(new ResourceLocation("time", "tfacenim")));
		REGISTRY.put(new ResourceLocation("time", "mcy100_world_music"), new SoundEvent(new ResourceLocation("time", "mcy100_world_music")));
		REGISTRY.put(new ResourceLocation("time", "boss_music_riser"), new SoundEvent(new ResourceLocation("time", "boss_music_riser")));
		REGISTRY.put(new ResourceLocation("time", "spring"), new SoundEvent(new ResourceLocation("time", "spring")));
		REGISTRY.put(new ResourceLocation("time", "stone_normal"), new SoundEvent(new ResourceLocation("time", "stone_normal")));
		REGISTRY.put(new ResourceLocation("time", "stone_hurt"), new SoundEvent(new ResourceLocation("time", "stone_hurt")));
		REGISTRY.put(new ResourceLocation("time", "deadly_fire_hurt"), new SoundEvent(new ResourceLocation("time", "deadly_fire_hurt")));
		REGISTRY.put(new ResourceLocation("time", "deadly_fire_normal"), new SoundEvent(new ResourceLocation("time", "deadly_fire_normal")));
		REGISTRY.put(new ResourceLocation("time", "mcysound"), new SoundEvent(new ResourceLocation("time", "mcysound")));
		REGISTRY.put(new ResourceLocation("time", "creepy"), new SoundEvent(new ResourceLocation("time", "creepy")));
		REGISTRY.put(new ResourceLocation("time", "mcy25600a"), new SoundEvent(new ResourceLocation("time", "mcy25600a")));
		REGISTRY.put(new ResourceLocation("time", "mcy102400a"), new SoundEvent(new ResourceLocation("time", "mcy102400a")));
		REGISTRY.put(new ResourceLocation("time", "mcy1600a"), new SoundEvent(new ResourceLocation("time", "mcy1600a")));
		REGISTRY.put(new ResourceLocation("time", "mcycreepy"), new SoundEvent(new ResourceLocation("time", "mcycreepy")));
		REGISTRY.put(new ResourceLocation("time", "mcy100b"), new SoundEvent(new ResourceLocation("time", "mcy100b")));
		REGISTRY.put(new ResourceLocation("time", "mcy100c"), new SoundEvent(new ResourceLocation("time", "mcy100c")));
		REGISTRY.put(new ResourceLocation("time", "mcy400a"), new SoundEvent(new ResourceLocation("time", "mcy400a")));
		REGISTRY.put(new ResourceLocation("time", "mcy400b"), new SoundEvent(new ResourceLocation("time", "mcy400b")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
