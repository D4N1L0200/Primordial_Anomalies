package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.delnailo.primanomalies.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> DREADED_PRIMORDITE_SMELTABLES = List.of(ModItems.DREADED_PRIMORDITE.get(),
      ModBlocks.DREADED_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get());
    private static final List<ItemLike> VITAL_PRIMORDITE_SMELTABLES = List.of(ModItems.VITAL_PRIMORDITE.get(),
      ModBlocks.VITAL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get());
    private static final List<ItemLike> ENERGETIC_PRIMORDITE_SMELTABLES = List.of(ModItems.ENERGETIC_PRIMORDITE.get(),
      ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get());
    private static final List<ItemLike> CEREBRAL_PRIMORDITE_SMELTABLES = List.of(ModItems.CEREBRAL_PRIMORDITE.get(),
      ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get());
    private static final List<ItemLike> MOURNFUL_PRIMORDITE_SMELTABLES = List.of(ModItems.MOURNFUL_PRIMORDITE.get(),
      ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        // DREADED ITEMS
        compactOre3x3(pWriter, ModBlocks.DREADED_PRIMORDITE_BLOCK.get(), ModItems.DREADED_PRIMORDITE.get());

        oreSmeltingBlasting(pWriter, DREADED_PRIMORDITE_SMELTABLES, ModItems.PURE_DREADED_PRIMORDITE.get(),
          "pure_dreaded");

        // VITAL ITEMS
        compactOre3x3(pWriter, ModBlocks.VITAL_PRIMORDITE_BLOCK.get(), ModItems.VITAL_PRIMORDITE.get());

        oreSmeltingBlasting(pWriter, VITAL_PRIMORDITE_SMELTABLES, ModItems.PURE_VITAL_PRIMORDITE.get(),
          "pure_vital");

        // ENERGETIC ITEMS
        compactOre3x3(pWriter, ModBlocks.ENERGETIC_PRIMORDITE_BLOCK.get(), ModItems.ENERGETIC_PRIMORDITE.get());

        oreSmeltingBlasting(pWriter, ENERGETIC_PRIMORDITE_SMELTABLES, ModItems.PURE_ENERGETIC_PRIMORDITE.get(),
          "pure_energetic");

        // CEREBRAL ITEMS
        compactOre3x3(pWriter, ModBlocks.CEREBRAL_PRIMORDITE_BLOCK.get(), ModItems.CEREBRAL_PRIMORDITE.get());

        oreSmeltingBlasting(pWriter, CEREBRAL_PRIMORDITE_SMELTABLES, ModItems.PURE_CEREBRAL_PRIMORDITE.get(),
          "pure_cerebral");

        // MOURNFUL ITEMS
        compactOre3x3(pWriter, ModBlocks.MOURNFUL_PRIMORDITE_BLOCK.get(), ModItems.MOURNFUL_PRIMORDITE.get());

        oreSmeltingBlasting(pWriter, MOURNFUL_PRIMORDITE_SMELTABLES, ModItems.PURE_MOURNFUL_PRIMORDITE.get(),
          "pure_mournful");
    }

    // OTHER

    protected static void compactOre3x3(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike block, ItemLike item) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, block)
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', item)
          .unlockedBy(getHasName(item), has(item))
          .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item, 9)
          .requires(block)
          .unlockedBy(getHasName(block), has(block))
          .save(pFinishedRecipeConsumer);
    }

    protected static void oreCooking(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                     @NotNull RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory,
                                     @NotNull ItemLike pResult, float pExperience, int pCookingTime,
                                     @NotNull String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(
                Ingredient.of(itemlike), pCategory, pResult,
                pExperience, pCookingTime, pCookingSerializer)
              .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
              .save(pFinishedRecipeConsumer, Primanomalies.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void oreSmelting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                      List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory,
                                      @NotNull ItemLike pResult, float pExperience, int pCookingTIme,
                                      @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory,
          pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                      List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory,
                                      @NotNull ItemLike pResult, float pExperience, int pCookingTime,
                                      @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory,
          pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreSmeltingBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer,
                                              List<ItemLike> pIngredients, ItemLike pResult,
                                              String pGroup) {
        oreSmelting(pFinishedRecipeConsumer, pIngredients, RecipeCategory.MISC,
          pResult, 0.25f, 200, pGroup);
        oreBlasting(pFinishedRecipeConsumer, pIngredients, RecipeCategory.MISC,
          pResult, 0.25f, 100, pGroup);
    }
}
