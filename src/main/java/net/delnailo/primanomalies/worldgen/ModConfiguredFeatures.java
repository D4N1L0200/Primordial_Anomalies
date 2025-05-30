package net.delnailo.primanomalies.worldgen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DREADED_PRIMORDITE_ORE_KEY = registerKey("dreaded_primordite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VITAL_PRIMORDITE_ORE_KEY = registerKey("vital_primordite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ENERGETIC_PRIMORDITE_ORE_KEY = registerKey("energetic_primordite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CEREBRAL_PRIMORDITE_ORE_KEY = registerKey("cerebral_primordite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MOURNFUL_PRIMORDITE_ORE_KEY = registerKey("mournful_primordite_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // DREADED ORES
        List<OreConfiguration.TargetBlockState> overworldDreadedPrimorditeOres = List.of(
          OreConfiguration.target(stoneReplaceable, ModBlocks.HIDDEN_DREADED_PRIMORDITE_ORE.get().defaultBlockState()),
          OreConfiguration.target(deepslateReplaceable, ModBlocks.HIDDEN_DEEPSLATE_DREADED_PRIMORDITE_ORE.get().defaultBlockState())
        );
        register(
          context, OVERWORLD_DREADED_PRIMORDITE_ORE_KEY, Feature.ORE,
          new OreConfiguration(overworldDreadedPrimorditeOres, 4)
        );

        // VITAL ORES
        List<OreConfiguration.TargetBlockState> overworldVitalPrimorditeOres = List.of(
          OreConfiguration.target(stoneReplaceable, ModBlocks.HIDDEN_VITAL_PRIMORDITE_ORE.get().defaultBlockState()),
          OreConfiguration.target(deepslateReplaceable, ModBlocks.HIDDEN_DEEPSLATE_VITAL_PRIMORDITE_ORE.get().defaultBlockState())
        );
        register(
          context, OVERWORLD_VITAL_PRIMORDITE_ORE_KEY, Feature.ORE,
          new OreConfiguration(overworldVitalPrimorditeOres, 4)
        );

        // ENERGETIC ORES
        List<OreConfiguration.TargetBlockState> overworldEnergeticPrimorditeOres = List.of(
          OreConfiguration.target(stoneReplaceable, ModBlocks.HIDDEN_ENERGETIC_PRIMORDITE_ORE.get().defaultBlockState()),
          OreConfiguration.target(deepslateReplaceable, ModBlocks.HIDDEN_DEEPSLATE_ENERGETIC_PRIMORDITE_ORE.get().defaultBlockState())
        );
        register(
          context, OVERWORLD_ENERGETIC_PRIMORDITE_ORE_KEY, Feature.ORE,
          new OreConfiguration(overworldEnergeticPrimorditeOres, 4)
        );

        // CEREBRAL ORES
        List<OreConfiguration.TargetBlockState> overworldCerebralPrimorditeOres = List.of(
          OreConfiguration.target(stoneReplaceable, ModBlocks.HIDDEN_CEREBRAL_PRIMORDITE_ORE.get().defaultBlockState()),
          OreConfiguration.target(deepslateReplaceable, ModBlocks.HIDDEN_DEEPSLATE_CEREBRAL_PRIMORDITE_ORE.get().defaultBlockState())
        );
        register(
          context, OVERWORLD_CEREBRAL_PRIMORDITE_ORE_KEY, Feature.ORE,
          new OreConfiguration(overworldCerebralPrimorditeOres, 4)
        );

        // MOURNFUL ORES
        List<OreConfiguration.TargetBlockState> overworldMournfulPrimorditeOres = List.of(
          OreConfiguration.target(stoneReplaceable, ModBlocks.HIDDEN_MOURNFUL_PRIMORDITE_ORE.get().defaultBlockState()),
          OreConfiguration.target(deepslateReplaceable, ModBlocks.HIDDEN_DEEPSLATE_MOURNFUL_PRIMORDITE_ORE.get().defaultBlockState())
        );
        register(
          context, OVERWORLD_MOURNFUL_PRIMORDITE_ORE_KEY, Feature.ORE,
          new OreConfiguration(overworldMournfulPrimorditeOres, 4)
        );

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Primanomalies.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
