package enchia.time.main.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import enchia.time.main.entity.SilentCreeperEntity;

public class SilentCreeperRenderer extends MobRenderer<SilentCreeperEntity, CreeperModel<SilentCreeperEntity>> {
	public SilentCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SilentCreeperEntity entity) {
		return new ResourceLocation("time:textures/creepersina.png");
	}
}
