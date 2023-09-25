package com.zombieturtle.boxelimpact.init;

import com.zombieturtle.boxelimpact.BoxelImpact;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BoxelImpact.ModID);

    public static final RegistryObject<Item> STAR_COIN = ITEMS.register("star_coin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOON_COIN = ITEMS.register("moon_coin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_FRAGMENT = ITEMS.register("heart_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_TICKET = ITEMS.register("enchanted_ticket", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_TICKET = ITEMS.register("nether_ticket", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDER_TICKET = ITEMS.register("ender_ticket", () -> new Item(new Item.Properties()));

}
