package net.delnailo.primanomalies.block;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.custom.HiddenOreBlock;
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
    public static final RegistryObject<Block> DREADED_PRIMORDITE_BLOCK = registerBlock(
      "dreaded_primordite_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> DREADED_PRIMORDITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_DREADED_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DREADED_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE;

    static {
        PrimorditeOreSet dreaded = registerPrimorditeOreSet("dreaded",
          UniformInt.of(3, 6), UniformInt.of(3, 7));
        DREADED_PRIMORDITE_ORE = (RegistryObject<Block>) dreaded.stone();
        DEEPSLATE_DREADED_PRIMORDITE_ORE = (RegistryObject<Block>) dreaded.deepslate();
        HIDDEN_DREADED_PRIMORDITE_ORE = (RegistryObject<Block>) dreaded.hiddenStone();
        HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE = (RegistryObject<Block>) dreaded.hiddenDeepslate();
    }

    // VITAL ITEMS
    public static final RegistryObject<Block> VITAL_PRIMORDITE_BLOCK = registerBlock(
      "vital_primordite_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> VITAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_VITAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_VITAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE;

    static {
        PrimorditeOreSet vital = registerPrimorditeOreSet("vital",
          UniformInt.of(3, 6), UniformInt.of(3, 7));
        VITAL_PRIMORDITE_ORE = (RegistryObject<Block>) vital.stone();
        DEEPSLATE_VITAL_PRIMORDITE_ORE = (RegistryObject<Block>) vital.deepslate();
        HIDDEN_VITAL_PRIMORDITE_ORE = (RegistryObject<Block>) vital.hiddenStone();
        HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE = (RegistryObject<Block>) vital.hiddenDeepslate();
    }

    // ENERGETIC ITEMS
    public static final RegistryObject<Block> ENERGETIC_PRIMORDITE_BLOCK = registerBlock(
      "energetic_primordite_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ENERGETIC_PRIMORDITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_ENERGETIC_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_ENERGETIC_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE;

    static {
        PrimorditeOreSet energetic = registerPrimorditeOreSet("energetic",
          UniformInt.of(3, 6), UniformInt.of(3, 7));
        ENERGETIC_PRIMORDITE_ORE = (RegistryObject<Block>) energetic.stone();
        DEEPSLATE_ENERGETIC_PRIMORDITE_ORE = (RegistryObject<Block>) energetic.deepslate();
        HIDDEN_ENERGETIC_PRIMORDITE_ORE = (RegistryObject<Block>) energetic.hiddenStone();
        HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE = (RegistryObject<Block>) energetic.hiddenDeepslate();
    }

    // CEREBRAL ITEMS
    public static final RegistryObject<Block> CEREBRAL_PRIMORDITE_BLOCK = registerBlock(
      "cerebral_primordite_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> CEREBRAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_CEREBRAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_CEREBRAL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE;

    static {
        PrimorditeOreSet cerebral = registerPrimorditeOreSet("cerebral",
          UniformInt.of(3, 6), UniformInt.of(3, 7));
        CEREBRAL_PRIMORDITE_ORE = (RegistryObject<Block>) cerebral.stone();
        DEEPSLATE_CEREBRAL_PRIMORDITE_ORE = (RegistryObject<Block>) cerebral.deepslate();
        HIDDEN_CEREBRAL_PRIMORDITE_ORE = (RegistryObject<Block>) cerebral.hiddenStone();
        HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE = (RegistryObject<Block>) cerebral.hiddenDeepslate();
    }

    // MOURNFUL ITEMS
    public static final RegistryObject<Block> MOURNFUL_PRIMORDITE_BLOCK = registerBlock(
      "mournful_primordite_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MOURNFUL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_MOURNFUL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_MOURNFUL_PRIMORDITE_ORE;
    public static final RegistryObject<Block> HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE;

    static {
        PrimorditeOreSet mournful = registerPrimorditeOreSet("mournful",
          UniformInt.of(3, 6), UniformInt.of(3, 7));
        MOURNFUL_PRIMORDITE_ORE = (RegistryObject<Block>) mournful.stone();
        DEEPSLATE_MOURNFUL_PRIMORDITE_ORE = (RegistryObject<Block>) mournful.deepslate();
        HIDDEN_MOURNFUL_PRIMORDITE_ORE = (RegistryObject<Block>) mournful.hiddenStone();
        HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE = (RegistryObject<Block>) mournful.hiddenDeepslate();
    }

    /* ITEM REGISTERING END */

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static PrimorditeOreSet registerPrimorditeOreSet(String elementName, UniformInt stoneExp, UniformInt deepslateExp) {
        String baseName = elementName.toLowerCase() + "_primordite_ore";

        RegistryObject<Block> stone = registerBlock(baseName,
          () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
            .strength(3f).requiresCorrectToolForDrops(), stoneExp));

        RegistryObject<Block> deepslate = registerBlock("deepslate_" + baseName,
          () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
            .strength(4.5f).requiresCorrectToolForDrops(), deepslateExp));

        RegistryObject<Block> hiddenStone = registerBlock("hidden_" + baseName,
          () -> new HiddenOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
            .strength(1.5f).requiresCorrectToolForDrops(), stone));

        RegistryObject<Block> hiddenDeepslate = registerBlock("hidden_deepslate_" + baseName,
          () -> new HiddenOreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
            .strength(3f).requiresCorrectToolForDrops(), deepslate));

        return new PrimorditeOreSet(stone, deepslate, hiddenStone, hiddenDeepslate);
    }
}