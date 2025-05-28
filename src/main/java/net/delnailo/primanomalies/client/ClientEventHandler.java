package net.delnailo.primanomalies.client;

import net.delnailo.primanomalies.Primanomalies;
import net.delnailo.primanomalies.block.entity.ModBlockEntities;
import net.delnailo.primanomalies.client.renderer.HiddenOreBlockRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Primanomalies.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.HIDDEN_ORE_BE.get(), HiddenOreBlockRenderer::new);
    }
}
