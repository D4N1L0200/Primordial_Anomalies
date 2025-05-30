package net.delnailo.primanomalies.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public record PrimorditeOreSet(
  RegistryObject<? extends Block> stone,
  RegistryObject<? extends Block> deepslate,
  RegistryObject<? extends Block> hiddenStone,
  RegistryObject<? extends Block> hiddenDeepslate
) {
}
