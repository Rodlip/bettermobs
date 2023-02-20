package bettermobs.bettermobs.client.renderer;

import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.client.models.DjewModel;
import bettermobs.bettermobs.common.entities.Djew;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DjewRenderer extends MobRenderer<Djew, DjewModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Bettermobs.MODID, "textures/entity/djew.png");

    public DjewRenderer(EntityRendererProvider.Context ctx) {
        super(ctx,new DjewModel(ctx.bakeLayer(DjewModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Djew entity) {
        return TEXTURE;
    }
}
