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
    public static final RegistryObject<Item> DREADED_PRIMORDITE = ITEMS.register("dreaded_primordite",
      () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_DREADED_PRIMORDITE = ITEMS.register("pure_dreaded_primordite",
      () -> new Item(new Item.Properties()));

    // VITAL ITEMS
    public static final RegistryObject<Item> VITAL_PRIMORDITE = ITEMS.register("vital_primordite",
      () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_VITAL_PRIMORDITE = ITEMS.register("pure_vital_primordite",
      () -> new Item(new Item.Properties()));

    // ENERGETIC ITEMS
    public static final RegistryObject<Item> ENERGETIC_PRIMORDITE = ITEMS.register("energetic_primordite",
      () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_ENERGETIC_PRIMORDITE = ITEMS.register("pure_energetic_primordite",
      () -> new Item(new Item.Properties()));

    // CEREBRAL ITEMS
    public static final RegistryObject<Item> CEREBRAL_PRIMORDITE = ITEMS.register("cerebral_primordite",
      () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_CEREBRAL_PRIMORDITE = ITEMS.register("pure_cerebral_primordite",
      () -> new Item(new Item.Properties()));

    // MOURNFUL ITEMS
    public static final RegistryObject<Item> MOURNFUL_PRIMORDITE = ITEMS.register("mournful_primordite",
      () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_MOURNFUL_PRIMORDITE = ITEMS.register("pure_mournful_primordite",
      () -> new Item(new Item.Properties()));

    /* ITEM REGISTERING END */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}