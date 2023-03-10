package net.fabricmc.witched;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.witched.item.ModItems;
import net.fabricmc.witched.utils.ModModelPredicateProviderRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Witched implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "witched";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().maxCount(5));
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Starting Witched.");
		ModItems.registerItems();
		ModModelPredicateProviderRegistry.registerAll();
		
	}
}
