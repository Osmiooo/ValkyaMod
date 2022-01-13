package valkya.valkya.mod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;
import valkya.valkya.mod.blocks.*;

public class RegisterBlocks {


    public static final Block CESIUM_BLOCK = new CesiumBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f));
    public static final Block ZIRCONIUM_BLOCK = new ZirconiumBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f));
    public static final Block CESIUM_ORE_BLOCK = new CesiumOreBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3f, 3f));
    public static final Block ZIRCONIUM_ORE_BLOCK = new ZirconiumOreBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3f, 3f));
    public static final Block CESIUM_CHEST_BLOCK = new CesiumChestBlock(FabricBlockSettings.of(Material.METAL));

    public static void RegisterBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "cesium_block"), CESIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_block"), new BlockItem(CESIUM_BLOCK, new FabricItemSettings().group(ValkyaMod.VALKYA)));
        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "zirconium_block"), ZIRCONIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_block"), new BlockItem(ZIRCONIUM_BLOCK, new FabricItemSettings().group(ValkyaMod.VALKYA)));
        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "cesium_ore"), CESIUM_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_ore"), new BlockItem(CESIUM_ORE_BLOCK, new FabricItemSettings().group(ValkyaMod.VALKYA)));
        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "zirconium_ore"), ZIRCONIUM_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "zirconium_ore"), new BlockItem(ZIRCONIUM_ORE_BLOCK, new FabricItemSettings().group(ValkyaMod.VALKYA)));
        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "cesium_chest"), CESIUM_CHEST_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_chest"), new BlockItem(CESIUM_CHEST_BLOCK, new FabricItemSettings().group(ValkyaMod.VALKYA)));


    }
}
