package wehavecookies56.bgm.core.handlers;

import wehavecookies56.bgm.item.AddedItems;
import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

/**
 * Bubblegum Mod
 * 
 * ColouringCraftingHandler
 * 
 * @author Wehavecookies56
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */



public class ColouringCraftingHandler implements ICraftingHandler {
    @Override
    public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
            for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
                                                                                                                                  
            {
                    if (craftMatrix.getStackInSlot(i) != null)
                    {
                            ItemStack j = craftMatrix.getStackInSlot(i);
                            if (j.getItem() != null && j.getItem() == AddedItems.MagentaColouring) 
                            {
                                    ItemStack MGC = new ItemStack(AddedItems.MagentaColouring, 2, (j.getItemDamage() + 1)); 
                                    if (MGC.getItemDamage() >= MGC.getMaxDamage()) { 
                                            MGC.stackSize--; 
                                    }
                                    craftMatrix.setInventorySlotContents(i, MGC);
                                    
                                   
                            }
                    }
            }
            for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
                
            {
                    if (craftMatrix.getStackInSlot(i) != null)
                    {
                            ItemStack j = craftMatrix.getStackInSlot(i);
                            if (j.getItem() != null && j.getItem() == AddedItems.BlueColouring) 
                            {
                                    ItemStack BGC = new ItemStack(AddedItems.BlueColouring, 2, (j.getItemDamage() + 1)); 
                                    if (BGC.getItemDamage() >= BGC.getMaxDamage()) { 
                                            BGC.stackSize--; 
                                    }
                                    craftMatrix.setInventorySlotContents(i, BGC);
                                    
                                   
                            }
                    }
            }
            
            for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
                
            {
                    if (craftMatrix.getStackInSlot(i) != null)
                    {
                            ItemStack j = craftMatrix.getStackInSlot(i);
                            if (j.getItem() != null && j.getItem() == AddedItems.YellowColouring) 
                            {
                                    ItemStack YGC = new ItemStack(AddedItems.YellowColouring, 2, (j.getItemDamage() + 1)); 
                                    if (YGC.getItemDamage() >= YGC.getMaxDamage()) { 
                                            YGC.stackSize--; 
                                    }
                                    craftMatrix.setInventorySlotContents(i, YGC);
                                    
                                   
                            }
                    }
            }
            
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item) {
    }
}
