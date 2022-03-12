
package enchia.time.main.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import enchia.time.main.procedures.AquamarineSwordMobIsHitWithToolProcedure;
import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public class EnvenomedAquamarineSwordItem extends SwordItem {
	public EnvenomedAquamarineSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1987;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.AQUAMARINE_GEM));
			}
		}, 3, -3f, new Item.Properties().tab(TimeModTabs.TAB_TIME));
		setRegistryName("envenomed_aquamarine_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		AquamarineSwordMobIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
