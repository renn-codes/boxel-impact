package com.zombieturtle.boxelimpact.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Tier3Cfg {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    /**
     * The displayed name of the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> BANNER_NAME;
    /**
     * The number of Enchanted Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> ENCHANTED_TICKET_COST;
    /**
     * The number of Nether Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_TICKET_COST;
    /**
     * The number of Ender Tickets required to pull on the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> ENDER_TICKET_COST;
    /**
     * The number of items pulled from the banner per pull
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> ITEMS_PER_PULL;
    /**
     * The list of 3-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> COMMON_ITEMS;
    /**
     * The list of 4-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> UNCOMMON_ITEMS;
    /**
     * The list of 5-star items that can be pulled from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<String> RARE_ITEMS;
    /**
     * The chance of pulling a 3-star item from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Double> COMMON_CHANCE;
    /**
     * The chance of pulling a 4-star item from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Double> UNCOMMON_CHANCE;
    /**
     * The chance of pulling a 5-star item from the banner
     */
    public static final ForgeConfigSpec.ConfigValue<Double> RARE_CHANCE;
    /**
     * The number of Heart Fragments awarded for pulling a 3-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> COMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 4-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> UNCOMMON_HEART_FRAGMENTS;
    /**
     * The number of Heart Fragments awarded for pulling a 5-star item
     */
    public static final ForgeConfigSpec.ConfigValue<Integer> RARE_HEART_FRAGMENTS;

    static {
        BUILDER.push("Config for Tier 3 Banner");
        //Banner name
        BANNER_NAME = BUILDER.comment("Display name of the Tier 3 banner.").define("Banner Name", "Starlight Workshop");
        //Ticket costs
        ENCHANTED_TICKET_COST = BUILDER.comment("Number of Enchanted Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Enchanted Tickets for this banner.").define("Ticket Cost", 1);
        NETHER_TICKET_COST = BUILDER.comment("Number of Nether Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Nether Tickets for this banner.").define("Ticket Cost", 0);
        ENDER_TICKET_COST = BUILDER.comment("Number of Ender Tickets required to pull on the Tier 3 banner. Setting the value to 0 disables using Ender Tickets for this banner.").define("Ticket Cost", 0);
        //Item config
        COMMON_ITEMS = BUILDER.comment("ItemIDs of 3-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items", "minecraft:iron_pickaxe,minecraft:iron_axe,minecraft:iron_shovel,minecraft:iron_hoe");
        UNCOMMON_ITEMS = BUILDER.comment("ItemIDs of 4-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items","minecraft:gold_pickaxe,minecraft:gold_axe,minecraft:gold_shovel,minecraft:gold_hoe");
        RARE_ITEMS = BUILDER.comment("ItemIDs of 5-star items that can be pulled from the Tier 3 banner, separated by commas.").define("Banner Items", "minecraft:diamond_pickaxe,minecraft:diamond_axe,minecraft:diamond_shovel,minecraft:diamond_hoe");
        //Probability config
        ITEMS_PER_PULL = BUILDER.comment("Number of items pulled from the Tier 3 banner per pull. Must be an integer between 1 and 5.").define("Items per Pull", 1);
        COMMON_CHANCE = BUILDER.comment("Probability of pulling a 3-star item from the Tier 3 banner.Must be a decimal value between 0 and 1.").define("Common Weight", 0.9);
        UNCOMMON_CHANCE = BUILDER.comment("Probability of pulling a 4-star item from the Tier 3 banner.Must be a decimal value between 0 and 1.").define("Uncommon Weight", 0.4);
        RARE_CHANCE = BUILDER.comment("Probability of pulling a 5-star item from the Tier 3 banner.Must be a decimal value between 0 and 1.").define("Rare Weight", 0.2);
        //Heart Fragment config
        COMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 3-star item.").define("Heart Fragments", 1);
        UNCOMMON_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 4-star item.").define("Heart Fragments", 2);
        RARE_HEART_FRAGMENTS = BUILDER.comment("Number of Heart Fragments awarded for pulling a 5-star item.").define("Heart Fragments", 3);
        //Finish building config
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
