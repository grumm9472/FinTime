
package enchia.time.main.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Set;
import java.util.EnumSet;

import enchia.time.main.init.TimeModItems;
import enchia.time.main.init.TimeModEntities;

@Mod.EventBusSubscriber
public class SnowMonster3Entity extends Monster {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("time:mcy_400_plains"),
			new ResourceLocation("time:mcy_400f_orest"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(TimeModEntities.SNOW_MONSTER_3, 20, 4, 4));
	}

	public SnowMonster3Entity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(TimeModEntities.SNOW_MONSTER_3, world);
	}

	public SnowMonster3Entity(EntityType<SnowMonster3Entity> type, Level world) {
		super(type, world);
		xpReward = 55;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (SnowMonster3Entity.this.getTarget() != null && !SnowMonster3Entity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return SnowMonster3Entity.this.getMoveControl().hasWanted() && SnowMonster3Entity.this.getTarget() != null
						&& SnowMonster3Entity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = SnowMonster3Entity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				SnowMonster3Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 10);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = SnowMonster3Entity.this.getTarget();
				if (SnowMonster3Entity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					SnowMonster3Entity.this.doHurtTarget(livingentity);
				} else {
					double d0 = SnowMonster3Entity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						SnowMonster3Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 10);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(TimeModItems.HEATSTONE_POWDER));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	public static void init() {
		SpawnPlacements.register(TimeModEntities.SNOW_MONSTER_3, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 55);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 33);
		return builder;
	}
}
