package powercrystals.minefactoryreloaded.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IFactoryPlantable
{
	Item getSeed();
	boolean canBePlanted(ItemStack stack, boolean arg1);
	boolean canBePlantedHere(World world, int x, int y, int z, ItemStack stack);
	void prePlant(World world, int x, int y, int z, ItemStack stack);
	void postPlant(World world, int x, int y, int z, ItemStack stack);
	ReplacementBlock getPlantedBlock(World world, int x, int y, int z, ItemStack stack);
}
