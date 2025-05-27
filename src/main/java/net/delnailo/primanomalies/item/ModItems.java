package net.delnailo.primanomalies.item;

import net.delnailo.primanomalies.Primanomalies;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Primanomalies.MOD_ID);

    /* ITEM REGISTERING INIT */

    // DREADED ITEMS
    public static final RegistryObject<Item> RAW_DREADED_PRIMORDITE = ITEMS.register("raw_dreaded_primordite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREADED_CORE = ITEMS.register("dreaded_core",
            () -> new Item(new Item.Properties()));

    // VITAL ITEMS
    public static final RegistryObject<Item> RAW_VITAL_PRIMORDITE = ITEMS.register("raw_vital_primordite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VITAL_CORE = ITEMS.register("vital_core",
            () -> new Item(new Item.Properties()));

    // ENERGETIC ITEMS
    public static final RegistryObject<Item> RAW_ENERGETIC_PRIMORDITE = ITEMS.register("raw_energetic_primordite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENERGETIC_CORE = ITEMS.register("energetic_core",
            () -> new Item(new Item.Properties()));

    // CEREBRAL ITEMS
    public static final RegistryObject<Item> RAW_CEREBRAL_PRIMORDITE = ITEMS.register("raw_cerebral_primordite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CEREBRAL_CORE = ITEMS.register("cerebral_core",
            () -> new Item(new Item.Properties()));

    // MOURNFUL ITEMS
    public static final RegistryObject<Item> RAW_MOURNFUL_PRIMORDITE = ITEMS.register("raw_mournful_primordite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOURNFUL_CORE = ITEMS.register("mournful_core",
            () -> new Item(new Item.Properties()));

    /* ITEM REGISTERING END */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}