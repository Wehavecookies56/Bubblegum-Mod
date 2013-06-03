package wehavecookies56.bgm.world.biome;

import cpw.mods.fml.common.registry.GameRegistry;
import wehavecookies56.bgm.configuration.ConfigurationHandler;
import wehavecookies56.bgm.lib.IDs;
import net.minecraft.world.biome.BiomeGenBase;

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

    public static void initBiomes(){

        if(ConfigurationHandler.addToDefault)
        {
        if(ConfigurationHandler.biomeBubblegumGen)
        {
        GameRegistry.addBiome(PinkBubblegumPlainsBiome);
        }

        }
    }
}
