package enchia.time.main.procedures;

import net.minecraft.world.entity.Entity;

import enchia.time.main.network.TimeModVariables;

public class SleepBar1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Sleep == 1) {
			return true;
		}
		return false;
	}
}
