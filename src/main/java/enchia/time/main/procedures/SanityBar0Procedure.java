package enchia.time.main.procedures;

import net.minecraft.world.entity.Entity;

import enchia.time.main.network.TimeModVariables;

public class SanityBar0Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Sanity == 0) {
			return true;
		}
		return false;
	}
}
