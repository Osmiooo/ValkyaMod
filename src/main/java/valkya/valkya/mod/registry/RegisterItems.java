package valkya.valkya.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;

public class RegisterItems {


    public static final Item CESIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ZIRCONIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void RegisterItems() {

        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_ingot"), CESIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_ingot"), ZIRCONIUM_INGOT);

    }
}
