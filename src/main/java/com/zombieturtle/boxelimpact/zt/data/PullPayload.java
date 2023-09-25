package com.zombieturtle.boxelimpact.zt.data;

import java.util.ArrayList;
import java.util.Collection;

public class PullPayload {

    /** Collection of ItemContainers that represent the items in the pull. */
    private static ArrayList<ItemContainer> pulls = new ArrayList<>();

    /** The tier of the pull, as an int. */
    private static int tier;

    /**
     * Constructor. Creates a pull payload with the specified tier.
     *
     * @param tier      The tier of the pull, as an int
     */
    public PullPayload(int tier) {
        this.tier = tier;
    }

    /**
     * Adds an item to the pull, by creating an ItemContainer with the specified item, count, and rarity.
     *
     * @param item      The item to add, as an ItemStack
     * @param count     The amount of the item to add
     * @param rarity    The rarity of the item to add
     */
    public void addPull(String item, int count, int rarity) {
        ItemContainer container = new ItemContainer(item, count, rarity);
        pulls.add(container);
    }

    /**
     * Gets the collection of items in the pull.
     * @return  The collection of items in the pull
     */
    public Collection<ItemContainer> getPulls() {
        return pulls;
    }

    /**
     * Gets the number of items in the pull.
     * @return  The number of items in the pull
     */
    public int getPullCount() {
        return pulls.size();
    }

    /**
     * Gets the tier of the pull.
     * @return  The tier of the pulled banner
     */
    public int getPullTier() {
        return tier;
    }


    /** Container class for individual items in a pull.*/
    private static class ItemContainer {

        /** ItemStack of the individual pull item in the container. */
        private String item;
        /** The amount of the item in the container's ItemStack. */
        private int count;
        /** Rarity of the item in the container */
        private int rarity;

        /**
         * Constructor. Creates an item container with the specified item, count, and rarity.
         *
         * @param item      The item to add, as an ItemStack
         * @param count     The amount of the item to add
         * @param rarity    The rarity of the item to add
         */
        public ItemContainer(String item, int count, int rarity) {
            this.item = item;
            this.count = count;
            this.rarity = rarity;
        }

        /**
         * Gets the item in the container.
         * @return  The item in the container
         */
        public String getItem() {
            return this.item;
        }
        /**
         * Gets the count of the item in the container.
         * @return  The count of the item in the container
         */
        public int getCount() {
            return this.count;
        }
        /**
         * Gets the rarity of the item in the container.
         * @return  The rarity of the item in the container
         */
        public int getRarity() {
            return this.rarity;
        }
    }
}
