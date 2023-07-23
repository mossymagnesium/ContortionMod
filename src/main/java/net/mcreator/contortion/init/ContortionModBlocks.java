
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.contortion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.contortion.block.MalaisedDesolateDirtBlock;
import net.mcreator.contortion.block.ContortstoneBlock;
import net.mcreator.contortion.ContortionMod;

public class ContortionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ContortionMod.MODID);
	public static final RegistryObject<Block> CONTORTSTONE = REGISTRY.register("contortstone", () -> new ContortstoneBlock());
	public static final RegistryObject<Block> MALAISED_DESOLATE_DIRT = REGISTRY.register("malaised_desolate_dirt", () -> new MalaisedDesolateDirtBlock());
}
