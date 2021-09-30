package controller;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemProcessor {

    public static List<Item> processItems(List<Item> itemList) {
        List<Item> processedItemList = new ArrayList<>();
        CategoryMatching categoryMatching = new CategoryMatching();

        for (int i = 0; i < itemList.size(); i++) {
            Item processedItem = categoryMatching.matchCategory(itemList.get(i));
            processedItemList.add(processedItem);
        }

        return processedItemList;
    }
}
