package bgm.item;

import java.awt.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import bgm.lib.Reference;
import bgm.lib.Strings;

/**
 * Bubblegum Mod
 * 
 * ItemMagentaColouring
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemMagentaColouring extends ItemBGM {

    private final String setInfo;
    private final String setColor;
    public ItemMagentaColouring(int id) {
        super(id);
        this.setMaxDamage(6);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(Strings.MGC);
        this.setInfo = "6 Uses";
        this.setColor = "\u00A77";
    
    }
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean bool) {
        list.add(setToolTipData());
      }
      private String setToolTipData(){
        return this.setColor + this.setInfo;
      }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
  
}
