package valkya.valkya.mod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;

public class RegisterBlocks {


    public static final Block CESIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f));

    public static void RegisterBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(ValkyaMod.MOD_ID, "cesium_block"), CESIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ValkyaMod.MOD_ID, "cesium_block"), new BlockItem(CESIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

    }
}
