package com.zombieturtle.boxelimpact.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnchantedTicket extends Item {

    private static final String BANNER_NAME_KEY = "gui.boxelimpact.banner_tier1";
    public EnchantedTicket(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return super.use(world, player, hand);
    }
}
