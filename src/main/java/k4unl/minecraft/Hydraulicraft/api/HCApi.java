package k4unl.minecraft.Hydraulicraft.api;

import k4unl.minecraft.Hydraulicraft.api.recipes.FluidShapedOreRecipe;

public class HCApi {

    private static final HCApi instance = new HCApi();

    private final ITrolleyRegistrar trolleyRegistrar = new TrolleyRegistrarImpl();
    private final IRecipeHandler recipeHandler = new RecipeHandlerImpl();

    public static HCApi getInstance() {
        return instance;
    }

    public ITrolleyRegistrar getTrolleyRegistrar() {
        return trolleyRegistrar;
    }

    public IRecipeHandler getRecipeHandler() {
        return recipeHandler;
    }

    private static class TrolleyRegistrarImpl implements ITrolleyRegistrar {
        @Override
        public void registerTrolley(IHarvesterTrolley trolley) {}

        @Override
        public net.minecraft.item.ItemStack getTrolleyItem(String name) {
            return null;
        }
    }

    private static class RecipeHandlerImpl implements IRecipeHandler {
        @Override
        public void addAssemblerRecipe(FluidShapedOreRecipe recipe) {}
    }
}
