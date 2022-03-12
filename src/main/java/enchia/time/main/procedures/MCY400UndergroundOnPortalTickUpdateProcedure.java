package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import enchia.time.main.init.TimeModMobEffects;

public class MCY400UndergroundOnPortalTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
			if (world instanceof Level _level)
				_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
						_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
		} else {
			if (Math.random() < 0.3) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
			}
			if (Math.random() < 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 1, (false), (false)));
			}
		}
	}
}
