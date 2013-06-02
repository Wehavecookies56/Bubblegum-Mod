package bgm.world.gen.dim;

import net.minecraftforge.common.DimensionManager;

/**
 * Bubblegum Mod
 * 
 * AddedDimensions
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class AddedDimensions {
    public static int DIM_ID = 2;
    
    public static void InitDim(){
        DimensionManager.registerProviderType(DIM_ID, WorldProviderBubblegum.class, true);
        DimensionManager.registerDimension(DIM_ID, DIM_ID);
    }
    
}
