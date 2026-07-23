package k4unl.minecraft.Hydraulicraft.api;

import net.minecraft.item.ItemStack;

public interface ITrolleyRegistrar {

    void registerTrolley(IHarvesterTrolley trolley);

    ItemStack getTrolleyItem(String name);
}
