package bgm.configuration;

import java.io.File;
import java.util.logging.Level;

import bgm.lib.IDs;
import bgm.lib.Reference;
import bgm.lib.Strings;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;

/**
 * Bubblegum Mod
 * 
 * ConfiguarationHandler
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ConfigurationHandler {
    public static Configuration config;
    public static boolean addToDefault;
    public static boolean biomeBubblegumGen;

    public static void preConfig(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            
            IDs.PINK_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.PG1 + "ID", IDs.PG1_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.PG1_ID_DEFAULT);
            IDs.PINK_GUM2 = config.getBlock(Strings.PG2 + "ID", IDs.PG2_ID_DEFAULT).getInt(IDs.PG2_ID_DEFAULT);
            IDs.BLUE_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.BG1 + "ID", IDs.BG1_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.BG1_ID_DEFAULT);
            IDs.BLUE_GUM2 = config.getBlock(Strings.BG2 + "ID", IDs.BG2_ID_DEFAULT).getInt(IDs.BG2_ID_DEFAULT);
            IDs.BGMPORTAL = config.getBlock(Strings.BGMP + "ID", IDs.BGMPORTAL_DEFAULT_ID).getInt(IDs.BGMPORTAL_DEFAULT_ID);
            IDs.BGMFIRE = config.getBlock(Strings.BGMF + "ID", IDs.BGMFIRE_DEFAULT_ID).getInt(IDs.BGMFIRE_DEFAULT_ID);
            IDs.BLACK_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.BG + "ID", IDs.BG_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.BG_ID_DEFAULT);
            
            IDs.PGPLAINS = config.get(ConfigCategory.getQualifiedName("BiomeID", null), Strings.PGP + "ID", IDs.PGPLAINS_DEFAULT_ID).getInt(IDs.PGPLAINS_DEFAULT_ID);
            biomeBubblegumGen = config.get("Biome To Generate", "biomeBubblegum", true).getBoolean(false);
            addToDefault = config.get("Biome Settings", "Add Biomes To Overworld", false).getBoolean(false);
            
            IDs.BUBBLE_IGNITOR = config.getItem(Strings.BGI  + "ID", IDs.BUBBLE_IGNITOR_DEFAULT_ID).getInt(IDs.BUBBLE_IGNITOR_DEFAULT_ID);
            IDs.PORTAL_PLACER = config.getItem(Strings.PP  + "ID", IDs.PORTAL_PLACER_DEFAULT_ID).getInt(IDs.PORTAL_PLACER_DEFAULT_ID);
            IDs.MGC = config.getItem(Strings.MGC  + "ID", IDs.MGC_DEFAULT).getInt(IDs.MGC_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
    
}
