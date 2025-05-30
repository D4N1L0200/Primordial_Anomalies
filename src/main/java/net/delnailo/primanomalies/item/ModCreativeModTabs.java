package net.delnailo.primanomalies.item;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
      DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Primanomalies.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRIMANOMALIES_TAB = CREATIVE_MODE_TABS.register("primanomalies_tab",
      () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PURE_DREADED_PRIMORDITE.get()))
        .title(Component.translatable("creativetab.primanomalies_tab"))
        .displayItems((pParameters, pOutput) -> {
            // DREADED ITEMS
            pOutput.accept(ModBlocks.DREADED_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE.get());
            pOutput.accept(ModItems.DREADED_PRIMORDITE.get());
            pOutput.accept(ModBlocks.DREADED_PRIMORDITE_BLOCK.get());
            pOutput.accept(ModItems.PURE_DREADED_PRIMORDITE.get());

            // VITAL ITEMS
            pOutput.accept(ModBlocks.VITAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModItems.VITAL_PRIMORDITE.get());
            pOutput.accept(ModBlocks.VITAL_PRIMORDITE_BLOCK.get());
            pOutput.accept(ModItems.PURE_VITAL_PRIMORDITE.get());

            // ENERGETIC ITEMS
            pOutput.accept(ModBlocks.ENERGETIC_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get());
            pOutput.accept(ModItems.ENERGETIC_PRIMORDITE.get());
            pOutput.accept(ModBlocks.ENERGETIC_PRIMORDITE_BLOCK.get());
            pOutput.accept(ModItems.PURE_ENERGETIC_PRIMORDITE.get());

            // CEREBRAL ITEMS
            pOutput.accept(ModBlocks.CEREBRAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get());
            pOutput.accept(ModItems.CEREBRAL_PRIMORDITE.get());
            pOutput.accept(ModBlocks.CEREBRAL_PRIMORDITE_BLOCK.get());
            pOutput.accept(ModItems.PURE_CEREBRAL_PRIMORDITE.get());

            // MOURNFUL ITEMS
            pOutput.accept(ModBlocks.MOURNFUL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE.get());
            pOutput.accept(ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get());
            pOutput.accept(ModItems.MOURNFUL_PRIMORDITE.get());
            pOutput.accept(ModBlocks.MOURNFUL_PRIMORDITE_BLOCK.get());
            pOutput.accept(ModItems.PURE_MOURNFUL_PRIMORDITE.get());
        })
        .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}