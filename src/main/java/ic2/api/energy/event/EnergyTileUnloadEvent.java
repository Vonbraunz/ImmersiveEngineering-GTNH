package ic2.api.energy.event;

import cpw.mods.fml.common.eventhandler.Event;
import ic2.api.energy.tile.IEnergyTile;

public class EnergyTileUnloadEvent extends Event
{
	public final IEnergyTile energyTile;

	public EnergyTileUnloadEvent(IEnergyTile tile)
	{
		this.energyTile = tile;
	}
}
