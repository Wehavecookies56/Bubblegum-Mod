package wehavecookies56.bgm.block;

import wehavecookies56.bgm.BubblegumMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.bgm.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * Bubblegum Mod
 * 
 * BlockBGM
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockBGM extends Block {

    public BlockBGM(int id, Material par2Material) {
        
        super(id, par2Material);
        this.setCreativeTab(BubblegumMod.BGMTAB);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    
}
