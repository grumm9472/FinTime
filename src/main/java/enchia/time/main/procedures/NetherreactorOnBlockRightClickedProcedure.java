package enchia.time.main.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

import enchia.time.main.init.TimeModBlocks;

public class NetherreactorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
					if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.COBBLESTONE) {
						if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.COBBLESTONE) {
							if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0)))).getBlock() == Blocks.COBBLESTONE) {
								if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
										.getBlock() == Blocks.GOLD_BLOCK) {
									if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
											.getBlock() == Blocks.GOLD_BLOCK) {
										if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))))
												.getBlock() == Blocks.GOLD_BLOCK) {
											if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
													.getBlock() == Blocks.GOLD_BLOCK) {
												if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
														.getBlock() == Blocks.GOLD_BLOCK) {
													if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
															.getBlock() == Blocks.COBBLESTONE) {
														if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
																.getBlock() == Blocks.COBBLESTONE) {
															if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
																	.getBlock() == Blocks.COBBLESTONE) {
																if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1))))
																		.getBlock() == Blocks.COBBLESTONE) {
																	if ((world
																			.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))))
																					.getBlock() == Blocks.COBBLESTONE) {
																		if ((world.getBlockState(
																				new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))
																						.getBlock() == Blocks.COBBLESTONE) {
																			if ((world.getBlockState(
																					new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1))))
																							.getBlock() == Blocks.COBBLESTONE) {
																				if ((world.getBlockState(
																						new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))))
																								.getBlock() == Blocks.COBBLESTONE) {
																					world.setBlock(
																							new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
																							TimeModBlocks.GLOWINGOBSIDIAN.defaultBlockState(), 3);
																					world.setBlock(new BlockPos((int) x, (int) y, (int) z),
																							TimeModBlocks.NETHERREACTOR_2.defaultBlockState(), 3);
																					if (world instanceof Level _level && !_level.isClientSide())
																						_level.explode(null, x, y, z, 6,
																								Explosion.BlockInteraction.BREAK);
																					if (world instanceof ServerLevel _level)
																						_level.setDayTime(20000);
																					if (entity instanceof ServerPlayer _player) {
																						Advancement _adv = _player.server.getAdvancements()
																								.getAdvancement(new ResourceLocation(
																										"time:carefulexplosion"));
																						AdvancementProgress _ap = _player.getAdvancements()
																								.getOrStartProgress(_adv);
																						if (!_ap.isDone()) {
																							Iterator _iterator = _ap.getRemainingCriteria()
																									.iterator();
																							while (_iterator.hasNext())
																								_player.getAdvancements().award(_adv,
																										(String) _iterator.next());
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
