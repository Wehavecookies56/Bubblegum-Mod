package wehavecookies56.bgm.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wehavecookies56.bgm.lib.IDs;
import wehavecookies56.bgm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Bubblegum Mod
 * 
 * AddedItems
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class AddedItems {
    
    public static ItemPortalPlacer PortalPlacer;
    public static ItemBubbleIgnitor BubbleIgnitor;
    public static ItemMagentaColouring MagentaColouring;
    
    

    public static void preInit(){
        PortalPlacer = new ItemPortalPlacer(IDs.PORTAL_PLACER);
        
        LanguageRegistry.addName(PortalPlacer, Strings.PP);
        
        BubbleIgnitor = new ItemBubbleIgnitor(IDs.BUBBLE_IGNITOR);
        
        LanguageRegistry.addName(BubbleIgnitor, Strings.BGI);      
        
        MagentaColouring = new ItemMagentaColouring(IDs.MGC);
        
        LanguageRegistry.addName(MagentaColouring, Strings.MGC);
        
    }
    public static void itemRecipes(){
    GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.MagentaColouring, 1, 0), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(373, 1, 0));
            
    
    }
}
