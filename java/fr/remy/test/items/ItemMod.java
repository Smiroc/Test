package fr.remy.test.items;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.remy.test.references;
import fr.remy.test.init.food.food;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import fr.remy.test.items.PotatoCanon;
import scala.collection.parallel.BucketCombiner;
public class ItemMod {

	public static Item item_test, frite, brownie, potato_canon;
	
	public static void init()
	
	{
	item_test = new Item().setUnlocalizedName("item_test").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(references.MOD_ID+":item_test");	
	frite = new food(4, false).setUnlocalizedName("frite").setCreativeTab(CreativeTabs.tabFood).setTextureName(references.MOD_ID+ ":frite");
	brownie = new food(5, false).setUnlocalizedName("brownie").setCreativeTab(CreativeTabs.tabFood).setTextureName(references.MOD_ID+ ":brownie");
	potato_canon = new PotatoCanon().setUnlocalizedName("potato_canon").setCreativeTab(CreativeTabs.tabCombat).setTextureName(references.MOD_ID + ":potato_canon");	
	}
	public static void register()
	{
		GameRegistry.registerItem(brownie, "brownie");
		GameRegistry.registerItem(item_test, "item test");
		GameRegistry.registerItem(frite, "frite");
		GameRegistry.registerItem(potato_canon, "potato_canon");
	}
}
	