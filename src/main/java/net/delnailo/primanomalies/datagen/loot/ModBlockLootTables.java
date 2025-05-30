package net.delnailo.primanomalies.datagen.loot;

import net.delnailo.primanomalies.block.ModBlocks;
import net.delnailo.primanomalies.item.ModItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // DREADED ITEMS
        this.dropSelf(ModBlocks.DREADED_PRIMORDITE_BLOCK.get());

        this.addPrimorditeOreSet(ModBlocks.DREADED_PRIMORDITE_ORE, ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE,
          ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE, ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE, ModItems.DREADED_PRIMORDITE);

        // VITAL ITEMS
        this.dropSelf(ModBlocks.VITAL_PRIMORDITE_BLOCK.get());

        this.addPrimorditeOreSet(ModBlocks.VITAL_PRIMORDITE_ORE, ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE,
          ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE, ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE, ModItems.VITAL_PRIMORDITE);

        // ENERGETIC ITEMS
        this.dropSelf(ModBlocks.ENERGETIC_PRIMORDITE_BLOCK.get());

        this.addPrimorditeOreSet(ModBlocks.ENERGETIC_PRIMORDITE_ORE, ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE,
          ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE, ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE, ModItems.ENERGETIC_PRIMORDITE);

        // CEREBRAL ITEMS
        this.dropSelf(ModBlocks.CEREBRAL_PRIMORDITE_BLOCK.get());

        this.addPrimorditeOreSet(ModBlocks.CEREBRAL_PRIMORDITE_ORE, ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE,
          ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE, ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE, ModItems.CEREBRAL_PRIMORDITE);

        // MOURNFUL ITEMS
        this.dropSelf(ModBlocks.MOURNFUL_PRIMORDITE_BLOCK.get());

        this.addPrimorditeOreSet(ModBlocks.MOURNFUL_PRIMORDITE_ORE, ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE,
          ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE, ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE, ModItems.MOURNFUL_PRIMORDITE);
    }

//    protected LootTable.Builder emptyLootTable() {
//        return LootTable.lootTable();
//    }

    private LootTable.Builder silkTouchOrElse(Block silkTouchDrop, Block defaultDrop) {
        return LootTable.lootTable().withPool(
          LootPool.lootPool()
            .setRolls(ConstantValue.exactly(1))
            .add(AlternativesEntry.alternatives(
              LootItem.lootTableItem(silkTouchDrop)
                .when(MatchTool.toolMatches(
                  ItemPredicate.Builder.item()
                    .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))
                )),
              LootItem.lootTableItem(defaultDrop)
                .apply(ApplyExplosionDecay.explosionDecay())
            ))
        );
    }

    protected LootTable.Builder createPrimorditeOreDrops(Block block, Item rawItem) {
        return LootTable.lootTable().withPool(
          LootPool.lootPool()
            .setRolls(ConstantValue.exactly(1.0F))
            .add(
              AlternativesEntry.alternatives(
                // Silk Touch: drop the block itself
                LootItem.lootTableItem(block)
                  .when(MatchTool.toolMatches(
                    ItemPredicate.Builder.item()
                      .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))
                  )),
                // Else: drop raw item with count, bonus and explosion decay
                LootItem.lootTableItem(rawItem)
                  .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                  .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                  .apply(ApplyExplosionDecay.explosionDecay())
              )
            )
        );
    }

    // protected LootTable.Builder createDreadedPrimorditeOreDrops(Block block, Item rawItem) {
    //     return createPrimorditeOreDrops(block, rawItem);
    // }

    private void addPrimorditeOreSet(RegistryObject<Block> oreBlock,
                                     RegistryObject<Block> deepslateOreBlock,
                                     RegistryObject<Block> hiddenOreBlock,
                                     RegistryObject<Block> hiddenDeepslateOreBlock,
                                     RegistryObject<Item> rawOreItem) {
        this.add(oreBlock.get(),
          block -> createPrimorditeOreDrops(
            oreBlock.get(), rawOreItem.get())
        );
        this.add(deepslateOreBlock.get(),
          block -> createPrimorditeOreDrops(
            deepslateOreBlock.get(), rawOreItem.get())
        );

        this.add(hiddenOreBlock.get(),
          block -> silkTouchOrElse(
            Blocks.STONE,
            Blocks.COBBLESTONE
          ));
        this.add(hiddenDeepslateOreBlock.get(),
          block -> silkTouchOrElse(
            Blocks.DEEPSLATE,
            Blocks.COBBLED_DEEPSLATE
          ));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
