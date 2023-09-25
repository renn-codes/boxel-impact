package com.zombieturtle.boxelimpact;

import com.zombieturtle.boxelimpact.config.ModCfg;
import com.zombieturtle.boxelimpact.config.Tier1Cfg;
import com.zombieturtle.boxelimpact.config.Tier2Cfg;
import com.zombieturtle.boxelimpact.config.Tier3Cfg;
import com.zombieturtle.boxelimpact.init.ItemInit;
import com.zombieturtle.boxelimpact.zt.handlers.ItemListHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BoxelImpact.ModID)
public class BoxelImpact {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static ItemListHandler TIER1;
    public static ItemListHandler TIER2;
    public static ItemListHandler TIER3;
    public static final String ModID = "boxelimpact";

    public BoxelImpact() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register Items
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        // Register Config
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCfg.SPEC, "boxelimpact-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Tier1Cfg.SPEC, "boxelimpact-tier1.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Tier2Cfg.SPEC, "boxelimpact-tier2.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Tier3Cfg.SPEC, "boxelimpact-tier3.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.atInfo().log("Loading banner items [Tier 1]");
        TIER1 = new ItemListHandler(1, Tier1Cfg.ITEMS_PER_PULL.get() ,Tier1Cfg.COMMON_ITEMS.get(), Tier1Cfg.COMMON_CHANCE.get(), Tier1Cfg.UNCOMMON_ITEMS.get(), Tier1Cfg.UNCOMMON_CHANCE.get(), Tier1Cfg.RARE_ITEMS.get(), Tier1Cfg.RARE_CHANCE.get());
        TIER2 = new ItemListHandler(2, Tier2Cfg.ITEMS_PER_PULL.get() ,Tier2Cfg.COMMON_ITEMS.get(), Tier2Cfg.COMMON_CHANCE.get(), Tier2Cfg.UNCOMMON_ITEMS.get(), Tier2Cfg.UNCOMMON_CHANCE.get(), Tier2Cfg.RARE_ITEMS.get(), Tier2Cfg.RARE_CHANCE.get());
        TIER3 = new ItemListHandler(3, Tier3Cfg.ITEMS_PER_PULL.get() ,Tier3Cfg.COMMON_ITEMS.get(), Tier3Cfg.COMMON_CHANCE.get(), Tier3Cfg.UNCOMMON_ITEMS.get(), Tier3Cfg.UNCOMMON_CHANCE.get(), Tier3Cfg.RARE_ITEMS.get(), Tier3Cfg.RARE_CHANCE.get());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod

    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLDedicatedServerSetupEvent event) {
        // do something when the server starts

    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.BLOCKS,
                helper -> {
                    //helper.register(new ResourceLocation(MODID, "example_block_1"), new Block(...));
                    //helper.register(new ResourceLocation(MODID, "example_block_2"), new Block(...));
                    //helper.register(new ResourceLocation(MODID, "example_block_3"), new Block(...));
                    // ...
                }
        );
    }

    /**
     * Returns the banner name for the specified tier. Required to call before changing to a GachaScreen.
     * @param tier  The tier of the banner, as an int
     * @return   The name of the banner, as a String
     */

    public String getGachaScreenTitle(int tier) {
        return switch (tier) {
            case 1 -> Tier1Cfg.BANNER_NAME.get();
            case 2 -> Tier2Cfg.BANNER_NAME.get();
            case 3 -> Tier3Cfg.BANNER_NAME.get();
            default -> "BANNER_NAME";
        };
    }
}
