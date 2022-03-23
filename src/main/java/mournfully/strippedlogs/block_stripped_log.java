package mournfully.strippedlogs;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class block_stripped_log extends BlockLog {
    public static final String[] Logs = new String[] {"oak", "spruce", "birch", "jungle"}; // 4 Wood Type Limit
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list){
         for (int i = 0; i < Logs.length; i++){
        	 list.add(new ItemStack(item, 1, i));
         }
    }
    
    @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
        this.field_150167_a = new IIcon[Logs.length];
        this.field_150166_b = new IIcon[Logs.length];
    	        
        for (int i= 0; i < this.field_150167_a.length; i++){
        	this.field_150167_a[i] = iconRegister.registerIcon("sl:stripped_" + Logs[i] + "_log");
        	this.field_150166_b[i] = iconRegister.registerIcon("sl:stripped_" + Logs[i] + "_log_top");        }
    }
}
