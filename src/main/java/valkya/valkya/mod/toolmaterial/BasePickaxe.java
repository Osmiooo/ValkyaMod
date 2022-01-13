package valkya.valkya.mod.toolmaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import valkya.valkya.mod.ValkyaMod;

public class BasePickaxe extends PickaxeItem {
    public BasePickaxe(ToolMaterial material) {
        super(material, -2, -2.2f, new FabricItemSettings().group(ValkyaMod.VALKYA).maxCount(1));
    }
}