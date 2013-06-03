package wehavecookies56.bgm.world.biome;

import wehavecookies56.bgm.block.AddedBlocks;
import wehavecookies56.bgm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

/**
 * Bubblegum Mod
 *
 * BiomeGenPGPlains
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BiomeGenPGPlains extends BiomeGenBase {
    private WorldGenerator BubblegumGenerator;
    public final Material blockMaterial;
    public BiomeGenPGPlains(int par1)
    {
    super(par1);
    this.blockMaterial = Material.water;
    this.minHeight = 0.1F;
    this.maxHeight = 0.6F;
    this.spawnableMonsterList.clear();
    this.spawnableCreatureList.clear();
    this.topBlock = ((byte)AddedBlocks.PinkGum1.blockID);
    this.fillerBlock = ((byte)AddedBlocks.PinkGum1.blockID);
    this.setBiomeName(Strings.PGP);
    this.waterColorMultiplier = 0xFF00FF;
    }
    }

