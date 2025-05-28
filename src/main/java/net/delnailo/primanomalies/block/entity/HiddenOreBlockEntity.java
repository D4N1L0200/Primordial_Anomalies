package net.delnailo.primanomalies.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HiddenOreBlockEntity extends BlockEntity {
    public HiddenOreBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.HIDDEN_ORE_BE.get(), pPos, pBlockState);
    }
}
