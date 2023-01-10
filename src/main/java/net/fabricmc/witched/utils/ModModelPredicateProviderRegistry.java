package net.fabricmc.witched.utils;

import net.fabricmc.witched.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicateProviderRegistry {
    public static void registerAll() {
        ModelPredicateProviderRegistry.register(ModItems.WOLF_FLUTE, new Identifier("tooting"), (itemStack, clientWorld, livingEntity, i) -> livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0f : 0.0f);
        
    }
}
