package bgm.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import bgm.block.AddedBlocks;
import bgm.lib.Strings;

/**
 * Bubblegum Mod
 * 
 * ItemBubbleIgnitor
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemBubbleIgnitor extends ItemBGM {

    public ItemBubbleIgnitor(int id) {
        super(id);
        this.setUnlocalizedName(Strings.BGI);
        this.setMaxStackSize(1);
        this.setMaxDamage(3);
        
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    if (par7 == 0)
    {
    par5--;
    }
    if (par7 == 1)
    {
    par5++;
    }
    if (par7 == 2)
    {
    par6--;
    }
    if (par7 == 3)
    {
    par6++;
    }
    if (par7 == 4)
    {
    par4--;
    }
    if (par7 == 5)
    {
    par4++;
    }
    if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
    {
    return false;
    }
    int i1 = par3World.getBlockId(par4, par5, par6);
    if (i1 == 0)
    {
    par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
    par3World.setBlock(par4, par5, par6, AddedBlocks.BGMFire.blockID);
    }
    par1ItemStack.damageItem(1, par2EntityPlayer);
    return true;
    }
}
