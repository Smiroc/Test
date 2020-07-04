package fr.remy.test.init.fluide;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.remy.test.ModTest;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class bucketofcooking extends ItemBucket
{

	public bucketofcooking(Block p_i45331_1_) {
		super(p_i45331_1_);
	}
}
