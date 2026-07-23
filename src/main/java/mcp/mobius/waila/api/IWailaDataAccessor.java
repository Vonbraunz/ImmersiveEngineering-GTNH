package mcp.mobius.waila.api;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public interface IWailaDataAccessor {

    World getWorld();

    EntityPlayerMP getPlayer();

    Block getBlock();

    int getMetadata();

    TileEntity getTileEntity();

    NBTTagCompound getNBTData();

    int getRenderingPosition();

    float getPartialFrame();
}
