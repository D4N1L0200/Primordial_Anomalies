package net.delnailo.primanomalies.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import static net.delnailo.primanomalies.block.ModBlocks.ORE_PAIRS;

public class OrePair {
    public final RegistryObject<Block> normalOre;
    public final RegistryObject<Block> deepslateOre;
    public final String baseName;

    public OrePair(RegistryObject<Block> normalOre, RegistryObject<Block> deepslateOre, String baseName) {
        this.normalOre = normalOre;
        this.deepslateOre = deepslateOre;
        this.baseName = baseName;
    }

    public static OrePair findOrePair(Block block) {
        for (OrePair pair : ORE_PAIRS) {
            if (pair.normalOre.get() == block || pair.deepslateOre.get() == block) {
                return pair;
            }
        }
        return null;
    }

    public static boolean isDeepslate(Block block) {
        for (OrePair pair : ORE_PAIRS) {
            if (pair.deepslateOre.get() == block) return true;
        }
        return false;
    }
}
