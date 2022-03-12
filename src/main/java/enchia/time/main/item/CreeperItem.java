
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

public abstract class CreeperItem extends ArmorItem {
	public CreeperItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 32;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{7, 15, 13, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 19;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TimeModItems.CREEPER_INGOT));
			}

			@Override
			public String getName() {
				return "creeper";
			}

			@Override
			public float getToughness() {
				return 2.9f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CreeperItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("creeper_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/creeperite__layer_1.png";
		}
	}

	public static class Chestplate extends CreeperItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("creeper_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/creeperite__layer_1.png";
		}
	}

	public static class Leggings extends CreeperItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("creeper_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/creeperite__layer_2.png";
		}
	}

	public static class Boots extends CreeperItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TimeModTabs.TAB_TIME));
			setRegistryName("creeper_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "time:textures/models/armor/creeperite__layer_1.png";
		}
	}
}
