package ic2.api.energy.event;

import cpw.mods.fml.common.eventhandler.Event;
import ic2.api.energy.tile.IEnergyTile;

public class EnergyTileLoadEvent extends Event
{
	public final IEnergyTile energyTile;

	public EnergyTileLoadEvent(IEnergyTile tile)
	{
		this.energyTile = tile;
	}
}
