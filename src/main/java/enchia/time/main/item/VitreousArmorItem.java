
package enchia.time.main.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import enchia.time.main.init.TimeModTabs;
import enchia.time.main.init.TimeModItems;

public abstract class VitreousArmorItem extends ArmorItem {
	public VitreousArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.VITREOUS));
			}

			@Override
			public String getName() {
				return "vitreous_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends VitreousArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("vitreous_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/bloodstone__layer_1.png";
		}
	}

	public static class Chestplate extends VitreousArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("vitreous_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/bloodstone__layer_1.png";
		}
	}

	public static class Leggings extends VitreousArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("vitreous_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/bloodstone__layer_2.png";
		}
	}

	public static class Boots extends VitreousArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("vitreous_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/bloodstone__layer_1.png";
		}
	}
}
