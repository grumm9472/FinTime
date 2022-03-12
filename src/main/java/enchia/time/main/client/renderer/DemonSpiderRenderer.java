package enchia.time.main.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import enchia.time.main.entity.DemonSpiderEntity;

public class DemonSpiderRenderer extends MobRenderer<DemonSpiderEntity, SpiderModel<DemonSpiderEntity>> {
	public DemonSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DemonSpiderEntity entity) {
		return new ResourceLocation("time:textures/demon_spider.png");
	}
}
