package bgm.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import bgm.block.AddedBlocks;
import bgm.lib.Strings;

/**
 * Bubblegum Mod
 * 
 * ItemPortalPlacer
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemPortalPlacer extends ItemBGM {
    
    public ItemPortalPlacer(int id){
        super(id);
        this.setUnlocalizedName(Strings.PP);
    }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int X, int Y, int Z, int par7, float par8, float par9, float par10)
    {
    if (!par3World.isRemote)
    {
    int direction = MathHelper.floor_double(par2EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3;
    if ((direction == 1) || (direction == 3))
    {
    for (int y = 1; y < 5; y++)
    {
             for (int z = -1; z < 2; z++)
             {
             if (par3World.getBlockId(X, Y + y, Z + z) != 0)
             {
             par2EntityPlayer.addChatMessage("No room for a portal.");
                     return false;
             }
             }
    }
    par3World.setBlock(X, Y + 1, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 1, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 7, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 7, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 3, Z, AddedBlocks.BGMFire.blockID);
    }
    else
    {
    for (int y = 1; y < 5; y++)
    {
             for (int x = -1; x < 2; x++)
             {
             if (par3World.getBlockId(X + x, Y + y, Z) != 0)
             {
             par2EntityPlayer.addChatMessage("No room for a portal.");
             return false;
             }
             }
    }
    par3World.setBlock(X, Y + 1, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 1, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 2, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 3, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 4, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 3, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 2, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 5, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 2, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X - 1, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 7, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 7, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X + 1, Y + 6, Z, AddedBlocks.BlueGum2.blockID);
    par3World.setBlock(X, Y + 3, Z, AddedBlocks.BGMFire.blockID);
    }
    return true;
    }
    return true;
    }
    }




