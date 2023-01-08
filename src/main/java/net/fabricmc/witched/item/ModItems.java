package net.fabricmc.witched.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.witched.Witched;
import net.fabricmc.witched.item.custom.ChaliceItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final ChaliceItem chaliceItem = new ChaliceItem(new FabricItemSettings().maxCount(5).food(new FoodComponent.Builder().hunger(0).saturationModifier(0.3f).snack().build()));
    public static final Item emptyChaliceItem = new Item(new FabricItemSettings().maxCount(5));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Witched.MOD_ID, "chalice"), chaliceItem);
        Registry.register(Registry.ITEM, new Identifier(Witched.MOD_ID, "empty_chalice"), emptyChaliceItem);
    }
    
}
