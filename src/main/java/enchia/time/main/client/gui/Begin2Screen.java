
package enchia.time.main.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import enchia.time.main.world.inventory.Begin2Menu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Begin2Screen extends AbstractContainerScreen<Begin2Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Begin2Screen(Begin2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 450;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("time:textures/begin_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/nether_reactor.png"));
		this.blit(ms, this.leftPos + 287, this.topPos + 16, 0, 0, 70, 70, 70, 70);

		RenderSystem.setShaderTexture(0, new ResourceLocation("time:textures/nether_reactor_core_be2.png"));
		this.blit(ms, this.leftPos + 287, this.topPos + 88, 0, 0, 70, 70, 70, 70);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "?????", 26, 7, -16777216);
		this.font.draw(poseStack, "????????????????????????????????????????????......", 26, 25, -13421773);
		this.font.draw(poseStack, "????????????????????", 26, 43, -65536);
		this.font.draw(poseStack, "????????????????????????????????????", 26, 61, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
