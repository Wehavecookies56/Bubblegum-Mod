package bgm.block;

import bgm.lib.Reference;
import bgm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
        this.setCreativeTab(Reference.BGMTAB);
        this.setHardness(0.6F);
        this.setStepSound(soundSandFootstep);
    }
    
}
