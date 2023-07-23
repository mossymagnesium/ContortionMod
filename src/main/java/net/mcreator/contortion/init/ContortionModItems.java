
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.contortion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.contortion.ContortionMod;

public class ContortionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ContortionMod.MODID);
	public static final RegistryObject<Item> CONTORTSTONE = block(ContortionModBlocks.CONTORTSTONE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MALAISED_DESOLATE_DIRT = block(ContortionModBlocks.MALAISED_DESOLATE_DIRT, ContortionModTabs.TAB_CONTORTION_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
