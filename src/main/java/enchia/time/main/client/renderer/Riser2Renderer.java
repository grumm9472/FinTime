package enchia.time.main.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import enchia.time.main.entity.Riser2Entity;

public class Riser2Renderer extends MobRenderer<Riser2Entity, CreeperModel<Riser2Entity>> {
	public Riser2Renderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Riser2Entity entity) {
		return new ResourceLocation("time:textures/phantom_creeper.png");
	}
}
