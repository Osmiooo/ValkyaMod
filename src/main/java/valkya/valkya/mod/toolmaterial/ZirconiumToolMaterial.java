package valkya.valkya.mod.toolmaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import valkya.valkya.mod.registry.RegisterItems;

public class ZirconiumToolMaterial implements ToolMaterial {

    public static final ZirconiumToolMaterial INSTANCE = new ZirconiumToolMaterial();

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
        return Ingredient.ofItems(RegisterItems.ZIRCONIUM_INGOT);
    }
}
