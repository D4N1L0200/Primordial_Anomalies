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

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Primanomalies.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // DREADED ITEMS
        blockWithItem(ModBlocks.DREADED_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.DREADED_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE);

        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE, "minecraft:block/stone");
        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE, "minecraft:block/deepslate");

        // VITAL ITEMS
        blockWithItem(ModBlocks.VITAL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.VITAL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE);

        copyVanillaBlockWithItem(ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE, "minecraft:block/stone");
        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE, "minecraft:block/deepslate");

        // ENERGETIC ITEMS
        blockWithItem(ModBlocks.ENERGETIC_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.ENERGETIC_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE);

        copyVanillaBlockWithItem(ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE, "minecraft:block/stone");
        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE, "minecraft:block/deepslate");

        // CEREBRAL ITEMS
        blockWithItem(ModBlocks.CEREBRAL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.CEREBRAL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE);

        copyVanillaBlockWithItem(ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE, "minecraft:block/stone");
        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE, "minecraft:block/deepslate");

        // MOURNFUL ITEMS
        blockWithItem(ModBlocks.MOURNFUL_PRIMORDITE_BLOCK);

        blockWithItem(ModBlocks.MOURNFUL_PRIMORDITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE);

        copyVanillaBlockWithItem(ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE, "minecraft:block/stone");
        copyVanillaBlockWithItem(ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE, "minecraft:block/deepslate");
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

// --Commented out by Inspection START (29/05/2025 23:21):
//    private void blockItem(RegistryObject<Block> blockRegistryObject) {
//        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Primanomalies.MOD_ID +
//          ":block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath()));
//    }
// --Commented out by Inspection STOP (29/05/2025 23:21)

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void copyVanillaBlockWithItem(RegistryObject<Block> blockRegistryObject, String vanillaTexturePath) {
        ModelFile model = models().cubeAll(name(blockRegistryObject.get()), ResourceLocation.parse(vanillaTexturePath));
        simpleBlockWithItem(blockRegistryObject.get(), model);
    }
}
