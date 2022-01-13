package valkya.valkya.mod.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;
import valkya.valkya.mod.armor.CesiumArmorMaterial;
import valkya.valkya.mod.armor.ZirconiumArmorMaterial;

public class RegisterArmor {

    public static final ArmorMaterial CESIUM_ARMOR_MATERIAL = new CesiumArmorMaterial();
    public static final ArmorMaterial ZIRCONIUM_ARMOR_MATERIAL = new ZirconiumArmorMaterial();
    public static final Item CESIUM_HELMET = new ArmorItem(CESIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item CESIUM_CHESTPLATE = new ArmorItem(CESIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item CESIUM_LEGGINGS = new ArmorItem(CESIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item CESIUM_BOOTS = new ArmorItem(CESIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item ZIRCONIUM_HELMET = new ArmorItem(ZIRCONIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item ZIRCONIUM_CHESTPLATE = new ArmorItem(ZIRCONIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item ZIRCONIUM_LEGGINGS = new ArmorItem(ZIRCONIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ValkyaMod.VALKYA));
    public static final Item ZIRCONIUM_BOOTS = new ArmorItem(ZIRCONIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ValkyaMod.VALKYA));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_helmet"), CESIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_chestplate"), CESIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_leggings"), CESIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_boots"), CESIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_helmet"), ZIRCONIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_chestplate"), ZIRCONIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_leggings"), ZIRCONIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_boots"), ZIRCONIUM_BOOTS);
    }
}
