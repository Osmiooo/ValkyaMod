package valkya.valkya.mod.registry;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;
import valkya.valkya.mod.toolmaterial.*;

public class RegisterItems {

    public static final Item CESIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ZIRCONIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static ToolItem CESIUM_SWORD = new SwordItem(CesiumToolMaterial.INSTANCE, 0, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof());
    public static ToolItem CESIUM_SHOVEL = new ShovelItem(ZirconiumToolMaterial.INSTANCE, -1.5f, -2.4f, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).fireproof());
    public static ToolItem ZIRCONIUM_SWORD = new SwordItem(CesiumToolMaterial.INSTANCE, 0, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof());
    public static ToolItem ZIRCONIUM_SHOVEL = new ShovelItem(ZirconiumToolMaterial.INSTANCE, -1.5f, -2.4f, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).fireproof());


    public static void RegisterItems() {

        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_ingot"), CESIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_ingot"), ZIRCONIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_sword"), CESIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_pickaxe"), new BasePickaxe(new CesiumToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_axe"), new BaseAxe(new CesiumToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_shovel"), CESIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_hoe"), new BaseHoe(new CesiumToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_sword"), ZIRCONIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_pickaxe"), new BasePickaxe(new ZirconiumToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_axe"), new BaseAxe(new ZirconiumToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_shovel"), ZIRCONIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_hoe"), new BaseHoe(new ZirconiumToolMaterial()));

    }
}
