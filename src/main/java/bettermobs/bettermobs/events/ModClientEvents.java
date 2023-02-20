package bettermobs.bettermobs.events;

import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.client.models.DjewModel;
import bettermobs.bettermobs.client.models.EddyModel;
import bettermobs.bettermobs.client.renderer.DjewRenderer;
import bettermobs.bettermobs.client.renderer.EddyRenderer;
import bettermobs.bettermobs.core.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bettermobs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.DJEW.get(), DjewRenderer::new);
        event.registerEntityRenderer(ModEntities.EDDY.get(), EddyRenderer::new);

    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(DjewModel.LAYER_LOCATION, DjewModel::createBodyLayer);
        event.registerLayerDefinition(EddyModel.LAYER_LOCATION, EddyModel::createBodyLayer);
    }
}
