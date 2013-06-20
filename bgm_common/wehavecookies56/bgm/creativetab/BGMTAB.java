package wehavecookies56.bgm.creativetab;

import wehavecookies56.bgm.block.AddedBlocks;
import wehavecookies56.bgm.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Bubblegum Mod
 * 
 * BGMTAB
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BGMTAB extends CreativeTabs {

    public BGMTAB(int par1, String par2Str) {
        super(par1, par2Str);
        
        
    }
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return AddedBlocks.PinkGum1.blockID;
    }
    public String GetTranslatedTabNameLabel(){
        return Reference.MOD_NAME;
    }

}
