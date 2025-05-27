package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Primanomalies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // DREADED ITEMS
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get()
        );

        // VITAL ITEMS
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get()
        );

        // ENERGETIC ITEMS
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get()
        );

        // CEREBRAL ITEMS
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get()
        );

        // MOURNFUL ITEMS
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
          ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
          ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
          ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get()
        );


        //        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
        //                .add(ModBlocks.SOUND_BLOCK.get());

        //        this.tag(BlockTags.FENCES)
        //                .add(ModBlocks.SAPPHIRE_FENCE.get());
        //        this.tag(BlockTags.FENCE_GATES)
        //                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        //        this.tag(BlockTags.WALLS)
        //                .add(ModBlocks.SAPPHIRE_WALL.get());

        //        this.tag(BlockTags.LOGS_THAT_BURN)
        //                .add(ModBlocks.PINE_LOG.get())
        //                .add(ModBlocks.PINE_WOOD.get())
        //                .add(ModBlocks.STRIPPED_PINE_LOG.get())
        //                .add(ModBlocks.STRIPPED_PINE_WOOD.get());

        //        this.tag(BlockTags.PLANKS)
        //                .add(ModBlocks.PINE_PLANKS.get());
    }
}
