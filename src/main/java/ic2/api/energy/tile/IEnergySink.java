package ic2.api.energy.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public interface IEnergySink extends IEnergyTile
{
	boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction);

	double getDemandedEnergy();

	int getSinkTier();

	double injectEnergy(ForgeDirection directionFrom, double amount, double voltage);
}
