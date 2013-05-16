package bgm.block;

import bgm.lib.IDs;
import net.minecraft.block.Block;

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
        
        PinkGum1 = new BlockPinkGum1(IDs.PINK_GUM1);
        PinkGum2 = new BlockPinkGum2(IDs.PINK_GUM2);
        
    }
}
