package bgm.block;

import bgm.BubblegumMod;
import bgm.lib.Reference;
import bgm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Bubblegum Mod
 * 
 * BlockPinkGum2
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockPinkGum2 extends Block {
    
    public BlockPinkGum2(int id) {
        
        super(id, Material.sponge);
        this.setUnlocalizedName(Strings.PG2);
        this.setCreativeTab(BubblegumMod.BGMTAB);
        this.setHardness(0.6F);
        this.setStepSound(soundSandFootstep);
    }

}
