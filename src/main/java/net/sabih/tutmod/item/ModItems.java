package net.sabih.tutmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.sabih.tutmod.TutMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item RUBY = registerItems("ruby", new Item(new FabricItemSettings().maxCount(11)));               // NEW ITEM
    public static final Item RAW_RUBY = registerItems("raw_ruby", new Item(new FabricItemSettings().maxCount(11)));               // NEW ITEM

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutMod.MOD_ID, name), item);                     // REGISTER TO REGISTRY
    }







    public static void registerModItemsToInv() {                                                                  // REGISTER TO INV TAB
        TutMod.LOGGER.info("Registering Mod Items for " + TutMod.MOD_ID);
    }
}
