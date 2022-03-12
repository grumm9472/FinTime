
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

public abstract class AquamarineArmorItem extends ArmorItem {
	public AquamarineArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 32;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 13, 12, 6}[slot.getIndex()];
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
				return Ingredient.of(new ItemStack(TimeModItems.AQUAMARINE_GEM));
			}

			@Override
			public String getName() {
				return "aquamarine_armor";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AquamarineArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("aquamarine_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/soul__layer_1.png";
		}
	}

	public static class Chestplate extends AquamarineArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("aquamarine_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/soul__layer_1.png";
		}
	}

	public static class Leggings extends AquamarineArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("aquamarine_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/soul__layer_2.png";
		}
	}

	public static class Boots extends AquamarineArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("aquamarine_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/soul__layer_1.png";
		}
	}
}
