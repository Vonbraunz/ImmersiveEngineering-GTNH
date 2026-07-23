package ic2.api.item;

import net.minecraft.item.ItemStack;

public interface IElectricItemManager
{
	double getCharge(ItemStack stack);

	double discharge(ItemStack stack, double amount, int tier, boolean ignoreLimit, boolean simulate, boolean externally);

	double charge(ItemStack stack, double amount, int tier, boolean ignoreLimit, boolean simulate);
}
