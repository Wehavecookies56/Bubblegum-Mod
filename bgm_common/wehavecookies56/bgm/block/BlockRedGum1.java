package wehavecookies56.bgm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * Bubblegum Mod
 * 
 * BlockPinkGum1
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockRedGum1 extends BlockBGM {

    public BlockRedGum1(int id) {
        
        super(id, Material.sponge);
        this.setUnlocalizedName(Strings.RG1);
        this.setHardness(0.6F);
        this.setStepSound(soundSandFootstep);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        
            blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
        }
    
    
    
}
