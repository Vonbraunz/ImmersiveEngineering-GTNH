package com.pahimar.ee3.api.exchange;

import net.minecraft.item.ItemStack;

public class EnergyValueRegistryProxy
{
	public static boolean hasEnergyValue(ItemStack itemStack)
	{
		return false;
	}

	public static float getEnergyValue(ItemStack itemStack)
	{
		return 0;
	}

	public static void addPreAssignedEnergyValue(Object object, float energyValue)
	{
	}
}
