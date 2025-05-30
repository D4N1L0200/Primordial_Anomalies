package net.delnailo.primanomalies.worldgen;

import net.delnailo.primanomalies.Primanomalies;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_DREADED_PRIMORDITE_ORE = registerKey("add_dreaded_primordite_ore");
    public static final ResourceKey<BiomeModifier> ADD_VITAL_PRIMORDITE_ORE = registerKey("add_vital_primordite_ore");
    public static final ResourceKey<BiomeModifier> ADD_ENERGETIC_PRIMORDITE_ORE = registerKey("add_energetic_primordite_ore");
    public static final ResourceKey<BiomeModifier> ADD_CEREBRAL_PRIMORDITE_ORE = registerKey("add_cerebral_primordite_ore");
    public static final ResourceKey<BiomeModifier> ADD_MOURNFUL_PRIMORDITE_ORE = registerKey("add_mournful_primordite_ore");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // DREADED ITEMS
        context.register(ADD_DREADED_PRIMORDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
          biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
          HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DREADED_PRIMORDITE_ORE_PLACED_KEY)),
          GenerationStep.Decoration.UNDERGROUND_ORES));

        // VITAL ITEMS
        context.register(ADD_VITAL_PRIMORDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
          biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
          HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.VITAL_PRIMORDITE_ORE_PLACED_KEY)),
          GenerationStep.Decoration.UNDERGROUND_ORES));

        // ENERGETIC ITEMS
        context.register(ADD_ENERGETIC_PRIMORDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
          biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
          HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ENERGETIC_PRIMORDITE_ORE_PLACED_KEY)),
          GenerationStep.Decoration.UNDERGROUND_ORES));

        // CEREBRAL ITEMS
        context.register(ADD_CEREBRAL_PRIMORDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
          biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
          HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CEREBRAL_PRIMORDITE_ORE_PLACED_KEY)),
          GenerationStep.Decoration.UNDERGROUND_ORES));

        // MOURNFUL ITEMS
        context.register(ADD_MOURNFUL_PRIMORDITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
          biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
          HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MOURNFUL_PRIMORDITE_ORE_PLACED_KEY)),
          GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Primanomalies.MOD_ID, name));
    }
}
