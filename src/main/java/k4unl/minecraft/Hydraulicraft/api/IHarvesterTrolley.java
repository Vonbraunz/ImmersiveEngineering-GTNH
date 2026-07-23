package k4unl.minecraft.Hydraulicraft.api;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public interface IHarvesterTrolley {

    boolean canHarvest(World world, int x, int y, int z);

    boolean canPlant(World world, int x, int y, int z, ItemStack stack);

    Block getBlockForSeed(ItemStack stack);

    ArrayList<ItemStack> getHandlingSeeds();

    String getName();

    int getPlantHeight(World world, int x, int y, int z);

    ResourceLocation getTexture();
}
