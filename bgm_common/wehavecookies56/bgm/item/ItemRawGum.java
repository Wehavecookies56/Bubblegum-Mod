package wehavecookies56.bgm.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.bgm.lib.Reference;
import wehavecookies56.bgm.lib.Strings;

public class ItemRawGum extends ItemBGM {

    public ItemRawGum(int id) {
        super(id);
        this.setUnlocalizedName(Strings.RAWG);
        
    }
    
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}
