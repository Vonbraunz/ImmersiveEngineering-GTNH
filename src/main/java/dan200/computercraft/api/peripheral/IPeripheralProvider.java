package dan200.computercraft.api.peripheral;

import net.minecraft.world.World;

public interface IPeripheralProvider
{
	IPeripheral getPeripheral(World world, int x, int y, int z, int side);
}
