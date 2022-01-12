package valkya.valkya.mod.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import valkya.valkya.mod.registry.RegisterItems;

public class CesiumToolMaterial implements ToolMaterial {

    public static final CesiumToolMaterial INSTANCE = new CesiumToolMaterial();

    @Override
    public int getDurability() {
        return 2591;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 8.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.CESIUM_INGOT);
    }
}
