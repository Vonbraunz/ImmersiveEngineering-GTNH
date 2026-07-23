package blusunrize.aquatweaks.api;

import net.minecraft.world.IBlockAccess;

public interface IAquaConnectable
{
	boolean shouldRenderFluid(IBlockAccess world, int x, int y, int z);

	boolean canConnectTo(IBlockAccess world, int x, int y, int z, int side);
}
