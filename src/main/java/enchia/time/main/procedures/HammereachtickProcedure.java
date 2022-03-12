package enchia.time.main.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.Random;

import enchia.time.main.init.TimeModEnchantments;

@Mod.EventBusSubscriber
public class HammereachtickProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if (!entity.isShiftKeyDown()) {
			pickaxe = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			EnchtSize = EnchantmentHelper.getItemEnchantmentLevel(TimeModEnchantments.HAMMER, (pickaxe));
			i = x - EnchtSize;
			for (int index0 = 0; index0 < (int) (EnchtSize * 2 + 1); index0++) {
				j = y - EnchtSize;
				for (int index1 = 0; index1 < (int) (EnchtSize * 2 + 1); index1++) {
					k = z - EnchtSize;
					for (int index2 = 0; index2 < (int) (EnchtSize * 2 + 1); index2++) {
						if (world.getBlockState(new BlockPos((int) i, (int) j, (int) k)).canOcclude()
								&& (pickaxe).getItem().isCorrectToolForDrops((world.getBlockState(new BlockPos((int) i, (int) j, (int) k))))
								&& world.getBlockState(new BlockPos((int) i, (int) j, (int) k)).getDestroySpeed(world,
										new BlockPos((int) i, (int) j, (int) k)) >= 0) {
							if (new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
									} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
														.getGameMode() == GameType.CREATIVE;
									}
									return false;
								}
							}.checkGamemode(entity)) {
								world.destroyBlock(new BlockPos((int) i, (int) j, (int) k), false);
							} else {
								if (world instanceof Level) {
									Block.dropResources(world.getBlockState(new BlockPos((int) i, (int) j, (int) k)), (Level) world,
											new BlockPos((int) i, (int) j, (int) k));
									world.destroyBlock(new BlockPos((int) i, (int) j, (int) k), false);
								}
								{
									ItemStack _ist = (pickaxe);
									if (_ist.hurt(1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamageValue(0);
									}
								}
							}
						}
						k = k + 1;
					}
					j = j + 1;
				}
				i = i + 1;
			}
		}
	}
}
