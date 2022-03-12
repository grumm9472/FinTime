package enchia.time.main.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class SandTrap1DangShiTiZaiFangKuaiShangXingZouShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.IN_FIRE, 3);
	}
}
