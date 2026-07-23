package forestry.api.fuels;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

public class EngineBronzeFuel
{
	public ItemStack fuel;
	public Fluid fluid;
	public int powerPerCycle;
	public int burnDuration;
	public int dissipationMultiplier;

	public EngineBronzeFuel(ItemStack fuel, int powerPerCycle, int burnDuration)
	{
		this.fuel = fuel;
		this.powerPerCycle = powerPerCycle;
		this.burnDuration = burnDuration;
	}

	public EngineBronzeFuel(Fluid fluid, int powerPerCycle, int burnDuration, int dissipationMultiplier)
	{
		this.fluid = fluid;
		this.powerPerCycle = powerPerCycle;
		this.burnDuration = burnDuration;
		this.dissipationMultiplier = dissipationMultiplier;
	}
}
