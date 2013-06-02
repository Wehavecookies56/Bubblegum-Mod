package bgm.block;

import bgm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bgm.lib.IDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

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
    
    public static Block BlackGum;
    
    public static BlockBGMPortal BGMPortal;
    public static BlockFire BGMFire;
    
    public static void preinit() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.BGMTAB", "en_US", "Bubblegum Mod");
        
        PinkGum1 = new BlockPinkGum1(IDs.PINK_GUM1);
        
        GameRegistry.registerBlock(PinkGum1, Strings.PG1);
        
        LanguageRegistry.addName(PinkGum1, Strings.PG1);
        
        PinkGum2 = new BlockPinkGum2(IDs.PINK_GUM2);
        
        GameRegistry.registerBlock(PinkGum2, Strings.PG2);
        
        LanguageRegistry.addName(PinkGum2, Strings.PG2);
        
        BlueGum1 = new BlockBlueGum1(IDs.BLUE_GUM1);
        
        GameRegistry.registerBlock(BlueGum1, Strings.BG1);
        
        LanguageRegistry.addName(BlueGum1, Strings.BG1);
        
        BlueGum2 = new BlockBlueGum2(IDs.BLUE_GUM2);
        
        GameRegistry.registerBlock(BlueGum2, Strings.BG2);
        
        LanguageRegistry.addName(BlueGum2, Strings.BG2);
        
        BGMPortal =(BlockBGMPortal)new BlockBGMPortal(IDs.BGMPORTAL).setUnlocalizedName(Strings.BGMP);
        
        GameRegistry.registerBlock(BGMPortal, Strings.BGMP);
        
        LanguageRegistry.addName(BGMPortal, Strings.BGMP);
        
        BGMFire =(BlockBGMFire)new BlockBGMFire(IDs.BGMFIRE).setUnlocalizedName(Strings.BGMF);
        
        GameRegistry.registerBlock(BGMFire, Strings.BGMF);
        
        LanguageRegistry.addName(BGMFire, Strings.BGMF);
        
        BlackGum = new BlockBlackGum(IDs.BLACK_GUM1);
        
        GameRegistry.registerBlock(BlackGum, Strings.BG);
        
        LanguageRegistry.addName(BlackGum, Strings.BG);        
        
        blockRecipes();
    }
    public static void blockRecipes() {
        GameRegistry.addRecipe(new ItemStack(BGMPortal), new Object[]{
            "SOS",
            "ODO",
            "SOS",
            'S', Item.sugar, 'O', Block.obsidian, 'D', Item.diamond
        });
    }
}
