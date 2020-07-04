package fr.remy.test;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.remy.test.entity.EntityPotatoArrow;
import fr.remy.test.init.BlockMod;
import fr.remy.test.init.fluide.BlockCookingFluid;
import fr.remy.test.init.fluide.bucketofcooking;
import fr.remy.test.items.ItemMod;
import fr.remy.test.items.PotatoCanon;
import fr.remy.test.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = references.MOD_ID, name=references.MOD_NAME, version = references.VERSION)
public class ModTest
{
	@SidedProxy(clientSide = references.CLIENT_PROXY, serverSide = references.SERVER_PROXY)
	public static CommonProxy proxy;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemMod.init();
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
		Fluid BlockCookingFluid = new Fluid("BlockCookingFluid");
		FluidRegistry.registerFluid(BlockCookingFluid);
		Block Blockfcooking = new BlockCookingFluid(BlockCookingFluid, Material.water).setBlockName("CookingFluid").setBlockTextureName(references.MOD_ID + ":block_test2");
		GameRegistry.registerBlock(Blockfcooking, "CookingFluid");
		Item bucketoil = new bucketofcooking(Blockfcooking).setUnlocalizedName("boc").setTextureName(references.MOD_ID +":boc").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(bucketoil, "boc");
		FluidContainerRegistry.registerFluidContainer(BlockCookingFluid, new ItemStack(bucketoil), new ItemStack(Items.bucket));
	}
@EventHandler
public void preInit(FMLInitializationEvent event)
{
	proxy.registerRenders();
}
@EventHandler
public void preInit(FMLPostInitializationEvent event)
{
	MinecraftForge.EVENT_BUS.register(this);
}
}