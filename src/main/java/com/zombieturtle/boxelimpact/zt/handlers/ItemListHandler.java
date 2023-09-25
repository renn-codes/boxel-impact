package com.zombieturtle.boxelimpact.zt.handlers;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfig;
import org.apache.commons.math3.distribution.EnumeratedDistribution;
import org.apache.commons.math3.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ItemListHandler {
    public final int tier;
    private final int pullAmt;
    private final ArrayList<Pair<Pair<String, Integer>, Double>> itemWeights = Lists.newArrayList();
    private final int COMMON = 1;
    private final int UNCOMMON = 2;
    private final int RARE = 3;

    private interface ItemLists {

    }

    /**
     * Creates an ItemListHandler for the specified banner tier, using the passed parameters to build the internal (item/rarity)/weight pairs.
     *
     * @param tier  The banner tier to assign the ItemListHandler, as an Integer
     * @param pullAmt   The number of samples to pull from the list, as an Integer
     * @param commonItemArray   String array of common items
     * @param commonWeight  Weight for common item sample, as a Double
     * @param uncommonItemArray String array of uncommon items
     * @param uncommonWeight    Weight for uncommon item sample, as a Double
     * @param rareItemArray String array of rare items
     * @param rareWeight    Weight for rare item sample, as a Double
     */
    public ItemListHandler(int tier, int pullAmt, String commonItemArray, double commonWeight, String uncommonItemArray, double uncommonWeight, String rareItemArray, double rareWeight) {
        for(String i: commonItemArray.split(",")) {
            Pair<String, Integer> p = new Pair<>(i, COMMON);
            itemWeights.add(new Pair(p, commonWeight));
        }
        for(String i: uncommonItemArray.split(",")) {
            Pair<String, Integer> p = new Pair<>(i, UNCOMMON);
            itemWeights.add(new Pair(p, uncommonWeight));
        }
        for(String i: rareItemArray.split(",")) {
            Pair<String, Integer> p = new Pair<>(i, RARE);
            itemWeights.add(new Pair(p, rareWeight));
        }
        this.tier = tier;
        this.pullAmt = pullAmt;
    }

    /**
     * Pulls a number of items from the internal list, based on the pullAmt parameter.
     * @return  An ArrayList of Pairs, where the first element is the item name, and the second element is the item rarity
     */
    public ArrayList<Pair<String, Integer>> pullMultiItems() {
        ArrayList<Pair<String, Integer>> selectedItems = new ArrayList();
        for (int i = 0; i < pullAmt; i++)
        {
            Pair<String, Integer> selectedItem = new EnumeratedDistribution<>(itemWeights).sample();
            selectedItems.add(selectedItem);
        }
        return selectedItems;
    }

    /**
     * Pulls a single item from the internal list.
     * @return  An ArrayList of Pairs, where the first element is the item name, and the second element is the item rarity
     */
    public ArrayList<Pair<String, Integer>> pullSingleItem() {
        ArrayList<Pair<String, Integer>> selectedItems = new ArrayList();
        Pair<String, Integer> selectedItem = new EnumeratedDistribution<>(itemWeights).sample();
        selectedItems.add(selectedItem);
        return selectedItems;
    }
}
