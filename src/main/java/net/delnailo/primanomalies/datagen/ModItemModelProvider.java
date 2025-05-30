package net.delnailo.primanomalies.datagen;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Primanomalies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // DREADED ITEMS
        simpleItem(ModItems.DREADED_PRIMORDITE);
        simpleItem(ModItems.PURE_DREADED_PRIMORDITE);

        // VITAL ITEMS
        simpleItem(ModItems.VITAL_PRIMORDITE);
        simpleItem(ModItems.PURE_VITAL_PRIMORDITE);

        // ENERGETIC ITEMS
        simpleItem(ModItems.ENERGETIC_PRIMORDITE);
        simpleItem(ModItems.PURE_ENERGETIC_PRIMORDITE);

        // CEREBRAL ITEMS
        simpleItem(ModItems.CEREBRAL_PRIMORDITE);
        simpleItem(ModItems.PURE_CEREBRAL_PRIMORDITE);

        // MOURNFUL ITEMS
        simpleItem(ModItems.MOURNFUL_PRIMORDITE);
        simpleItem(ModItems.PURE_MOURNFUL_PRIMORDITE);
    }

    private void simpleItem(RegistryObject<Item> item) {
        assert item.getId() != null;
        withExistingParent(item.getId().getPath(),
          ResourceLocation.parse("item/generated")).texture("layer0",
          ResourceLocation.fromNamespaceAndPath(Primanomalies.MOD_ID, "item/" + item.getId().getPath()));
    }
}
