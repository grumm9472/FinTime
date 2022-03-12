package enchia.time.main.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.Collections;

import enchia.time.main.init.TimeModBlocks;

public class GhoulMatterEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("time:phantom")))) {
			if (y <= 20) {
				{
					Entity _ent = entity;
					_ent.teleportTo((Math.random() * 9999999), 256, (Math.random() * 9999999));
					if (_ent instanceof ServerPlayer _serverPlayer) {
						_serverPlayer.connection.teleport((Math.random() * 9999999), 256, (Math.random() * 9999999), _ent.getYRot(), _ent.getXRot(),
								Collections.emptySet());
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
							4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "clear");
				if (world instanceof ServerLevel _level)
					_level.setDayTime(1000);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(TimeModBlocks.NEW_DREAM_BED);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("time", "welcomeislanddream"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos((int) x, (int) 200, (int) z),
										new BlockPos((int) x, (int) 200, (int) z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("time", "welcomeislanddream"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos((int) x, (int) 200, (int) z),
												new BlockPos((int) x, (int) 200, (int) z), new StructurePlaceSettings().setRotation(Rotation.NONE)
														.setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager()
													.getOrCreate(new ResourceLocation("time", "welcomeislanddream"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos((int) x, (int) 200, (int) z),
														new BlockPos((int) x, (int) 200, (int) z), new StructurePlaceSettings()
																.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 10);
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("time", "welcomeislanddream"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z),
												new BlockPos((int) x, (int) y, (int) z), new StructurePlaceSettings().setRotation(Rotation.NONE)
														.setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 10);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 10);
			}
		}
	}
}
