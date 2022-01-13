package valkya.valkya.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import valkya.valkya.mod.registry.RegisterArmor;
import valkya.valkya.mod.registry.RegisterBlocks;
import valkya.valkya.mod.registry.RegisterItems;

public class ValkyaMod implements ModInitializer {

    public static final String MOD_ID = "valkya";

    public static final ItemGroup VALKYA = FabricItemGroupBuilder.build(
            new Identifier(ValkyaMod.MOD_ID, "valkya"),
            () -> new ItemStack(RegisterBlocks.ZIRCONIUM_BLOCK));

    @Override
    public void onInitialize() {
        RegisterBlocks.RegisterBlocks();
        RegisterItems.RegisterItems();
        RegisterArmor.registerArmor();
    }
}
