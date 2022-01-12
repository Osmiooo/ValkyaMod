package valkya.valkya.mod.toolmaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class BaseHoe extends HoeItem {
    public BaseHoe(ToolMaterial material) {
        super(material, -8, 0, new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
    }
}

