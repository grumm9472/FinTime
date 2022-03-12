package enchia.time.main.procedures;

import net.minecraft.world.entity.Entity;

public class FirePlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
