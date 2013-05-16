package bgm;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bgm.creativetab.BGMTAB;
import bgm.lib.Reference;

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
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BubblegumMod {

    public static CreativeTabs BGMTAB = new BGMTAB(CreativeTabs.getNextID(), "BGMTAB");
    
    @PreInit
    public void preinit(FMLPreInitializationEvent event) {
        LanguageRegistry.instance().addStringLocalization("itemGroup.BGMTAB", "en_US", "Bubblegum Mod");
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
