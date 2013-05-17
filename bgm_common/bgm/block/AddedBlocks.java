package bgm.block;

import bgm.lib.Reference;
import bgm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bgm.lib.IDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Bubblegum Mod
 * 
 * AddedBlocks
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class AddedBlocks {

    public static Block PinkGum1;
    public static Block PinkGum2;
    public static Block PinkGum3;
    public static Block PinkGum4;
    
    public static Block BlueGum1;
    public static Block BlueGum2;
    public static Block BlueGum3;
    public static Block BlueGum4;
    
    public static Block YellowGum1;
    public static Block YellowGum2;
    public static Block YellowGum3;
    public static Block YellowGum4;
    
    public static void init() {
        
        PinkGum1 = new BlockPinkGum1(IDs.PINK_GUM1, Material.sponge);
        PinkGum2 = new BlockPinkGum2(IDs.PINK_GUM2);
        
        GameRegistry.registerBlock(PinkGum1, Reference.MOD_ID + PinkGum1.getUnlocalizedName2());
        
        LanguageRegistry.addName(PinkGum1, Strings.PG1);
        
    }
}
