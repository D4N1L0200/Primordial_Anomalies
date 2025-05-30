package net.delnailo.primanomalies.worldgen;

import net.delnailo.primanomalies.Primanomalies;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> DREADED_PRIMORDITE_ORE_PLACED_KEY = registerKey("dreaded_primordite_ore_placed");
    public static final ResourceKey<PlacedFeature> VITAL_PRIMORDITE_ORE_PLACED_KEY = registerKey("vital_primordite_ore_placed");
    public static final ResourceKey<PlacedFeature> ENERGETIC_PRIMORDITE_ORE_PLACED_KEY = registerKey("energetic_primordite_ore_placed");
    public static final ResourceKey<PlacedFeature> CEREBRAL_PRIMORDITE_ORE_PLACED_KEY = registerKey("cerebral_primordite_ore_placed");
    public static final ResourceKey<PlacedFeature> MOURNFUL_PRIMORDITE_ORE_PLACED_KEY = registerKey("mournful_primordite_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // DREADED ITEMS
        register(context, DREADED_PRIMORDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DREADED_PRIMORDITE_ORE_KEY),
          ModOrePlacement.commonOrePlacement(2,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        // VITAL ITEMS
        register(context, VITAL_PRIMORDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_VITAL_PRIMORDITE_ORE_KEY),
          ModOrePlacement.commonOrePlacement(2,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        // ENERGETIC ITEMS
        register(context, ENERGETIC_PRIMORDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ENERGETIC_PRIMORDITE_ORE_KEY),
          ModOrePlacement.commonOrePlacement(2,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        // CEREBRAL ITEMS
        register(context, CEREBRAL_PRIMORDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CEREBRAL_PRIMORDITE_ORE_KEY),
          ModOrePlacement.commonOrePlacement(2,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));

        // MOURNFUL ITEMS
        register(context, MOURNFUL_PRIMORDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MOURNFUL_PRIMORDITE_ORE_KEY),
          ModOrePlacement.commonOrePlacement(2,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Primanomalies.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
