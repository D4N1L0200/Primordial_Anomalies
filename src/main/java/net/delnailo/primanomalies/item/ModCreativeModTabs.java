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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DREADED_CORE.get()))
                    .title(Component.translatable("creativetab.primanomalies_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // DREADED ITEMS
                        pOutput.accept(ModBlocks.DREADED_PRIMORDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get());
                        pOutput.accept(ModItems.RAW_DREADED_PRIMORDITE.get());
                        pOutput.accept(ModBlocks.RAW_DREADED_PRIMORDITE_BLOCK.get());
                        pOutput.accept(ModItems.DREADED_CORE.get());

                        // VITAL ITEMS
                        pOutput.accept(ModBlocks.VITAL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModItems.RAW_VITAL_PRIMORDITE.get());
                        pOutput.accept(ModBlocks.RAW_VITAL_PRIMORDITE_BLOCK.get());
                        pOutput.accept(ModItems.VITAL_CORE.get());

                        // ENERGETIC ITEMS
                        pOutput.accept(ModBlocks.ENERGETIC_PRIMORDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get());
                        pOutput.accept(ModItems.RAW_ENERGETIC_PRIMORDITE.get());
                        pOutput.accept(ModBlocks.RAW_ENERGETIC_PRIMORDITE_BLOCK.get());
                        pOutput.accept(ModItems.ENERGETIC_CORE.get());

                        // CEREBRAL ITEMS
                        pOutput.accept(ModBlocks.CEREBRAL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModItems.RAW_CEREBRAL_PRIMORDITE.get());
                        pOutput.accept(ModBlocks.RAW_CEREBRAL_PRIMORDITE_BLOCK.get());
                        pOutput.accept(ModItems.CEREBRAL_CORE.get());

                        // MOURNFUL ITEMS
                        pOutput.accept(ModBlocks.MOURNFUL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get());
                        pOutput.accept(ModItems.RAW_MOURNFUL_PRIMORDITE.get());
                        pOutput.accept(ModBlocks.RAW_MOURNFUL_PRIMORDITE_BLOCK.get());
                        pOutput.accept(ModItems.MOURNFUL_CORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}