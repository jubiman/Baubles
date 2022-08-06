package baubles.api.cap;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;

import java.util.SortedMap;

public interface IBaublesItemHandler extends IItemHandlerModifiable {

	/**
	 * Checks if the item is valid for the baubles slot
	 */
	boolean isItemValidForSlot(int slot, ItemStack stack, EntityLivingBase player);

	/**
	 * Used internally to prevent equip/unequip events from triggering when they shouldn't
	 */
	boolean isEventBlocked();

	void setEventBlock(boolean blockEvents);

	/**
	 * Used internally for syncing. Indicates if the inventory has changed since last sync
	 */
	boolean isChanged(int slot);

	void setChanged(int slot, boolean changed);

	void setPlayer(EntityLivingBase player);

}
