package net.delnailo.primanomalies.block.entity;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
      DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Primanomalies.MOD_ID);

    public static final RegistryObject<BlockEntityType<HiddenOreBlockEntity>> HIDDEN_ORE_BE =
      BLOCK_ENTITIES.register("hidden_ore_be", () ->
        BlockEntityType.Builder.of(HiddenOreBlockEntity::new,
          ModBlocks.DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_DREADED_PRIMORDITE_ORE.get(),
          ModBlocks.VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_VITAL_PRIMORDITE_ORE.get(),
          ModBlocks.ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get(),
          ModBlocks.CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get(),
          ModBlocks.MOURNFUL_PRIMORDITE_ORE.get(),
          ModBlocks.DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get()
        ).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
