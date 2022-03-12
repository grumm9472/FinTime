package enchia.time.main.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import enchia.time.main.init.TimeModMobEffects;

@Mod.EventBusSubscriber
public class ColdIfProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("time:mcy_400_under_ground_boime")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			} else {
				if (Math.random() < 0.4) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
				}
			}
		}
		if (new ResourceLocation("time:ice_plains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
				}
			}
		}
		if (new ResourceLocation("time:mcy_400_plains").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
				}
			}
		}
		if (new ResourceLocation("time:mcy_400f_orest").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
				}
			}
		}
		if (new ResourceLocation("time:ice").equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName())) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TimeModMobEffects.WARM_1) : false) {
				if (world instanceof Level _level)
					_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
							_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("cold").bypassArmor(), 1);
				}
			}
		}
	}
}
