package net.delnailo.primanomalies.block.custom;

import net.delnailo.primanomalies.block.OrePair;
import net.delnailo.primanomalies.block.entity.HiddenOreBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HiddenOreBlock extends DropExperienceBlock implements EntityBlock {
    public HiddenOreBlock(Properties pProperties, IntProvider pXpRange) {
        super(pProperties, pXpRange);
    }

    private static ResourceLocation getLootTableFor(BlockState state, Player player, ItemStack tool) {
        Block block = state.getBlock();
        OrePair pair = OrePair.findOrePair(block);

        if (pair == null) {
            // fallback: return some default loot table
            return new ResourceLocation("minecraft", "blocks/cobblestone");
        }

        boolean invis = player.hasEffect(MobEffects.INVISIBILITY);
        boolean deepslate = OrePair.isDeepslate(block);

        if (invis) {
            // Drop ore item loot table
            return new ResourceLocation("primanomalies", "blocks/" + (deepslate ? "deepslate_" : "") + pair.baseName + "_drops");
        }
        // default: drop stone or deepslate
        return new ResourceLocation("minecraft", deepslate ? "blocks/deepslate" : "blocks/stone");
    }

    @Override
    public void playerDestroy(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState, @Nullable BlockEntity pBlockEntity, ItemStack pTool) {
        if (!pLevel.isClientSide) {
            ResourceLocation lootTableId;

            lootTableId = getLootTableFor(pState, pPlayer, pTool);

            LootParams.Builder paramsBuilder = new LootParams.Builder((ServerLevel) pLevel)
              .withParameter(LootContextParams.ORIGIN, Vec3.atCenterOf(pPos))
              .withParameter(LootContextParams.TOOL, pTool)
              .withParameter(LootContextParams.BLOCK_STATE, pState)
              .withParameter(LootContextParams.THIS_ENTITY, pPlayer);

            List<ItemStack> drops = pLevel.getServer().getLootData()
              .getLootTable(lootTableId)
              .getRandomItems(paramsBuilder.create(LootContextParamSets.BLOCK));

            for (ItemStack drop : drops) {
                popResource(pLevel, pPos, drop);
            }
        }

        super.playerDestroy(pLevel, pPlayer, pPos, pState, pBlockEntity, pTool);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new HiddenOreBlockEntity(pPos, pState);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.INVISIBLE;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return 0;
    }
}
