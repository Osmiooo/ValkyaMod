package valkya.valkya.mod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import valkya.valkya.mod.ValkyaMod;

public class ModScreenHandlers {

    public static ScreenHandlerType<CesiumChestScreenHandler> CESIUM_CHEST_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(ValkyaMod.MOD_ID, "cesium_chest"),
                    CesiumChestScreenHandler::new);
}
