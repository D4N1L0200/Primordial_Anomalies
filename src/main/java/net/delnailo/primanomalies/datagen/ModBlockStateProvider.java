package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Primanomalies.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // DREADED ITEMS
        blockWithItem(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.DREADED_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE);

        simpleBlock(ModBlocks.DREADED_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("dreaded_primordite_ore_client_visual",
            modLoc("block/dreaded_primordite_ore")));
        simpleBlock(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("deepslate_dreaded_primordite_ore_client_visual",
            modLoc("block/deepslate_dreaded_primordite_ore")));

        // VITAL ITEMS
        blockWithItem(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.VITAL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE);

        simpleBlock(ModBlocks.VITAL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("vital_primordite_ore_client_visual",
            modLoc("block/vital_primordite_ore")));
        simpleBlock(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("deepslate_vital_primordite_ore_client_visual",
            modLoc("block/deepslate_vital_primordite_ore")));

        // ENERGETIC ITEMS
        blockWithItem(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.ENERGETIC_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE);

        simpleBlock(ModBlocks.ENERGETIC_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("energetic_primordite_ore_client_visual",
            modLoc("block/energetic_primordite_ore")));
        simpleBlock(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("deepslate_energetic_primordite_ore_client_visual",
            modLoc("block/deepslate_energetic_primordite_ore")));

        // CEREBRAL ITEMS
        blockWithItem(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.CEREBRAL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE);

        simpleBlock(ModBlocks.CEREBRAL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("cerebral_primordite_ore_client_visual",
            modLoc("block/cerebral_primordite_ore")));
        simpleBlock(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("deepslate_cerebral_primordite_ore_client_visual",
            modLoc("block/deepslate_cerebral_primordite_ore")));

        // MOURNFUL ITEMS
        blockWithItem(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.MOURNFUL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE);

        simpleBlock(ModBlocks.MOURNFUL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("mournful_primordite_ore_client_visual",
            modLoc("block/mournful_primordite_ore")));
        simpleBlock(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE_CLIENT_VISUAL.get(),
          models().cubeAll("deepslate_mournful_primordite_ore_client_visual",
            modLoc("block/deepslate_mournful_primordite_ore")));
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Primanomalies.MOD_ID +
          ":block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
