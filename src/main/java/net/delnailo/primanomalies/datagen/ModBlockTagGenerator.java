package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Primanomalies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          // DREADED ITEMS
          ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DREADED_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),

          // VITAL ITEMS
          ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.VITAL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),

          // ENERGETIC ITEMS
          ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.ENERGETIC_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),

          // CEREBRAL ITEMS
          ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.CEREBRAL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),

          // MOURNFUL ITEMS
          ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.MOURNFUL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          // DREADED
          ModBlocks.DREADED_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),

          // VITAL
          ModBlocks.VITAL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),

          // ENERGETIC
          ModBlocks.ENERGETIC_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),

          // CEREBRAL
          ModBlocks.CEREBRAL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),

          // MOURNFUL
          ModBlocks.MOURNFUL_PRIMORDITE_BLOCK.get(),
          ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          // DREADED
          ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),

          // VITAL
          ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),

          // ENERGETIC
          ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get()

          // CEREBRAL
          // MOURNFUL
        );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(
          // DREADED
          // VITAL
          // ENERGETIC

          // CEREBRAL
          ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),

          // MOURNFUL
          ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get()
        );
    }
}
