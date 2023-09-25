package com.zombieturtle.boxelimpact.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCfg {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Currency and exchanges

    /**
     * The number of Star Coins required to exchange for a single Moon Coin
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> STAR_TO_MOON_EXCH;
    /**
     * Enable/Disable Heart Fragments
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> HEART_FRAGMENTS;

    //Banner

    /**
     * Enable/Disable the Tier 1 banner
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> BANNER_TIER_1;
    /**
     * Enable/Disable the Tier 2 banner
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> BANNER_TIER_2;
    /**
     * Enable/Disable the Tier 3 banner
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> BANNER_TIER_3;

    //Tickets

    /**
     * Enable/Disable Enchanted Tickets
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENCHANTED_TICKET;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENCHANTED_TICKET_STAR_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENCHANTED_TICKET_MOON_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENCHANTED_TICKET_HEART_FRAGMENT_COST;
    /**
     * Enable/Disable Nether Tickets
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> NETHER_TICKET;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_TICKET_STAR_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_TICKET_MOON_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_TICKET_HEART_FRAGMENT_COST;
    /**
     * Enable/Disable Ender Tickets
     */
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENDER_TICKET;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENDER_TICKET_STAR_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENDER_TICKET_MOON_COIN_COST;
    public static final ForgeConfigSpec.ConfigValue<Integer> ENDER_TICKET_HEART_FRAGMENT_COST;

    //Tier 1 Banner Settings

    /**
     * The displayed name of the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T1_BANNER_NAME;
    /**
     * The number of Enchanted Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_ENCHANTED_TICKET_COST;
    /**
     * The number of Nether Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_NETHER_TICKET_COST;
    /**
     * The number of Ender Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_ENDER_TICKET_COST;
    /**
     * The list of 3-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T1_COMMON_ITEMS;
    /**
     * The list of 4-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T1_UNCOMMON_ITEMS;
    /**
     * The list of 5-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T1_RARE_ITEMS;
    /**
     * The number of Heart Fragments awarded for pulling a 3-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_COMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 4-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_UNCOMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 5-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T1_RARE_HEART_FRAGMENTS;

    //Tier 2 Banner Settings

    /**
     * The displayed name of the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T2_BANNER_NAME;
    /**
     * The number of Enchanted Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_ENCHANTED_TICKET_COST;
    /**
     * The number of Nether Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_NETHER_TICKET_COST;
    /**
     * The number of Ender Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_ENDER_TICKET_COST;
    /**
     * The list of 3-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T2_COMMON_ITEMS;
    /**
     * The list of 4-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T2_UNCOMMON_ITEMS;
    /**
     * The list of 5-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T2_RARE_ITEMS;
    /**
     * The number of Heart Fragments awarded for pulling a 3-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_COMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 4-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_UNCOMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 5-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T2_RARE_HEART_FRAGMENTS;

    //Tier 3 Banner Settings

    /**
     * The displayed name of the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T3_BANNER_NAME;
    /**
     * The number of Enchanted Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_ENCHANTED_TICKET_COST;
    /**
     * The number of Nether Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_NETHER_TICKET_COST;
    /**
     * The number of Ender Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_ENDER_TICKET_COST;
    /**
     * The list of 3-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T3_COMMON_ITEMS;
    /**
     * The list of 4-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T3_UNCOMMON_ITEMS;
    /**
     * The list of 5-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> T3_RARE_ITEMS;
    /**
     * The number of Heart Fragments awarded for pulling a 3-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_COMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 4-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_UNCOMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 5-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> T3_RARE_HEART_FRAGMENTS;

    static {
        BUILDER.push("Config for Boxel Impact");

        //Currency and Exchanges
        BUILDER.push("Currency and exchanges");
        STAR_TO_MOON_EXCH = BUILDER.comment("Number of Star Coins to exchange for a single Moon Coin").define("Star Coins Per Moon Coin", 16);
        HEART_FRAGMENTS = BUILDER.comment("Enable/Disable Heart Fragments.").define("Heart Fragments On/Off", true);

        //Ticket Settings
        BUILDER.push("Core Ticket Settings");
        ENCHANTED_TICKET = BUILDER.comment("Enable/Disable the Enchanted Ticket.").define("Enchanted Ticket On/Off", true);
        NETHER_TICKET = BUILDER.comment("Enable/Disable the Nether Ticket.").define("Nether Ticket On/Off", true);
        ENDER_TICKET = BUILDER.comment("Enable/Disable the Ender Ticket.").define("Ender Ticket On/Off", true);

        //Enchanted Ticket
        BUILDER.push("Enchanted Ticket Settings");
        ENCHANTED_TICKET_STAR_COIN_COST = BUILDER.comment("Number of Star Coins required to purchase an Enchanted Ticket. Setting to 0 disables buying this ticket with this currency.").define("Star Coins Per Enchanted Ticket", 64);
        ENCHANTED_TICKET_MOON_COIN_COST = BUILDER.comment("Number of Moon Coins required to purchase an Enchanted Ticket. Setting to 0 disables buying this ticket with this currency.").define("Moon Coins Per Enchanted Ticket", 32);
        ENCHANTED_TICKET_HEART_FRAGMENT_COST = BUILDER.comment("Number of Heart Fragments required to purchase an Enchanted Ticket. Setting to 0 disables buying this ticket with this currency.").define("Heart Fragments Per Enchanted Ticket", 0);

        //Nether Ticket
        BUILDER.push("Nether Ticket Settings");
        NETHER_TICKET_STAR_COIN_COST = BUILDER.comment("Number of Star Coins required to purchase a Nether Ticket. Setting to 0 disables buying this ticket with this currency.").define("Star Coins Per Nether Ticket", 64);
        NETHER_TICKET_MOON_COIN_COST = BUILDER.comment("Number of Moon Coins required to purchase a Nether Ticket. Setting to 0 disables buying this ticket with this currency.").define("Moon Coins Per Nether Ticket", 32);
        NETHER_TICKET_HEART_FRAGMENT_COST = BUILDER.comment("Number of Heart Fragments required to purchase a Nether Ticket. Setting to 0 disables buying this ticket with this currency.").define("Heart Fragments Per Nether Ticket", 0);

        //Ender Ticket
        BUILDER.push("Ender Ticket Settings");
        ENDER_TICKET_STAR_COIN_COST = BUILDER.comment("Number of Star Coins required to purchase an Ender Ticket. Setting to 0 disables buying this ticket with this currency.").define("Star Coins Per Ender Ticket", 0);
        ENDER_TICKET_MOON_COIN_COST = BUILDER.comment("Number of Moon Coins required to purchase an Ender Ticket. Setting to 0 disables buying this ticket with this currency.").define("Moon Coins Per Ender Ticket", 0);
        ENDER_TICKET_HEART_FRAGMENT_COST = BUILDER.comment("Number of Heart Fragments required to purchase an Ender Ticket. Setting to 0 disables buying this ticket with this currency.").define("Heart Fragments Per Ender Ticket", 32);

        //Banner Settings
        BUILDER.push("Core Banner Settings");
        BANNER_TIER_1 = BUILDER.comment("Enable/Disable the Tier 1 banner.").define("Tier1 On/Off", true);
        BANNER_TIER_2 = BUILDER.comment("Enable/Disable the Tier 2 banner.").define("Tier2 On/Off", true);
        BANNER_TIER_3 = BUILDER.comment("Enable/Disable the Tier 3 banner.").define("Tier3 On/Off", true);

        //Tier 1 Banner
        BUILDER.push("Tier 1 Banner Settings");
        //Banner name
        T1_BANNER_NAME = BUILDER.comment("Display name of the Tier 1 banner.").define("Banner Name", "Starlight Workshop");
        //Ticket costs
        T1_ENCHANTED_TICKET_COST = BUILDER.comment("Number of Enchanted Tickets required to pull on the Tier 1 banner. Setting the value to 0 disables using Enchanted Tickets for this banner.").define("Ticket Cost", 1);
        T1_NETHER_TICKET_COST = BUILDER.comment("Number of Nether Tickets required to pull on the Tier 1 banner. Setting the value to 0 disables using Nether Tickets for this banner.").define("Ticket Cost", 0);
        T1_ENDER_TICKET_COST = BUILDER.comment("Number of Ender Tickets required to pull on the Tier 1 banner. Setting the value to 0 disables using Ender Tickets for this banner.").define("Ticket Cost", 0);
        //Item config
        T1_COMMON_ITEMS = BUILDER.comment("ItemIDs of 3-star items that can be pulled from the Tier 1 banner, separated by commas.").define("Banner Items", "minecraft:iron_pickaxe, minecraft:iron_axe, minecraft:iron_shovel, minecraft:iron_hoe");
        T1_UNCOMMON_ITEMS = BUILDER.comment("ItemIDs of 4-star items that can be pulled from the Tier 1 banner, separated by commas.").define("Banner Items", "minecraft:gold_pickaxe, minecraft:gold_axe, minecraft:gold_shovel, minecraft:gold_hoe");
        T1_RARE_ITEMS = BUILDER.comment("ItemIDs of 5-star items that can be pulled from the Tier 1 banner, separated by commas.").define("Banner Items", "minecraft:diamond_pickaxe, minecraft:diamond_axe, minecraft:diamond_shovel, minecraft:diamond_hoe");
        //Heart Fragment config
        T1_COMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 3-star item.").define("Heart Fragments", 1);
        T1_UNCOMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 4-star item.").define("Heart Fragments", 2);
        T1_RARE_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 5-star item.").define("Heart Fragments", 3);

        //Tier 2 Banner
        BUILDER.push("Tier 2 Banner Settings");
        //Banner name
        T2_BANNER_NAME = BUILDER.comment("Display name of the Tier 2 banner.").define("Banner Name", "Starlight Armory");
        //Ticket costs
        T2_ENCHANTED_TICKET_COST = BUILDER.comment("Number of Enchanted Tickets required to pull on the Tier 2 banner. Setting the value to 0 disables using Enchanted Tickets for this banner.").define("Ticket Cost", 1);
        T2_NETHER_TICKET_COST = BUILDER.comment("Number of Nether Tickets required to pull on the Tier 2 banner. Setting the value to 0 disables using Nether Tickets for this banner.").define("Ticket Cost", 0);
        T2_ENDER_TICKET_COST = BUILDER.comment("Number of Ender Tickets required to pull on the Tier 2 banner. Setting the value to 0 disables using Ender Tickets for this banner.").define("Ticket Cost", 0);
        //Item config
        T2_COMMON_ITEMS = BUILDER.comment("ItemIDs of 3-star items that can be pulled from the Tier 2 banner, separated by commas.").define("Banner Items", "minecraft:iron_pickaxe, minecraft:iron_axe, minecraft:iron_shovel, minecraft:iron_hoe");
        T2_UNCOMMON_ITEMS = BUILDER.comment("ItemIDs of 4-star items that can be pulled from the Tier 2 banner, separated by commas.").define("Banner Items", "minecraft:gold_pickaxe, minecraft:gold_axe, minecraft:gold_shovel, minecraft:gold_hoe");
        T2_RARE_ITEMS = BUILDER.comment("ItemIDs of 5-star items that can be pulled from the Tier 2 banner, separated by commas.").define("Banner Items", "minecraft:diamond_pickaxe, minecraft:diamond_axe, minecraft:diamond_shovel, minecraft:diamond_hoe");
        //Heart Fragment config
        T2_COMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 3-star item.").define("Heart Fragments", 1);
        T2_UNCOMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 4-star item.").define("Heart Fragments", 2);
        T2_RARE_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 5-star item.").define("Heart Fragments", 3);

        //Tier 3 Banner
        BUILDER.push("Tier 3 Banner Settings");
        //Banner name
        T3_BANNER_NAME = BUILDER.comment("Display name of the Tier 3 banner.").define("Banner Name", "Starlight Workshop");
        //Ticket costs
        T3_ENCHANTED_TICKET_COST = BUILDER.comment("Number of Enchanted Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Enchanted Tickets for this banner.").define("Ticket Cost", 1);
        T3_NETHER_TICKET_COST = BUILDER.comment("Number of Nether Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Nether Tickets for this banner.").define("Ticket Cost", 0);
        T3_ENDER_TICKET_COST = BUILDER.comment("Number of Ender Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Ender Tickets for this banner.").define("Ticket Cost", 0);
        //Item config
        T3_COMMON_ITEMS = BUILDER.comment("ItemIDs of 3-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items", "minecraft:iron_pickaxe, minecraft:iron_axe, minecraft:iron_shovel, minecraft:iron_hoe");
        T3_UNCOMMON_ITEMS = BUILDER.comment("ItemIDs of 4-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items", "minecraft:gold_pickaxe, minecraft:gold_axe, minecraft:gold_shovel, minecraft:gold_hoe");
        T3_RARE_ITEMS = BUILDER.comment("ItemIDs of 5-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items", "minecraft:diamond_pickaxe, minecraft:diamond_axe, minecraft:diamond_shovel, minecraft:diamond_hoe");
        //Heart Fragment config
        T3_COMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 3-star item.").define("Heart Fragments", 1);
        T3_UNCOMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 4-star item.").define("Heart Fragments", 2);
        T3_RARE_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 5-star item.").define("Heart Fragments", 3);

        //Finish building config
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
