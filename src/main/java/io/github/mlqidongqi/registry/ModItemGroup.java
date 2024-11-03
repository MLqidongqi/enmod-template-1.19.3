package io.github.mlqidongqi.registry;

import io.github.mlqidongqi.ENMOD;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SIATEMENT = FabricItemGroup.builder(new Identifier(ENMOD.MOD_ID, "siatement"))
            .displayName(Text.translatable("itemgroup.ENMOD.Siatement"))
            .icon(()-> new ItemStack(ModItems.SIATEMENT))
            .build();
    public static void registerModItemGroup() {
        ENMOD.LOGGER.debug("Registering mod item group for " + ENMOD.MOD_ID);
    }
}
