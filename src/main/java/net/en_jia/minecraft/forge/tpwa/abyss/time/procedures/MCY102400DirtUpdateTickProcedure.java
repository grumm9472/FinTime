package net.en_jia.minecraft.forge.tpwa.abyss.time.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.en_jia.minecraft.forge.tpwa.abyss.time.block.MCY102400GrassBlock;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeMod;

import java.util.Map;

public class MCY102400DirtUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure MCY102400DirtUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure MCY102400DirtUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure MCY102400DirtUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure MCY102400DirtUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.1) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCY102400GrassBlock.block.getDefaultState(), 3);
		}
	}
}
