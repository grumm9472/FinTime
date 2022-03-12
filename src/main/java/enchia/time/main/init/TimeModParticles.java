
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.Minecraft;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

import enchia.time.main.client.particle.Leavesfall100Particle;
import enchia.time.main.client.particle.Leaves2Particle;
import enchia.time.main.client.particle.Leaves1Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TimeModParticles {
	private static final Map<ParticleType<?>, Function<SpriteSet, ParticleProvider<SimpleParticleType>>> REGISTRY = new HashMap<>();
	public static final SimpleParticleType LEAVESFALL_100 = register(new SimpleParticleType(false).setRegistryName("leavesfall_100"),
			Leavesfall100Particle::provider);
	public static final SimpleParticleType LEAVES_1 = register(new SimpleParticleType(false).setRegistryName("leaves_1"), Leaves1Particle::provider);
	public static final SimpleParticleType LEAVES_2 = register(new SimpleParticleType(false).setRegistryName("leaves_2"), Leaves2Particle::provider);

	private static SimpleParticleType register(ParticleType<?> particle, Function<SpriteSet, ParticleProvider<SimpleParticleType>> provider) {
		REGISTRY.put(particle, provider);
		return (SimpleParticleType) particle;
	}

	@SubscribeEvent
	public static void registerParticleTypes(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new ParticleType[0]));
	}

	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		REGISTRY.forEach((particle, provider) -> Minecraft.getInstance().particleEngine.register((SimpleParticleType) particle,
				spriteSet -> provider.apply(spriteSet)));
	}
}
