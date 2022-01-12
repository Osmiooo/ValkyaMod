package valkya.valkya.mod;

import net.fabricmc.api.ModInitializer;
import valkya.valkya.mod.registry.RegisterBlocks;
import valkya.valkya.mod.registry.RegisterItems;

public class ValkyaMod implements ModInitializer {

    public static final String MOD_ID = "valkya";

    @Override
    public void onInitialize() {

        RegisterBlocks.RegisterBlocks();
        RegisterItems.RegisterItems();
    }
}
