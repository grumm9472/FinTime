package net.en_jia.minecraft.forge.tpwa.abyss.time.procedures;

import net.minecraft.entity.Entity;

import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModVariables;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeMod;

import java.util.Map;

public class SanityBar2Procedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure SanityBar2!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Sanity == 2) {
			return true;
		}
		return false;
	}
}