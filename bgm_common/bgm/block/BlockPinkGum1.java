package bgm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bgm.BubblegumMod;
import bgm.lib.Reference;
import bgm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Bubblegum Mod
 * 
 * BlockPinkGum1
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockPinkGum1 extends BlockBGM {

    public BlockPinkGum1(int id, Material par2Material) {
        
        super(id, Material.sponge);
        this.setUnlocalizedName(Strings.UNP1);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.6F);
        this.setStepSound(soundSandFootstep);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        
            blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
        }
}
