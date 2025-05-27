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

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> DREADED_PRIMORDITE_SMELTABLES = List.of(ModItems.RAW_DREADED_PRIMORDITE.get(),
      ModBlocks.DREADED_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get());
    private static final List<ItemLike> VITAL_PRIMORDITE_SMELTABLES = List.of(ModItems.RAW_VITAL_PRIMORDITE.get(),
      ModBlocks.VITAL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get());
    private static final List<ItemLike> ENERGETIC_PRIMORDITE_SMELTABLES = List.of(ModItems.RAW_ENERGETIC_PRIMORDITE.get(),
      ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get());
    private static final List<ItemLike> CEREBRAL_PRIMORDITE_SMELTABLES = List.of(ModItems.RAW_CEREBRAL_PRIMORDITE.get(),
      ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get());
    private static final List<ItemLike> MOURNFUL_PRIMORDITE_SMELTABLES = List.of(ModItems.RAW_MOURNFUL_PRIMORDITE.get(),
      ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(), ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // DREADED ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get())
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', ModItems.RAW_DREADED_PRIMORDITE.get())
          .unlockedBy(getHasName(ModItems.RAW_DREADED_PRIMORDITE.get()), has(ModItems.RAW_DREADED_PRIMORDITE.get()))
          .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_DREADED_PRIMORDITE.get(), 9)
          .requires(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get())
          .unlockedBy(getHasName(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get()), has(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get()))
          .save(pWriter);

        oreSmelting(pWriter, DREADED_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.DREADED_CORE.get(), 0.25f, 200, "dread_core");
        oreBlasting(pWriter, DREADED_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.DREADED_CORE.get(), 0.25f, 100, "dread_core");

        // VITAL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get())
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', ModItems.RAW_VITAL_PRIMORDITE.get())
          .unlockedBy(getHasName(ModItems.RAW_VITAL_PRIMORDITE.get()), has(ModItems.RAW_VITAL_PRIMORDITE.get()))
          .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_VITAL_PRIMORDITE.get(), 9)
          .requires(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get())
          .unlockedBy(getHasName(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get()), has(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get()))
          .save(pWriter);

        oreSmelting(pWriter, VITAL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.VITAL_CORE.get(), 0.25f, 200, "vital_core");
        oreBlasting(pWriter, VITAL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.VITAL_CORE.get(), 0.25f, 100, "vital_core");

        // ENERGETIC ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get())
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', ModItems.RAW_ENERGETIC_PRIMORDITE.get())
          .unlockedBy(getHasName(ModItems.RAW_ENERGETIC_PRIMORDITE.get()), has(ModItems.RAW_ENERGETIC_PRIMORDITE.get()))
          .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ENERGETIC_PRIMORDITE.get(), 9)
          .requires(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get())
          .unlockedBy(getHasName(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get()), has(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get()))
          .save(pWriter);

        oreSmelting(pWriter, ENERGETIC_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGETIC_CORE.get(), 0.25f, 200, "energetic_core");
        oreBlasting(pWriter, ENERGETIC_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.ENERGETIC_CORE.get(), 0.25f, 100, "energetic_core");

        // CEREBRAL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get())
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', ModItems.RAW_CEREBRAL_PRIMORDITE.get())
          .unlockedBy(getHasName(ModItems.RAW_CEREBRAL_PRIMORDITE.get()), has(ModItems.RAW_CEREBRAL_PRIMORDITE.get()))
          .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CEREBRAL_PRIMORDITE.get(), 9)
          .requires(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get())
          .unlockedBy(getHasName(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get()), has(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get()))
          .save(pWriter);

        oreSmelting(pWriter, CEREBRAL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.CEREBRAL_CORE.get(), 0.25f, 200, "cerebral_core");
        oreBlasting(pWriter, CEREBRAL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.CEREBRAL_CORE.get(), 0.25f, 100, "cerebral_core");

        // MOURNFUL ITEMS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get())
          .pattern("SSS")
          .pattern("SSS")
          .pattern("SSS")
          .define('S', ModItems.RAW_MOURNFUL_PRIMORDITE.get())
          .unlockedBy(getHasName(ModItems.RAW_MOURNFUL_PRIMORDITE.get()), has(ModItems.RAW_MOURNFUL_PRIMORDITE.get()))
          .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MOURNFUL_PRIMORDITE.get(), 9)
          .requires(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get())
          .unlockedBy(getHasName(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get()), has(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get()))
          .save(pWriter);

        oreSmelting(pWriter, MOURNFUL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOURNFUL_CORE.get(), 0.25f, 200, "mournful_core");
        oreBlasting(pWriter, MOURNFUL_PRIMORDITE_SMELTABLES, RecipeCategory.MISC, ModItems.MOURNFUL_CORE.get(), 0.25f, 100, "mournful_core");
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(
                Ingredient.of(itemlike), pCategory, pResult,
                pExperience, pCookingTime, pCookingSerializer)
              .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
              .save(pFinishedRecipeConsumer, Primanomalies.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
