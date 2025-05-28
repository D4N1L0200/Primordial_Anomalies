package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.block.ModBlocks;
import net.delnailo.primanomalies.item.ModItems;
import net.delnailo.primanomalies.datagen.loot.ModBlockLootTables;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class ModLootTableProvider {

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
          new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK),

          new LootTableProvider.SubProviderEntry(() -> (lootOutput) -> {
              Map<String, Item> oreToRawItem = Map.of(
                "dreaded_primordite_ore", ModItems.RAW_DREADED_PRIMORDITE.get(),
                "deepslate_dreaded_primordite_ore", ModItems.RAW_DREADED_PRIMORDITE.get(),
                "vital_primordite_ore", ModItems.RAW_VITAL_PRIMORDITE.get(),
                "deepslate_vital_primordite_ore", ModItems.RAW_VITAL_PRIMORDITE.get(),
                "energetic_primordite_ore", ModItems.RAW_ENERGETIC_PRIMORDITE.get(),
                "deepslate_energetic_primordite_ore", ModItems.RAW_ENERGETIC_PRIMORDITE.get(),
                "cerebral_primordite_ore", ModItems.RAW_CEREBRAL_PRIMORDITE.get(),
                "deepslate_cerebral_primordite_ore", ModItems.RAW_CEREBRAL_PRIMORDITE.get(),
                "mournful_primordite_ore", ModItems.RAW_MOURNFUL_PRIMORDITE.get(),
                "deepslate_mournful_primordite_ore", ModItems.RAW_MOURNFUL_PRIMORDITE.get()
              );

              for (Map.Entry<String, Item> entry : oreToRawItem.entrySet()) {
                  String oreId = entry.getKey();
                  Item rawDrop = entry.getValue();

                  lootOutput.accept(
                    new ResourceLocation("primanomalies", "blocks/" + oreId + "_drops"),
                    LootTable.lootTable().withPool(
                      LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(
                          AlternativesEntry.alternatives(
                            // Silk Touch: drop self
                            LootItem.lootTableItem(ModBlocks.getByName(oreId).get())
                              .when(MatchTool.toolMatches(
                                ItemPredicate.Builder.item()
                                  .hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1)))
                              )),
                            // Else: drop raw item with bonus and decay
                            LootItem.lootTableItem(rawDrop)
                              .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                              .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                              .apply(ApplyExplosionDecay.explosionDecay())
                          )
                        )
                    )
                  );
              }
          }, LootContextParamSets.BLOCK)
        ));
    }
}
