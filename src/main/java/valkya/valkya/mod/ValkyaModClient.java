package valkya.valkya.mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import valkya.valkya.mod.screen.CesiumChestScreen;
import valkya.valkya.mod.screen.ModScreenHandlers;

@Environment(EnvType.CLIENT)
public class ValkyaModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ModScreenHandlers.CESIUM_CHEST_SCREEN_HANDLER, CesiumChestScreen::new);
    }
}
