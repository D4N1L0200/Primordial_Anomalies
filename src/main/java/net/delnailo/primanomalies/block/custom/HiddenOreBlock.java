package net.delnailo.primanomalies.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class HiddenOreBlock extends Block {
    final RegistryObject<Block> revealedOre;

    public HiddenOreBlock(Properties properties, RegistryObject<Block> revealedOre) {
        super(properties);
        this.revealedOre = revealedOre;
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos,
                                          Player pPlayer, @NotNull InteractionHand pHand,
                                          @NotNull BlockHitResult pHit) {
        ItemStack heldItem = pPlayer.getItemInHand(pHand);

        if (!pLevel.isClientSide && isRevealingItem(heldItem)) {
            BlockState revealedOre = this.revealedOre.get().defaultBlockState();
            pLevel.setBlock(pPos, revealedOre, 3);
            pLevel.playSound(null, pPos, SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
            heldItem.hurtAndBreak(1, pPlayer, (p) -> p.broadcastBreakEvent(pHand));
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    private boolean isRevealingItem(ItemStack item) {
        return item.is(Items.DIAMOND_HOE); // TODO: use tags
    }
}
