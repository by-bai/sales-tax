package controller;

import model.Item;
import model.TaxItem;

import java.util.*;

public class CategoryMatching {

    private Map<String, String> itemCategoryMap = new HashMap<>();
    private static final String EXEMPT = "exempt";
    private static final String NON_EXEMPT = "non-exempt";

    public static final String BOOK = "book";
    public static final String CHOCOLATE_BAR = "chocolate bar";
    public static final String CHOCOLATES = "chocolates";
    public static final String HEADACHE_PILLS = "headache pills";
    public static final String MUSIC_CD = "music CD";
    public static final String PERFUME = "perfume";

    public CategoryMatching() {

        // books
        itemCategoryMap.put(BOOK, EXEMPT);

        // food
        itemCategoryMap.put(CHOCOLATE_BAR, EXEMPT);
        itemCategoryMap.put(CHOCOLATES, EXEMPT);

        // medical products
        itemCategoryMap.put(HEADACHE_PILLS, EXEMPT);

        // others
        itemCategoryMap.put(MUSIC_CD, NON_EXEMPT);
        itemCategoryMap.put(PERFUME, NON_EXEMPT);
    }


    public Item matchCategory(Item item) {

        String itemName = item.getName();
        boolean isExemptedItem = itemCategoryMap.get(itemName).equals(EXEMPT);
        boolean nonExemptedItem = itemCategoryMap.get(itemName).equals(NON_EXEMPT);

        if (itemCategoryMap.containsKey(itemName)) {
            if (nonExemptedItem) {
                item = new TaxItem(item.getName(), item.getQuantity(), item.getBasePrice());
            } else if (!isExemptedItem) {
                System.out.println("Failed to match category for item: " + item.getName());
            }
        }

        return item;

    }
}