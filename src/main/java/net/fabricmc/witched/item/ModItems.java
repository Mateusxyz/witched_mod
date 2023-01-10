package net.fabricmc.witched.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.witched.Witched;
import net.fabricmc.witched.item.custom.ChaliceItem;
import net.fabricmc.witched.item.custom.WolfFlute;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.tag.InstrumentTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item WOLF_FLUTE = registerItem("wolf_flute", new WolfFlute(new FabricItemSettings().group(ModItemGroup.WITCHED_GROUP).maxCount(1), InstrumentTags.GOAT_HORNS));
    public static final Item CHALICE = registerItem("chalice", new ChaliceItem(new FabricItemSettings().group(ModItemGroup.WITCHED_GROUP).maxCount(1).food(new FoodComponent.Builder().hunger(0).saturationModifier(0.3f).snack().build())));
    public static final Item EMPTY_CHALICE = registerItem("empty_chalice", new Item(new FabricItemSettings().group(ModItemGroup.WITCHED_GROUP).maxCount(1)));
    
    public static void registerItems() {
        Witched.LOGGER.info("Registering items for "+Witched.MOD_ID);
        
    }
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Witched.MOD_ID, name), item);
    }
    
}
