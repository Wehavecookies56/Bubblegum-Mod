package wehavecookies56.bgm.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wehavecookies56.bgm.block.AddedBlocks;
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
    
    public static Item PortalPlacer;
    public static Item BubbleIgnitor;
    public static Item MagentaColouring;
    public static Item BlueColouring;
    public static Item YellowColouring;
    public static Item RawGumI;

    public static void preInit(){
        PortalPlacer = new ItemPortalPlacer(IDs.PORTAL_PLACER).setUnlocalizedName(Strings.PP);
        
        LanguageRegistry.addName(PortalPlacer, Strings.PP);
        
        BubbleIgnitor = new ItemBubbleIgnitor(IDs.BUBBLE_IGNITOR);
        
        LanguageRegistry.addName(BubbleIgnitor, Strings.BGI);      
        
        MagentaColouring = new ItemMagentaColouring(IDs.MGC);
        
        LanguageRegistry.addName(MagentaColouring, Strings.MGC);
        
        BlueColouring = new ItemBlueColouring(IDs.BGC);
        
        LanguageRegistry.addName(BlueColouring, Strings.BGC);
        
        YellowColouring = new ItemYellowColouring(IDs.YGC);
        
        LanguageRegistry.addName(YellowColouring, Strings.YGC);
        
        RawGumI = new ItemRawGum(IDs.RAWGUMCHUNK);
        
        LanguageRegistry.addName(RawGumI, Strings.RawBG);
        
        
        
    }
    public static void itemRecipes(){
        
    GameRegistry.addSmelting(Item.sugar.itemID, new ItemStack(RawGumI), 1F);  
        
    //Magenta
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 14), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 12), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(373, 1, 0));    
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 10), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 8), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 6), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 4), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 2), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    GameRegistry.addShapelessRecipe(new ItemStack(MagentaColouring, 1, 0), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder,1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(373, 1, 0));
    
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 0), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 1), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 2), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 3), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 4), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 5), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 6), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 7), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 8), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 9), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 10), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 11), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 12), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 13), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 14), new ItemStack(AddedBlocks.RawGum, 1));
    GameRegistry.addShapelessRecipe(new ItemStack(AddedBlocks.PinkGum1), new ItemStack(AddedItems.MagentaColouring, 1, 15), new ItemStack(AddedBlocks.RawGum, 1));
    
    }
}
