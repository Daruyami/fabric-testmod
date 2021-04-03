package net.fabricmc.example.registry;

import net.fabricmc.example.ExampleMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item A_LETTER = new Item(new Item.Settings()
            .group(ItemGroup.MISC)
            .rarity(Rarity.UNCOMMON)
            .maxCount(1)
            .fireproof());

    //block items
    public static final BlockItem WRITING_TABLE = new BlockItem(ModBlocks.WRITING_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, "a_letter"), A_LETTER);
        System.out.println("registering writing table item");
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, "writing_table"), WRITING_TABLE);
        System.out.println("...completed");

    }

}
