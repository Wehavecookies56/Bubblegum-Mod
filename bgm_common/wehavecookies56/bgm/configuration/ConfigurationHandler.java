package wehavecookies56.bgm.configuration;

import java.io.File;
import java.util.logging.Level;

import wehavecookies56.bgm.lib.IDs;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;

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
    public static boolean biomeBubblegumGen2;

    public static void preConfig(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            
            IDs.PINK_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.PG1 + "ID", IDs.PG1_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.PG1_ID_DEFAULT);
            IDs.RED_GUM2 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.RG2 + "ID", IDs.RG2_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.RG2_ID_DEFAULT);
            IDs.RED_GUM3 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.RG3 + "ID", IDs.RG3_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.RG3_ID_DEFAULT);
            IDs.PINK_GUM2 = config.getBlock(Strings.PG2 + "ID", IDs.PG2_ID_DEFAULT).getInt(IDs.PG2_ID_DEFAULT);
            IDs.RED_GUM1 = config.getBlock(Strings.RG1 + "ID", IDs.RG1_ID_DEFAULT).getInt(IDs.RG1_ID_DEFAULT);
            IDs.PINK_GUM3 = config.getBlock(Strings.PG3 + "ID", IDs.PG3_ID_DEFAULT).getInt(IDs.PG3_ID_DEFAULT);
            IDs.PINK_GUM4 = config.getBlock(Strings.PG4 + "ID", IDs.PG4_ID_DEFAULT).getInt(IDs.PG4_ID_DEFAULT);
            IDs.RED_GUM4 = config.getBlock(Strings.RG4 + "ID", IDs.RG4_ID_DEFAULT).getInt(IDs.RG4_ID_DEFAULT);
            IDs.RAWGUM = config.getBlock(Strings.RAWG + "ID", IDs.RAWGUM_DEFAULT).getInt(IDs.RAWGUM_DEFAULT);
            IDs.BLUE_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.BG1 + "ID", IDs.BG1_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.BG1_ID_DEFAULT);
            IDs.BLUE_GUM2 = config.getBlock(Strings.BG2 + "ID", IDs.BG2_ID_DEFAULT).getInt(IDs.BG2_ID_DEFAULT);
            IDs.BGMPORTAL = config.getBlock(Strings.BGMP + "ID", IDs.BGMPORTAL_DEFAULT_ID).getInt(IDs.BGMPORTAL_DEFAULT_ID);
            IDs.BGMFIRE = config.getBlock(Strings.BGMF + "ID", IDs.BGMFIRE_DEFAULT_ID).getInt(IDs.BGMFIRE_DEFAULT_ID);
            IDs.BLACK_GUM1 = config.getTerrainBlock(ConfigCategory.getQualifiedName("Dimension Blocks", null), Strings.BG + "ID", IDs.BG_ID_DEFAULT, Strings.COMMENTDIMCONFIG).getInt(IDs.BG_ID_DEFAULT);
            
            IDs.PGPLAINS = config.get(ConfigCategory.getQualifiedName("BiomeID", null), Strings.PGP + "ID", IDs.PGPLAINS_DEFAULT_ID).getInt(IDs.PGPLAINS_DEFAULT_ID);
            biomeBubblegumGen = config.get("Biome To Generate", "BiomeStrawberryBubblegum", true).getBoolean(false);
            addToDefault = config.get("Biome Settings", "Add Biomes To Overworld", false).getBoolean(false);
            IDs.RGFOREST = config.get(ConfigCategory.getQualifiedName("BiomeID", null), Strings.RGF + "ID", IDs.RGFOREST_DEFAULT_ID).getInt(IDs.RGFOREST_DEFAULT_ID);
            biomeBubblegumGen2 = config.get("Biome To Generate", "BiomeGreenAppleBubblegumForest", true).getBoolean(false);
            addToDefault = config.get("Biome Settings", "Add Biomes To Overworld", false).getBoolean(false);
            
            IDs.BUBBLE_IGNITOR = config.getItem(Strings.BGI  + "ID", IDs.BUBBLE_IGNITOR_DEFAULT_ID).getInt(IDs.BUBBLE_IGNITOR_DEFAULT_ID);
            IDs.PORTAL_PLACER = config.getItem(Strings.PP  + "ID", IDs.PORTAL_PLACER_DEFAULT_ID).getInt(IDs.PORTAL_PLACER_DEFAULT_ID);
            IDs.MGC = config.getItem(Strings.MGC  + " ID", IDs.MGC_DEFAULT).getInt(IDs.MGC_DEFAULT);
            IDs.BGC = config.getItem(Strings.BGC  + " ID", IDs.BGC_DEFAULT).getInt(IDs.BGC_DEFAULT);
            IDs.YGC = config.getItem(Strings.YGC  + " ID", IDs.YGC_DEFAULT).getInt(IDs.YGC_DEFAULT);
            IDs.RAWGUMCHUNK = config.getItem(Strings.RawBG  + " ID", IDs.RAWGUMCHUNK_DEFAULT).getInt(IDs.RAWGUMCHUNK_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
    
}
