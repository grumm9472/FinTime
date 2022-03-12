
package enchia.time.main.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import enchia.time.main.world.inventory.CheatMenu;
import enchia.time.main.network.CheatButtonMessage;
import enchia.time.main.TimeMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CheatScreen extends AbstractContainerScreen<CheatMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Cheat_code;

	public CheatScreen(CheatMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 128;
		this.imageHeight = 85;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("time:textures/cheat.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Cheat_code.render(ms, mouseX, mouseY, partialTicks);
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
		if (Cheat_code.isFocused())
			return Cheat_code.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Cheat_code.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Enter cheat code:", 18, 11, -12829636);
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
		Cheat_code = new EditBox(this.font, this.leftPos + 3, this.topPos + 24, 120, 20, new TextComponent(""));
		CheatMenu.guistate.put("text:Cheat_code", Cheat_code);
		Cheat_code.setMaxLength(32767);
		this.addWidget(this.Cheat_code);
		this.addRenderableWidget(new Button(this.leftPos + 35, this.topPos + 52, 55, 20, new TextComponent("Finish"), e -> {
			if (true) {
				TimeMod.PACKET_HANDLER.sendToServer(new CheatButtonMessage(0, x, y, z));
				CheatButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
