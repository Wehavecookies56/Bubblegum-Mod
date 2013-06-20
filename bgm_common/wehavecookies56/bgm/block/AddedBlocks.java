package wehavecookies56.bgm.block;

import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import wehavecookies56.bgm.item.AddedItems;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.bgm.lib.IDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
    
    public static Block RedGum1;
    public static Block RedGum2;
    public static Block RedGum3;
    public static Block RedGum4;
    
    public static Block BlackGum;
    
    public static Block RawGum;
    
    public static BlockBGMPortal BGMPortal;
    public static BlockFire BGMFire;
    
    public static void preinit() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.BGMTAB", "en_US", Reference.MOD_NAME);
        
        PinkGum1 = new BlockPinkGum1(IDs.PINK_GUM1);
        GameRegistry.registerBlock(PinkGum1, Strings.PG1);
        LanguageRegistry.addName(PinkGum1, Strings.PG1);
        
        PinkGum2 = new BlockPinkGum2(IDs.PINK_GUM2);
        GameRegistry.registerBlock(PinkGum2, Strings.PG2);
        LanguageRegistry.addName(PinkGum2, Strings.PG2);
        
        PinkGum3 = new BlockPinkGum3(IDs.PINK_GUM3);
        GameRegistry.registerBlock(PinkGum3, Strings.PG3);
        LanguageRegistry.addName(PinkGum3, Strings.PG3);
        
        PinkGum4 = new BlockPinkGum4(IDs.PINK_GUM4);
        GameRegistry.registerBlock(PinkGum4, Strings.PG4);
        LanguageRegistry.addName(PinkGum4, Strings.PG4);
        
        RedGum1 = new BlockRedGum1(IDs.RED_GUM1);
        GameRegistry.registerBlock(RedGum1, Strings.RG1);
        LanguageRegistry.addName(RedGum1, Strings.RG1);
        
        RedGum2 = new BlockRedGum2(IDs.RED_GUM2);
        GameRegistry.registerBlock(RedGum2, Strings.RG2);
        LanguageRegistry.addName(RedGum2, Strings.RG2);
        
        RedGum3 = new BlockRedGum3(IDs.RED_GUM3);
        GameRegistry.registerBlock(RedGum3, Strings.RG3);
        LanguageRegistry.addName(RedGum3, Strings.RG3);
        
        RedGum4 = new BlockRedGum4(IDs.RED_GUM4);
        GameRegistry.registerBlock(RedGum4, Strings.RG4);
        LanguageRegistry.addName(RedGum4, Strings.RG4);
        
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
        
        RawGum = new BlockRawGum(IDs.RAWGUM);       
        GameRegistry.registerBlock(RawGum, Strings.RAWG);  
        LanguageRegistry.addName(RawGum, Strings.RAWG);
        
    }
    public static void blockRecipes() {
        GameRegistry.addRecipe(new ItemStack(BGMPortal), new Object[]{
            "SOS",
            "ODO",
            "SOS",
            'S', Item.sugar, 'O', Block.obsidian, 'D', Item.diamond,
    });
        
       GameRegistry.addRecipe(new ItemStack(RawGum), new Object[]{
           "CC",
           "CC",
           'C', AddedItems.RawGumI
       });   
    }
    
    
    public static void applyObjectTags() {
        ObjectTags tags = new ObjectTags().add(EnumTag.LIFE, 1).add(EnumTag.EARTH, 2).add(EnumTag.CRYSTAL, 1);
        ThaumcraftApi.registerObjectTag(PinkGum1.blockID, -1, tags);

        tags = new ObjectTags().add(EnumTag.LIFE, 1).add(EnumTag.ROCK, 2).add(EnumTag.CRYSTAL, 1);
        ThaumcraftApi.registerObjectTag(BlueGum1.blockID, -1, tags);
}
}    
