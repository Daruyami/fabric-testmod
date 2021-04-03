package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.registry.ModBlocks;
import net.fabricmc.example.registry.ModItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ExampleMod implements ModInitializer {

	public static final String MOD_ID = "modid";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		System.out.println("Hiyah World!");
		ModItems.registerItems();
		System.out.println("items registered");
		ModBlocks.registerBlocks();
		System.out.println("blocks registered");
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WRITING_TABLE, RenderLayer.getCutout());

	}
}
