package bgm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bgm.BubblegumMod;
import bgm.lib.Reference;
import bgm.lib.Strings;
import net.minecraft.block.Block;
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

public class BlockPinkGum1 extends Block {

    public BlockPinkGum1(int id) {
        
        super(id, Material.sponge);
        this.setUnlocalizedName(Strings.PG1);
        this.setCreativeTab(BubblegumMod.BGMTAB);
        this.setHardness(0.6F);
        this.setStepSound(soundSandFootstep);
    }
    
    public void registerIcons(IconRegister par1IconRegister) {
            this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
        }
    
}
