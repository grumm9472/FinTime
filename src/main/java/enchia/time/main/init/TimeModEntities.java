
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package enchia.time.main.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

import enchia.time.main.entity.WoodEntity;
import enchia.time.main.entity.WaterEntity;
import enchia.time.main.entity.SuperTorchEntity;
import enchia.time.main.entity.StarFuryEntity;
import enchia.time.main.entity.SpikeEntity;
import enchia.time.main.entity.SnowMonsterEntity;
import enchia.time.main.entity.SnowMonster5Entity;
import enchia.time.main.entity.SnowMonster4Entity;
import enchia.time.main.entity.SnowMonster3Entity;
import enchia.time.main.entity.SnowMonster2Entity;
import enchia.time.main.entity.SilentCreeperEntity;
import enchia.time.main.entity.Robber5Entity;
import enchia.time.main.entity.Robber4Entity;
import enchia.time.main.entity.Robber3Entity;
import enchia.time.main.entity.Robber2Entity;
import enchia.time.main.entity.Robber1Entity;
import enchia.time.main.entity.RiserEntity;
import enchia.time.main.entity.Riser2Entity;
import enchia.time.main.entity.PumpkinspiderEntity;
import enchia.time.main.entity.MummyZomibeEntity;
import enchia.time.main.entity.MummyKingEntity;
import enchia.time.main.entity.MimicEntity;
import enchia.time.main.entity.LivingFungiEntity;
import enchia.time.main.entity.IronEggEntity;
import enchia.time.main.entity.IcicleBowEntity;
import enchia.time.main.entity.IcebrumpEntity;
import enchia.time.main.entity.HumanEntity;
import enchia.time.main.entity.HeadlesszombieEntity;
import enchia.time.main.entity.GoldEntity;
import enchia.time.main.entity.FrogEntity;
import enchia.time.main.entity.ForstGolemEntity;
import enchia.time.main.entity.FireEntity;
import enchia.time.main.entity.ExpLordEntity;
import enchia.time.main.entity.EvilSnowmanEntity;
import enchia.time.main.entity.DiamondEggEntity;
import enchia.time.main.entity.DevilSnowmanEntity;
import enchia.time.main.entity.DemonSpiderEntity;
import enchia.time.main.entity.DeadlyFireEntity;
import enchia.time.main.entity.DarkpropagaterEntity;
import enchia.time.main.entity.CrystalSpiderEntity;
import enchia.time.main.entity.CrystalGuardianEntity;
import enchia.time.main.entity.CluckshroomEntity;
import enchia.time.main.entity.BoneSpiderEntity;
import enchia.time.main.entity.BlazingBowEntity;
import enchia.time.main.entity.AirEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<StarFuryEntity> STAR_FURY = register("entitybulletstar_fury",
			EntityType.Builder.<StarFuryEntity>of(StarFuryEntity::new, MobCategory.MISC).setCustomClientFactory(StarFuryEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IronEggEntity> IRON_EGG = register("entitybulletiron_egg",
			EntityType.Builder.<IronEggEntity>of(IronEggEntity::new, MobCategory.MISC).setCustomClientFactory(IronEggEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DiamondEggEntity> DIAMOND_EGG = register("entitybulletdiamond_egg",
			EntityType.Builder.<DiamondEggEntity>of(DiamondEggEntity::new, MobCategory.MISC).setCustomClientFactory(DiamondEggEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlazingBowEntity> BLAZING_BOW = register("entitybulletblazing_bow",
			EntityType.Builder.<BlazingBowEntity>of(BlazingBowEntity::new, MobCategory.MISC).setCustomClientFactory(BlazingBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IcicleBowEntity> ICICLE_BOW = register("entitybulleticicle_bow",
			EntityType.Builder.<IcicleBowEntity>of(IcicleBowEntity::new, MobCategory.MISC).setCustomClientFactory(IcicleBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EvilSnowmanEntity> EVIL_SNOWMAN = register("evil_snowman",
			EntityType.Builder.<EvilSnowmanEntity>of(EvilSnowmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilSnowmanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<DevilSnowmanEntity> DEVIL_SNOWMAN = register("devil_snowman",
			EntityType.Builder.<DevilSnowmanEntity>of(DevilSnowmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(259).setUpdateInterval(3).setCustomClientFactory(DevilSnowmanEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SilentCreeperEntity> SILENT_CREEPER = register("silent_creeper",
			EntityType.Builder.<SilentCreeperEntity>of(SilentCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilentCreeperEntity::new).sized(0.6f, 1.7f));
	public static final EntityType<SpikeEntity> SPIKE = register("spike",
			EntityType.Builder.<SpikeEntity>of(SpikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SpikeEntity::new).sized(0.6f, 1.7f));
	public static final EntityType<Riser2Entity> RISER_2 = register("riser_2",
			EntityType.Builder.<Riser2Entity>of(Riser2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256)
					.setUpdateInterval(3).setCustomClientFactory(Riser2Entity::new).fireImmune().sized(0.6f, 1.7f));
	public static final EntityType<DemonSpiderEntity> DEMON_SPIDER = register("demon_spider",
			EntityType.Builder.<DemonSpiderEntity>of(DemonSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DemonSpiderEntity::new).fireImmune().sized(1.4f, 0.9f));
	public static final EntityType<ExpLordEntity> EXP_LORD = register("exp_lord",
			EntityType.Builder.<ExpLordEntity>of(ExpLordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ExpLordEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<MummyKingEntity> MUMMY_KING = register("mummy_king",
			EntityType.Builder.<MummyKingEntity>of(MummyKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(257).setUpdateInterval(3).setCustomClientFactory(MummyKingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SnowMonster4Entity> SNOW_MONSTER_4 = register("snow_monster_4",
			EntityType.Builder.<SnowMonster4Entity>of(SnowMonster4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowMonster4Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SnowMonster5Entity> SNOW_MONSTER_5 = register("snow_monster_5",
			EntityType.Builder.<SnowMonster5Entity>of(SnowMonster5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(44).setUpdateInterval(3).setCustomClientFactory(SnowMonster5Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<SnowMonster2Entity> SNOW_MONSTER_2 = register("snow_monster_2",
			EntityType.Builder.<SnowMonster2Entity>of(SnowMonster2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowMonster2Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SnowMonster3Entity> SNOW_MONSTER_3 = register("snow_monster_3",
			EntityType.Builder.<SnowMonster3Entity>of(SnowMonster3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowMonster3Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<FrogEntity> FROG = register("frog",
			EntityType.Builder.<FrogEntity>of(FrogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FrogEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<DarkpropagaterEntity> DARKPROPAGATER = register("darkpropagater",
			EntityType.Builder.<DarkpropagaterEntity>of(DarkpropagaterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkpropagaterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SnowMonsterEntity> SNOW_MONSTER = register("snow_monster",
			EntityType.Builder.<SnowMonsterEntity>of(SnowMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnowMonsterEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<HeadlesszombieEntity> HEADLESSZOMBIE = register("headlesszombie",
			EntityType.Builder.<HeadlesszombieEntity>of(HeadlesszombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HeadlesszombieEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<CluckshroomEntity> CLUCKSHROOM = register("cluckshroom",
			EntityType.Builder.<CluckshroomEntity>of(CluckshroomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CluckshroomEntity::new).sized(0.6f, 0.5f));
	public static final EntityType<LivingFungiEntity> LIVING_FUNGI = register("living_fungi",
			EntityType.Builder.<LivingFungiEntity>of(LivingFungiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LivingFungiEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<CrystalGuardianEntity> CRYSTAL_GUARDIAN = register("crystal_guardian",
			EntityType.Builder.<CrystalGuardianEntity>of(CrystalGuardianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrystalGuardianEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<IcebrumpEntity> ICEBRUMP = register("icebrump",
			EntityType.Builder.<IcebrumpEntity>of(IcebrumpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(IcebrumpEntity::new).sized(0.6f, 1.7f));
	public static final EntityType<AirEntity> AIR = register("air",
			EntityType.Builder.<AirEntity>of(AirEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AirEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<WoodEntity> WOOD = register("wood",
			EntityType.Builder.<WoodEntity>of(WoodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WoodEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<GoldEntity> GOLD = register("gold",
			EntityType.Builder.<GoldEntity>of(GoldEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GoldEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<FireEntity> FIRE = register("fire",
			EntityType.Builder.<FireEntity>of(FireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FireEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<Robber1Entity> ROBBER_1 = register("robber_1",
			EntityType.Builder.<Robber1Entity>of(Robber1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Robber1Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<Robber2Entity> ROBBER_2 = register("robber_2",
			EntityType.Builder.<Robber2Entity>of(Robber2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Robber2Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<Robber3Entity> ROBBER_3 = register("robber_3",
			EntityType.Builder.<Robber3Entity>of(Robber3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Robber3Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<Robber5Entity> ROBBER_5 = register("robber_5",
			EntityType.Builder.<Robber5Entity>of(Robber5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Robber5Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<Robber4Entity> ROBBER_4 = register("robber_4",
			EntityType.Builder.<Robber4Entity>of(Robber4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Robber4Entity::new).sized(0.6f, 1.8f));
	public static final EntityType<WaterEntity> WATER = register("water",
			EntityType.Builder.<WaterEntity>of(WaterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WaterEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<HumanEntity> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HumanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PumpkinspiderEntity> PUMPKINSPIDER = register("pumpkinspider",
			EntityType.Builder.<PumpkinspiderEntity>of(PumpkinspiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PumpkinspiderEntity::new).sized(1.4f, 0.9f));
	public static final EntityType<DeadlyFireEntity> DEADLY_FIRE = register("deadly_fire",
			EntityType.Builder.<DeadlyFireEntity>of(DeadlyFireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DeadlyFireEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<BoneSpiderEntity> BONE_SPIDER = register("bone_spider",
			EntityType.Builder.<BoneSpiderEntity>of(BoneSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoneSpiderEntity::new).sized(1.4f, 0.9f));
	public static final EntityType<CrystalSpiderEntity> CRYSTAL_SPIDER = register("crystal_spider",
			EntityType.Builder.<CrystalSpiderEntity>of(CrystalSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrystalSpiderEntity::new).sized(1.4f, 0.9f));
	public static final EntityType<ForstGolemEntity> FORST_GOLEM = register("forst_golem",
			EntityType.Builder.<ForstGolemEntity>of(ForstGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForstGolemEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<MummyZomibeEntity> MUMMY_ZOMIBE = register("mummy_zomibe",
			EntityType.Builder.<MummyZomibeEntity>of(MummyZomibeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MummyZomibeEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SuperTorchEntity> SUPER_TORCH = register("entitybulletsuper_torch",
			EntityType.Builder.<SuperTorchEntity>of(SuperTorchEntity::new, MobCategory.MISC).setCustomClientFactory(SuperTorchEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RiserEntity> RISER = register("riser",
			EntityType.Builder.<RiserEntity>of(RiserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RiserEntity::new).fireImmune().sized(0.6f, 1.7f));
	public static final EntityType<MimicEntity> MIMIC = register("mimic",
			EntityType.Builder.<MimicEntity>of(MimicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MimicEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EvilSnowmanEntity.init();
			DevilSnowmanEntity.init();
			SilentCreeperEntity.init();
			SpikeEntity.init();
			Riser2Entity.init();
			DemonSpiderEntity.init();
			ExpLordEntity.init();
			MummyKingEntity.init();
			SnowMonster4Entity.init();
			SnowMonster5Entity.init();
			SnowMonster2Entity.init();
			SnowMonster3Entity.init();
			FrogEntity.init();
			DarkpropagaterEntity.init();
			SnowMonsterEntity.init();
			HeadlesszombieEntity.init();
			CluckshroomEntity.init();
			LivingFungiEntity.init();
			CrystalGuardianEntity.init();
			IcebrumpEntity.init();
			AirEntity.init();
			WoodEntity.init();
			GoldEntity.init();
			FireEntity.init();
			Robber1Entity.init();
			Robber2Entity.init();
			Robber3Entity.init();
			Robber5Entity.init();
			Robber4Entity.init();
			WaterEntity.init();
			HumanEntity.init();
			PumpkinspiderEntity.init();
			DeadlyFireEntity.init();
			BoneSpiderEntity.init();
			CrystalSpiderEntity.init();
			ForstGolemEntity.init();
			MummyZomibeEntity.init();
			RiserEntity.init();
			MimicEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EVIL_SNOWMAN, EvilSnowmanEntity.createAttributes().build());
		event.put(DEVIL_SNOWMAN, DevilSnowmanEntity.createAttributes().build());
		event.put(SILENT_CREEPER, SilentCreeperEntity.createAttributes().build());
		event.put(SPIKE, SpikeEntity.createAttributes().build());
		event.put(RISER_2, Riser2Entity.createAttributes().build());
		event.put(DEMON_SPIDER, DemonSpiderEntity.createAttributes().build());
		event.put(EXP_LORD, ExpLordEntity.createAttributes().build());
		event.put(MUMMY_KING, MummyKingEntity.createAttributes().build());
		event.put(SNOW_MONSTER_4, SnowMonster4Entity.createAttributes().build());
		event.put(SNOW_MONSTER_5, SnowMonster5Entity.createAttributes().build());
		event.put(SNOW_MONSTER_2, SnowMonster2Entity.createAttributes().build());
		event.put(SNOW_MONSTER_3, SnowMonster3Entity.createAttributes().build());
		event.put(FROG, FrogEntity.createAttributes().build());
		event.put(DARKPROPAGATER, DarkpropagaterEntity.createAttributes().build());
		event.put(SNOW_MONSTER, SnowMonsterEntity.createAttributes().build());
		event.put(HEADLESSZOMBIE, HeadlesszombieEntity.createAttributes().build());
		event.put(CLUCKSHROOM, CluckshroomEntity.createAttributes().build());
		event.put(LIVING_FUNGI, LivingFungiEntity.createAttributes().build());
		event.put(CRYSTAL_GUARDIAN, CrystalGuardianEntity.createAttributes().build());
		event.put(ICEBRUMP, IcebrumpEntity.createAttributes().build());
		event.put(AIR, AirEntity.createAttributes().build());
		event.put(WOOD, WoodEntity.createAttributes().build());
		event.put(GOLD, GoldEntity.createAttributes().build());
		event.put(FIRE, FireEntity.createAttributes().build());
		event.put(ROBBER_1, Robber1Entity.createAttributes().build());
		event.put(ROBBER_2, Robber2Entity.createAttributes().build());
		event.put(ROBBER_3, Robber3Entity.createAttributes().build());
		event.put(ROBBER_5, Robber5Entity.createAttributes().build());
		event.put(ROBBER_4, Robber4Entity.createAttributes().build());
		event.put(WATER, WaterEntity.createAttributes().build());
		event.put(HUMAN, HumanEntity.createAttributes().build());
		event.put(PUMPKINSPIDER, PumpkinspiderEntity.createAttributes().build());
		event.put(DEADLY_FIRE, DeadlyFireEntity.createAttributes().build());
		event.put(BONE_SPIDER, BoneSpiderEntity.createAttributes().build());
		event.put(CRYSTAL_SPIDER, CrystalSpiderEntity.createAttributes().build());
		event.put(FORST_GOLEM, ForstGolemEntity.createAttributes().build());
		event.put(MUMMY_ZOMIBE, MummyZomibeEntity.createAttributes().build());
		event.put(RISER, RiserEntity.createAttributes().build());
		event.put(MIMIC, MimicEntity.createAttributes().build());
	}
}
