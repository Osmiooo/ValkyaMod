package valkya.valkya.mod.toolmaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import valkya.valkya.mod.ValkyaMod;

public class BaseHoe extends HoeItem {
    public BaseHoe(ToolMaterial material) {
        super(material, -8, 0, new FabricItemSettings().group(ValkyaMod.VALKYA).maxCount(1));
    }
}

