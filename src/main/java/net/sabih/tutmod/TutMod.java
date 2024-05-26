package net.sabih.tutmod;

import net.fabricmc.api.ModInitializer;

import net.sabih.tutmod.item.ModItemGroups;
import net.sabih.tutmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutMod implements ModInitializer {
	public static final String MOD_ID = "tut-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItemsToInv();
		ModItemGroups.registerItemGroups();
	}
}