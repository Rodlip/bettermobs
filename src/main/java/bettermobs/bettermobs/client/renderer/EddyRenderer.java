package bettermobs.bettermobs.client.renderer;

import bettermobs.bettermobs.Bettermobs;
import bettermobs.bettermobs.client.models.EddyModel;
import bettermobs.bettermobs.common.entities.Eddy;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EddyRenderer extends MobRenderer<Eddy, EddyModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Bettermobs.MODID, "textures/entity/eddy.png");

    public EddyRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new EddyModel(ctx.bakeLayer(EddyModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Eddy entity) {
        return TEXTURE;
    }
}