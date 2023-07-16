
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.contortion.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ContortionModTabs {
	public static CreativeModeTab TAB_CONTORTION_BLOCKS;

	public static void load() {
		TAB_CONTORTION_BLOCKS = new CreativeModeTab("tabcontortion_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ContortionModBlocks.CONTORTSTONE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
