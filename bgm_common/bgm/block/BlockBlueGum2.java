package bgm.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import bgm.lib.Reference;
import bgm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

/**
 * Bubblegum Mod
 * 
 * BlockBlueBubblegum2
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockBlueGum2 extends BlockBGM {

    public BlockBlueGum2(int id) {
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.BG2);
        this.setStepSound(soundSandFootstep);
        this.setHardness(1F);
        this.setResistance(0.8F);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        
            blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
        }
}
