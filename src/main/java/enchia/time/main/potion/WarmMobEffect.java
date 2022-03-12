
package enchia.time.main.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WarmMobEffect extends MobEffect {
	public WarmMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3342388);
		setRegistryName("warm");
	}

	@Override
	public String getDescriptionId() {
		return "effect.time.warm";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
