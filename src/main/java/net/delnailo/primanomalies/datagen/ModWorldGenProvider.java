package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.worldgen.ModBiomeModifiers;
import net.delnailo.primanomalies.worldgen.ModConfiguredFeatures;
import net.delnailo.primanomalies.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
//            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType)
      .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
      .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
      .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
//            .add(Registries.BIOME, ModBiomes::boostrap)
//            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Primanomalies.MOD_ID));
    }
}
