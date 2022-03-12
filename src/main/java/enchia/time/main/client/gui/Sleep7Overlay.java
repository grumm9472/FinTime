
package enchia.time.main.client.gui;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import enchia.time.main.procedures.SleepBar7Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class Sleep7Overlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (SleepBar7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 5, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 14, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 23, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 32, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 41, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 50, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 59, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 68, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 77, 0, 0, 16, 16, 16, 16);

				RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -189, posY + 86, 0, 0, 16, 16, 16, 16);

			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
