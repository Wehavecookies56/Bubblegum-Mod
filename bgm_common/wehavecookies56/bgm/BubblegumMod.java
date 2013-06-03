package wehavecookies56.bgm;

import java.io.File;

import wehavecookies56.bgm.block.AddedBlocks;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import wehavecookies56.bgm.configuration.ConfigurationHandler;
import wehavecookies56.bgm.core.handlers.LocalizationHandler;
import wehavecookies56.bgm.creativetab.BGMTAB;
import wehavecookies56.bgm.item.AddedItems;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.proxies.CommonProxy;
import wehavecookies56.bgm.world.biome.AddedBiomes;
import wehavecookies56.bgm.world.gen.dim.AddedDimensions;

/**
 * Bubblegum Mod
 * 
 * BubblegumMod
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER)

@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = {Reference.CHANNEL_NAME})

public class BubblegumMod {

    @SidedProxy(clientSide="bgm.proxies.ClientProxy", serverSide="bgm.proxies.CommonProxy")
    public static CommonProxy proxy;
    public static CreativeTabs BGMTAB = new BGMTAB(CreativeTabs.getNextID(), "BGMTAB");
    
    @PreInit
    public void preinit(FMLPreInitializationEvent event) {
        ConfigurationHandler.preConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        AddedBlocks.preinit();
        AddedItems.preInit();
        AddedItems.itemRecipes();
        AddedBlocks.blockRecipes();
        AddedBiomes.initBiomes();
        AddedDimensions.InitDim();
        LocalizationHandler.loadlanguages();
       
    }
    
    @Init
    public void init(FMLInitializationEvent event) {

    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
