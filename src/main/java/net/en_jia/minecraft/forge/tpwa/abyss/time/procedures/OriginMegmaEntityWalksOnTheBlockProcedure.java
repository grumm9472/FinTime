package net.en_jia.minecraft.forge.tpwa.abyss.time.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeMod;

import java.util.Map;

public class OriginMegmaEntityWalksOnTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure OriginMegmaEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LAVA, (float) 8);
	}
}