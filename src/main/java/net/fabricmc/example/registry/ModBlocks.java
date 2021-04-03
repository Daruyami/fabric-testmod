package net.fabricmc.example.registry;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.blocks.WritingTable;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final WritingTable WRITING_TABLE = new WritingTable(FabricBlockSettings
            .of(Material.WOOD)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES)
            .strength(2.5f, 12.5f)
            .sounds(BlockSoundGroup.WOOD));
    public static void registerBlocks() {
        System.out.println("registering writing table block");
        Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, "writing_table"), WRITING_TABLE);
        System.out.println("...completed");
    }
}
