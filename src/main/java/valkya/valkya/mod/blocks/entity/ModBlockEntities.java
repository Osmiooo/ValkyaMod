package valkya.valkya.mod.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import valkya.valkya.mod.ValkyaMod;
import valkya.valkya.mod.registry.RegisterBlocks;

public class ModBlockEntities {
    public static BlockEntityType<CesiumChestBlockEntity> CESIUM_CHEST_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ValkyaMod.MOD_ID, "cesium_chest"),
                    FabricBlockEntityTypeBuilder.create(CesiumChestBlockEntity::new,
                            RegisterBlocks.CESIUM_CHEST_BLOCK).build(null));
}
