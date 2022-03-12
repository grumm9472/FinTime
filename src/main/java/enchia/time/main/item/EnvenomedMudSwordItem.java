
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import enchia.time.main.procedures.EnvenomedMudSwordMobIsHitWithToolProcedure;
import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class EnvenomedMudSwordItem extends SwordItem {
	public EnvenomedMudSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 60;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.MUD_BALL));
			}
		}, 3, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("envenomed_mud_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		EnvenomedMudSwordMobIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
