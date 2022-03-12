
package enchia.time.main.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import enchia.time.main.procedures.XppotionOnPotionActiveTickProcedure;

public class XppotionMobEffect extends MobEffect {
	public XppotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13369600);
		setRegistryName("xppotion_potion_item");
	}

	@Override
	public String getDescriptionId() {
		return "effect.time.xppotion_potion_item";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		XppotionOnPotionActiveTickProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
