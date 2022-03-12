package enchia.time.main.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RandomcenterOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) z), new BlockPos((int) x, (int) y, (int) z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_utmzomibe_spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 16)),
							new BlockPos((int) x, (int) y, (int) (z - 16)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 16)),
							new BlockPos((int) x, (int) y, (int) (z - 16)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 8)), new BlockPos((int) x, (int) y, (int) (z + 8)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 8)), new BlockPos((int) x, (int) y, (int) (z + 8)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 8)), new BlockPos((int) x, (int) y, (int) (z - 8)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 8)), new BlockPos((int) x, (int) y, (int) (z - 8)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_phantom_spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 24)),
							new BlockPos((int) x, (int) y, (int) (z + 24)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_blaze_spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 24)),
							new BlockPos((int) x, (int) y, (int) (z + 24)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_slime_spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 16)),
							new BlockPos((int) x, (int) y, (int) (z + 16)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "spawn_slime_spawn"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 16)),
							new BlockPos((int) x, (int) y, (int) (z + 16)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 24)),
							new BlockPos((int) x, (int) y, (int) (z - 24)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 24)),
							new BlockPos((int) x, (int) y, (int) (z - 24)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 32)),
							new BlockPos((int) x, (int) y, (int) (z + 32)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 32)),
							new BlockPos((int) x, (int) y, (int) (z + 32)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 32)),
							new BlockPos((int) x, (int) y, (int) (z - 32)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 32)),
							new BlockPos((int) x, (int) y, (int) (z - 32)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 40)),
							new BlockPos((int) x, (int) y, (int) (z + 40)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 40)),
							new BlockPos((int) x, (int) y, (int) (z + 40)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 40)),
							new BlockPos((int) x, (int) y, (int) (z - 40)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 40)),
							new BlockPos((int) x, (int) y, (int) (z - 40)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 48)),
							new BlockPos((int) x, (int) y, (int) (z - 48)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 48)),
							new BlockPos((int) x, (int) y, (int) (z + 48)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 56)),
							new BlockPos((int) x, (int) y, (int) (z - 56)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 56)),
							new BlockPos((int) x, (int) y, (int) (z - 56)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 56)),
							new BlockPos((int) x, (int) y, (int) (z + 56)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 56)),
							new BlockPos((int) x, (int) y, (int) (z + 56)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 64)),
							new BlockPos((int) x, (int) y, (int) (z - 64)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 64)),
							new BlockPos((int) x, (int) y, (int) (z - 64)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 64)),
							new BlockPos((int) x, (int) y, (int) (z + 64)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 64)),
							new BlockPos((int) x, (int) y, (int) (z + 64)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new BlockPos((int) x, (int) y, (int) (z + 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new BlockPos((int) x, (int) y, (int) (z + 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new BlockPos((int) x, (int) y, (int) (z + 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new BlockPos((int) x, (int) y, (int) (z + 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 72)),
							new BlockPos((int) x, (int) y, (int) (z - 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 72)),
							new BlockPos((int) x, (int) y, (int) (z - 72)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 80)),
							new BlockPos((int) x, (int) y, (int) (z + 80)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 80)),
								new BlockPos((int) x, (int) y, (int) (z + 80)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 80)),
								new BlockPos((int) x, (int) y, (int) (z - 80)),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new BlockPos((int) x, (int) y, (int) (z + 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new BlockPos((int) x, (int) y, (int) (z + 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new BlockPos((int) x, (int) y, (int) (z - 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new BlockPos((int) x, (int) y, (int) (z - 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new BlockPos((int) x, (int) y, (int) (z + 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new BlockPos((int) x, (int) y, (int) (z + 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new BlockPos((int) x, (int) y, (int) (z - 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new BlockPos((int) x, (int) y, (int) (z - 88)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 96)),
							new BlockPos((int) x, (int) y, (int) (z + 96)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 96)),
							new BlockPos((int) x, (int) y, (int) (z + 96)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 96)),
							new BlockPos((int) x, (int) y, (int) (z - 96)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 96)),
							new BlockPos((int) x, (int) y, (int) (z - 96)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new BlockPos((int) x, (int) y, (int) (z + 104)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new BlockPos((int) x, (int) y, (int) (z + 104)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new BlockPos((int) x, (int) y, (int) (z + 104)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 104)),
							new BlockPos((int) x, (int) y, (int) (z - 104)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 112)), new BlockPos((int) x, (int) y, (int) (z + 112)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 112)), new BlockPos((int) x, (int) y, (int) (z - 112)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 120)), new BlockPos((int) x, (int) y, (int) (z + 120)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 120)), new BlockPos((int) x, (int) y, (int) (z - 120)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 128)), new BlockPos((int) x, (int) y, (int) (z + 128)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 128)), new BlockPos((int) x, (int) y, (int) (z - 128)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 136)), new BlockPos((int) x, (int) y, (int) (z + 136)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 136)), new BlockPos((int) x, (int) y, (int) (z - 136)),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 148)),
							new BlockPos((int) x, (int) y, (int) (z + 148)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 148)),
							new BlockPos((int) x, (int) y, (int) (z + 148)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 148)),
							new BlockPos((int) x, (int) y, (int) (z - 148)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 148)),
							new BlockPos((int) x, (int) y, (int) (z - 148)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 156)),
							new BlockPos((int) x, (int) y, (int) (z + 156)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 156)),
							new BlockPos((int) x, (int) y, (int) (z + 156)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 156)),
							new BlockPos((int) x, (int) y, (int) (z - 156)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 156)),
							new BlockPos((int) x, (int) y, (int) (z - 156)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 164)),
							new BlockPos((int) x, (int) y, (int) (z + 164)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 164)),
							new BlockPos((int) x, (int) y, (int) (z + 164)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new BlockPos((int) x, (int) y, (int) (z - 164)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new BlockPos((int) x, (int) y, (int) (z - 164)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "boss_room_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z + 172)),
							new BlockPos((int) x, (int) y, (int) (z + 172)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("time", "undefined"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new BlockPos((int) x, (int) y, (int) (z - 164)),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
