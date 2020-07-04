package fr.remy.test.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.remy.test.references;
import fr.remy.test.blocks.BlockBasic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMod {
	public static net.minecraft.block.Block block_test, block_test2;
	public static void init()
	
	{
		block_test = new BlockBasic(Material.rock).setBlockName("block_test").setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName(references.MOD_ID +":block_test");
		block_test2 = new BlockBasic(Material.rock).setBlockName("block_test2").setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName(references.MOD_ID +":block_test2");
	}
	public static void register() {
		GameRegistry.registerBlock(block_test, block_test.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(block_test2, block_test2.getUnlocalizedName().substring(5));
	}
}
	
	
