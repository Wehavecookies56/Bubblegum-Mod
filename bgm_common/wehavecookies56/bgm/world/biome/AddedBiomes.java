package wehavecookies56.bgm.world.biome;

import cpw.mods.fml.common.registry.GameRegistry;
import wehavecookies56.bgm.configuration.ConfigurationHandler;
import wehavecookies56.bgm.lib.IDs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

/**
 * Bubblegum Mod
 * 
 * AddedBiomes
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class AddedBiomes {
    public static final BiomeGenBase PinkBubblegumPlainsBiome = new BiomeGenPGPlains(IDs.PGPLAINS);
    public static final BiomeGenBase RedBubblegumForestBiome = new BiomeGenRGForest(IDs.RGFOREST);

    
    public static void initBiomes(){

        if(ConfigurationHandler.addToDefault)
        {
        if(ConfigurationHandler.biomeBubblegumGen)
        {
            GameRegistry.addBiome(PinkBubblegumPlainsBiome);
            BiomeDictionary.registerBiomeType(PinkBubblegumPlainsBiome, Type.PLAINS, Type.MOUNTAIN);
        }

        }
        
    if(ConfigurationHandler.addToDefault)
        {
        if(ConfigurationHandler.biomeBubblegumGen2)
        {
            GameRegistry.addBiome(RedBubblegumForestBiome);
            BiomeDictionary.registerBiomeType(RedBubblegumForestBiome, Type.FOREST, Type.PLAINS);
        }
    }
    }
    }

