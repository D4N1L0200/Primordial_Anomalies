package net.delnailo.primanomalies.block;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Primanomalies.MOD_ID);

    /* BLOCK REGISTERING INIT */

    // DREADED ITEMS
    public static final RegistryObject<Block> RAW_DREADED_PRIMORDITE_BLOCK = registerBlock("raw_dreaded_primordite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> DREADED_PRIMORDITE_ORE = registerBlock("dreaded_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_DREADED_PRIMORDITE_ORE = registerBlock("deepslate_dreaded_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    // VITAL ITEMS
    public static final RegistryObject<Block> RAW_VITAL_PRIMORDITE_BLOCK = registerBlock("raw_vital_primordite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> VITAL_PRIMORDITE_ORE = registerBlock("vital_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_VITAL_PRIMORDITE_ORE = registerBlock("deepslate_vital_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    // ENERGETIC ITEMS
    public static final RegistryObject<Block> RAW_ENERGETIC_PRIMORDITE_BLOCK = registerBlock("raw_energetic_primordite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ENERGETIC_PRIMORDITE_ORE = registerBlock("energetic_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ENERGETIC_PRIMORDITE_ORE = registerBlock("deepslate_energetic_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    // CEREBRAL ITEMS
    public static final RegistryObject<Block> RAW_CEREBRAL_PRIMORDITE_BLOCK = registerBlock("raw_cerebral_primordite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> CEREBRAL_PRIMORDITE_ORE = registerBlock("cerebral_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_CEREBRAL_PRIMORDITE_ORE = registerBlock("deepslate_cerebral_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    // MOURNFUL ITEMS
    public static final RegistryObject<Block> RAW_MOURNFUL_PRIMORDITE_BLOCK = registerBlock("raw_mournful_primordite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MOURNFUL_PRIMORDITE_ORE = registerBlock("mournful_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_MOURNFUL_PRIMORDITE_ORE = registerBlock("deepslate_mournful_primordite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    /* ITEM REGISTERING END */

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}