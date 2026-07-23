package ic2.api.item;

import net.minecraft.item.ItemStack;

public interface IElectricItem
{
	double getMaxCharge(ItemStack stack);
}
