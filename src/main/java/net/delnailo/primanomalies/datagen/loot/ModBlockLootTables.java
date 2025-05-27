package net.delnailo.primanomalies.datagen.loot;

import net.delnailo.primanomalies.block.ModBlocks;
import net.delnailo.primanomalies.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // DREADED ITEMS
        this.dropSelf(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get());

        this.add(ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DREADED_PRIMORDITE_ORE.get(), ModItems.RAW_DREADED_PRIMORDITE.get()
          )
        );
        this.add(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(), ModItems.RAW_DREADED_PRIMORDITE.get()
          )
        );

        // VITAL ITEMS
        this.dropSelf(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get());

        this.add(ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.VITAL_PRIMORDITE_ORE.get(), ModItems.RAW_VITAL_PRIMORDITE.get()
          )
        );
        this.add(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(), ModItems.RAW_VITAL_PRIMORDITE.get()
          )
        );

        // ENERGETIC ITEMS
        this.dropSelf(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get());

        this.add(ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(), ModItems.RAW_ENERGETIC_PRIMORDITE.get()
          )
        );
        this.add(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(), ModItems.RAW_ENERGETIC_PRIMORDITE.get()
          )
        );

        // CEREBRAL ITEMS
        this.dropSelf(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get());

        this.add(ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(), ModItems.RAW_CEREBRAL_PRIMORDITE.get()
          )
        );
        this.add(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(), ModItems.RAW_CEREBRAL_PRIMORDITE.get()
          )
        );

        // MOURNFUL ITEMS
        this.dropSelf(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get());

        this.add(ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(), ModItems.RAW_MOURNFUL_PRIMORDITE.get()
          )
        );
        this.add(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get(),
          block -> createPrimorditeOreDrops(
            ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get(), ModItems.RAW_MOURNFUL_PRIMORDITE.get()
          )
        );

        // this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        // this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        // this.add(ModBlocks.SAPPHIRE_SLAB.get(),
        //         block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        // this.add(ModBlocks.SAPPHIRE_DOOR.get(),
        //         block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        // LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.STRAWBERRY_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 5));
        //
        // this.add(ModBlocks.STRAWBERRY_CROP.get(), createCropDrops(ModBlocks.STRAWBERRY_CROP.get(), ModItems.STRAWBERRY.get(),
        //         ModItems.STRAWBERRY_SEEDS.get(), lootitemcondition$builder));


        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 7))
        //         .or(LootItemBlockStatePropertyCondition
        //                 .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //                 .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8)));

        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //  .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //  .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8));

        // this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(),
        //         ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));

        // this.dropSelf(ModBlocks.CATMINT.get());
        // this.add(ModBlocks.POTTED_CATMINT.get(), createPotFlowerItemTable(ModBlocks.CATMINT.get()));

        // this.dropSelf(ModBlocks.GEM_POLISHING_STATION.get());

        // this.dropSelf(ModBlocks.PINE_LOG.get());
        // this.dropSelf(ModBlocks.PINE_WOOD.get());
        // this.dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        // this.dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());
        // this.dropSelf(ModBlocks.PINE_PLANKS.get());

        // this.add(ModBlocks.PINE_LEAVES.get(), block ->
        //         createLeavesDrops(block, ModBlocks.PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        // this.add(ModBlocks.PINE_SIGN.get(), block ->
        //         createSingleItemTable(ModItems.PINE_SIGN.get()));
        // this.add(ModBlocks.PINE_WALL_SIGN.get(), block ->
        //         createSingleItemTable(ModItems.PINE_SIGN.get()));
        // this.add(ModBlocks.PINE_HANGING_SIGN.get(), block ->
        //         createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
        // this.add(ModBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
        //         createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));

        // this.dropSelf(ModBlocks.PINE_SAPLING.get());
    }

    protected LootTable.Builder createPrimorditeOreDrops(Block block, Item rawItem) {
        return createSilkTouchDispatchTable(block,
          this.applyExplosionDecay(block,
            LootItem.lootTableItem(rawItem)
              .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
              .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    // protected LootTable.Builder createDreadedPrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    // protected LootTable.Builder createSanguinePrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    // protected LootTable.Builder createEnergeticPrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    // protected LootTable.Builder createCognitePrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    // protected LootTable.Builder createMortalPrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
