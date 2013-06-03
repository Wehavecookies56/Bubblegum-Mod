package wehavecookies56.bgm.block;

import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * Bubblegum Mod
 * 
 * BlockBlackGum
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockBlackGum extends BlockBGM {

    public BlockBlackGum(int id) {
        super(id, Material.rock);
        this.setBlockUnbreakable();
        this.setStepSound(soundClothFootstep);
        this.setResistance(600000F);
        this.setUnlocalizedName(Strings.BG);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        
            blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
        }
}
