package io.github.mlqidongqi.registry;

import io.github.mlqidongqi.ENMOD;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SIATEMENT = registerItem("siatement",
            new Item(new FabricItemSettings()),
            ModItemGroup.SIATEMENT, ItemGroups.INGREDIENTS);
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registerItem = Registry.register(Registries.ITEM, new Identifier(ENMOD.MOD_ID, name), item);
        for (ItemGroup itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registerItem));
        }
        return registerItem;
    }
    public static void registerMODItems() {
        ENMOD.LOGGER.debug("Registering mod items for" + ENMOD.MOD_ID);
    }
}
