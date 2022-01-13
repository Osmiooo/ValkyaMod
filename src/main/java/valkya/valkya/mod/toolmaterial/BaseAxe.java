package valkya.valkya.mod.toolmaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import valkya.valkya.mod.ValkyaMod;

public class BaseAxe extends AxeItem {
    public BaseAxe(ToolMaterial material) {
        super(material, 1.5f, -3.2f, new FabricItemSettings().group(ValkyaMod.VALKYA).maxCount(1));
    }
}

