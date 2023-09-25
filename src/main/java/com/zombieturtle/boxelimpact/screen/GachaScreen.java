package com.zombieturtle.boxelimpact.screen;

import com.mojang.blaze3d.vertex.PoseStack;
import com.zombieturtle.boxelimpact.BoxelImpact;
import com.zombieturtle.boxelimpact.config.Tier1Cfg;
import com.zombieturtle.boxelimpact.zt.data.PullPayload;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.math3.util.Pair;

import java.util.List;

public class GachaScreen extends Screen {

    // Constants
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 20;
    private static final int DONE_BUTTON_TOP_OFFSET = 22;
    private static final int WISH_BUTTON_TOP_OFFSET = 50;
    private static final int WISH_BUTTON_WIDTH = 45;
    private static final int BANNER_WIDTH = 146;
    private static final int BANNER_HEIGHT = 160;
    protected static int TIER = 0;
    // Banner texture
    protected static ResourceLocation BANNER_IMAGE =  new ResourceLocation("boxelimpact", "textures/banners/default.png");
    // Pull results payload
    protected static PullPayload PULL_PAYLOAD = new PullPayload(TIER);
    // Item lists
    protected static List<String> commonItemList;
    protected static List<String> uncommonItemList;
    protected static List<String> rareItemList;

    // Init method
    @Override
    protected void init() {
        // Add the buttons
        this.addRenderableWidget(Button.builder(Component.literal("Wish!"), (button) -> pull(TIER)).bounds((this.width / 2) - (WISH_BUTTON_WIDTH / 2), ((this.height - this.BANNER_HEIGHT) / 2) + (this.BANNER_HEIGHT / 2) + WISH_BUTTON_TOP_OFFSET,WISH_BUTTON_WIDTH, BUTTON_HEIGHT).build());
        this.addRenderableWidget(Button.builder(Component.literal("Done"), (button) -> minecraft.setScreen(null)).bounds(((this.width / 2) - (BUTTON_WIDTH / 2)), (this.height - DONE_BUTTON_TOP_OFFSET),BUTTON_WIDTH, BUTTON_HEIGHT).build());
                BANNER_IMAGE = new ResourceLocation("boxelimpact", "textures/banners/" + TIER + ".png");
        // Call the super class' method
        super.init();
    }

    protected static void pull(int TIER) {
        PULL_PAYLOAD = new PullPayload(TIER);
        for(Pair<String, Integer> item : BoxelImpact.TIER1.pullMultiItems()) {
            PULL_PAYLOAD.addPull(item.getFirst(), Tier1Cfg.ITEMS_PER_PULL.get(), item.getSecond());
            System.out.println("Pulled " + Tier1Cfg.ITEMS_PER_PULL.get() + " " + item.getFirst() + ", rarity " + item.getSecond());
        }
    }

    // Constructor
    public GachaScreen(String screenTitle, int tier) {
        // Use the super class' constructor to set the title of the screen
        super(Component.literal(screenTitle));
        TIER = tier;
    }

    // Render the screen
    @Override
    public void render(PoseStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        // First, draw the background off the screen
        this.renderBackground(matrixStack);
        // Then, draw the banner
        minecraft.getTextureManager().getTexture(BANNER_IMAGE);
        int edgeSpacingX = (this.width - this.BANNER_WIDTH) / 2;
        int edgeSpacingY = ((this.height - this.BANNER_HEIGHT) / 2) - 20;
        this.blit(matrixStack, edgeSpacingX, edgeSpacingY, 0, 0, BANNER_WIDTH, BANNER_HEIGHT, BANNER_WIDTH, BANNER_HEIGHT);
        // Call the super class' method to draw the rest of the screen
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }
}
