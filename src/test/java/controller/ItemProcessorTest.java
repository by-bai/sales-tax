package controller;

import model.Item;
import model.TaxItem;
import java.util.*;
import org.junit.jupiter.api.Test;

import static controller.CategoryMatching.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemProcessorTest {

    @Test
    public void return_list_of_items_if_exempted() {
        Item item1 = new Item(BOOK, 1, 10);
        Item item2 = new Item(CHOCOLATES, 1, 10);
        Item item3 = new Item(HEADACHE_PILLS, 1, 10);
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        assertEquals(ItemProcessor.processItems(itemList), itemList);
    }

    @Test
    public void return_list_of_tax_items_if_non_exempted() {
        Item item1 = new Item(MUSIC_CD, 1, 10);
        Item item2 = new Item(PERFUME, 1, 10);
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);

        List<Item> results = ItemProcessor.processItems(itemList);

        for (int i = 0; i < results.size(); i++) {
            assertTrue(results.get(i) instanceof TaxItem);
        }

    }
}