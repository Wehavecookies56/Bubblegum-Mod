package wehavecookies56.bgm.item;

import java.awt.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;

/**
 * Bubblegum Mod
 * 
 * ItemYellowColouring
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemYellowColouring extends ItemBGM {

    private final String setInfoln1;
    private final String setColour1;
    private final String setInfoln2;
    private final String setColour2;
    public ItemYellowColouring(int id) {
        super(id);
        this.setMaxDamage(16);
        this.setUnlocalizedName(Strings.YGC);
        this.setInfoln1 = Strings.YGC;
        this.setColour1 = "\u00A7F";
        this.setInfoln2 = "\u00A7O ~16 Uses when full";
        this.setColour2 = "\u00A77";
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack) {

        return false;
    }
    
    @Override
    public ItemStack getContainerItemStack(ItemStack itemStack) {

        itemStack.setItemDamage(itemStack.getItemDamage() + 1);

        return itemStack;
    }
      public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {}

      public String getItemDisplayName(ItemStack par1ItemStack)
      {
          return this.setColour1 + this.setInfoln1 + this.setColour2 + this.setInfoln2;
      }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
  
}
