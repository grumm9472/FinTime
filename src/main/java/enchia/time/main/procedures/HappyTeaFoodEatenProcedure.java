package enchia.time.main.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class HappyTeaFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 255, (false), (false)));
		} else {
			if (Math.random() < 0.3) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 255, (false), (false)));
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 300, 255, (false), (false)));
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 255, (false), (false)));
					} else {
						if (Math.random() < 0.3) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 255, (false), (false)));
						} else {
							if (Math.random() < 0.3) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 255, (false), (false)));
							} else {
								if (Math.random() < 0.3) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 255, (false), (false)));
								} else {
									if (Math.random() < 0.3) {
										if (entity instanceof LivingEntity _entity)
											_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 255, (false), (false)));
									} else {
										if (Math.random() < 0.3) {
											if (entity instanceof LivingEntity _entity)
												_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 255, (false), (false)));
										} else {
											if (Math.random() < 0.3) {
												if (entity instanceof LivingEntity _entity)
													_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 300, 255, (false), (false)));
											} else {
												if (Math.random() < 0.3) {
													if (entity instanceof LivingEntity _entity)
														_entity.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 300, 255, (false), (false)));
												} else {
													if (world instanceof Level _level && !_level.isClientSide())
														_level.explode(null, x, y, z, 20, Explosion.BlockInteraction.BREAK);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
