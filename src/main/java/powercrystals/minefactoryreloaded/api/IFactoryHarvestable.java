package powercrystals.minefactoryreloaded.api;

import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IFactoryHarvestable
{
	Block getPlant();
	HarvestType getHarvestType();
	boolean breakBlock();
	boolean canBeHarvested(World world, Map<String, Boolean> settings, int x, int y, int z);
	List<ItemStack> getDrops(World world, Random rand, Map<String, Boolean> settings, int x, int y, int z);
	void preHarvest(World world, int x, int y, int z);
	void postHarvest(World world, int x, int y, int z);
}
