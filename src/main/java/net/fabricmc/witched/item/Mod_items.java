package net.fabricmc.witched.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.witched.Witched;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod_items {
    public static final ChaliceItem chalice_item = new ChaliceItem(new FabricItemSettings().maxCount(5).food(new FoodComponent.Builder().hunger(0).saturationModifier(0.3f).snack().build()));
    public static final Item empty_chalice_item = new Item(new FabricItemSettings().maxCount(5));
    public static void register_items() {
        Registry.register(Registry.ITEM, new Identifier(Witched.MOD_ID, "chalice"), chalice_item);
        Registry.register(Registry.ITEM, new Identifier(Witched.MOD_ID, "empty_chalice"), empty_chalice_item);
    }
    
}
