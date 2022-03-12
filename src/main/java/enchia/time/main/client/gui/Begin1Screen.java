
package enchia.time.main.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import enchia.time.main.world.inventory.Begin1Menu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Begin1Screen extends AbstractContainerScreen<Begin1Menu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Begin1Screen(Begin1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 450;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("time:textures/begin_1.png");

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
		this.font.draw(poseStack, "?????", 17, 7, -16777216);
		this.font.draw(poseStack, "?????????????????????????????????????...", 17, 28, -13421773);
		this.font.draw(poseStack, "???????????????????????????????????????", 17, 47, -13421773);
		this.font.draw(poseStack, "??", 170, 70, -16777216);
		this.font.draw(poseStack, "????????????????????", 17, 70, -16777216);
		this.font.draw(poseStack, "????", 188, 70, -10027264);
		this.font.draw(poseStack, "????", 215, 70, -10092544);
		this.font.draw(poseStack, "????", 242, 70, -16764109);
		this.font.draw(poseStack, ",", 179, 109, -16777216);
		this.font.draw(poseStack, ",", 227, 134, -16777216);
		this.font.draw(poseStack, "??????????????????????", 17, 88, -16777216);
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
