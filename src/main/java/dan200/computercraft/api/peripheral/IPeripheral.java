package dan200.computercraft.api.peripheral;

import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;

public interface IPeripheral
{
	String getType();

	String[] getMethodNames();

	Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) throws LuaException, InterruptedException;

	void attach(IComputerAccess computer);

	void detach(IComputerAccess computer);

	boolean equals(IPeripheral other);
}
