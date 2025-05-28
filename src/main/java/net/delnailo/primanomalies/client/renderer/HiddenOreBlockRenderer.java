package net.delnailo.primanomalies.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.delnailo.primanomalies.block.OrePair;
import net.delnailo.primanomalies.block.entity.HiddenOreBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class HiddenOreBlockRenderer implements BlockEntityRenderer<HiddenOreBlockEntity> {
    private final BlockRenderDispatcher blockRenderer;

    public HiddenOreBlockRenderer(BlockEntityRendererProvider.Context context) {
        this.blockRenderer = Minecraft.getInstance().getBlockRenderer();
    }

    @Override
    public void render(HiddenOreBlockEntity blockEntity, float partialTicks, PoseStack poseStack,
                       MultiBufferSource bufferSource, int light, int overlay) {
        Player player = Minecraft.getInstance().player;

        Block actualBlock = blockEntity.getBlockState().getBlock();
        Block displayBlock;

        OrePair pair = OrePair.findOrePair(actualBlock);
        boolean deepslate = OrePair.isDeepslate(actualBlock);

        assert player != null;
        if (player.hasEffect(MobEffects.INVISIBILITY)) {
            assert pair != null;
            displayBlock = ForgeRegistries.BLOCKS.getValue(
              new ResourceLocation("primanomalies",
                (deepslate ? "deepslate_" : "") + pair.baseName + "_client_visual")
            );
        } else {
            displayBlock = deepslate ? Blocks.DEEPSLATE : Blocks.STONE;
        }

        assert displayBlock != null;
        BlockState displayState = displayBlock.defaultBlockState();

        this.blockRenderer.renderSingleBlock(
          displayState,
          poseStack,
          bufferSource,
          light,
          overlay
        );
    }
}
