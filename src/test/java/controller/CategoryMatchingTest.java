package controller;

import model.Item;
import model.TaxItem;
import org.junit.jupiter.api.Test;

import static controller.CategoryMatching.BOOK;
import static controller.CategoryMatching.PERFUME;
import static org.junit.jupiter.api.Assertions.*;

class CategoryMatchingTest {
    @Test
    public void return_item_if_is_exempted() {
        CategoryMatching categoryMatching = new CategoryMatching();
        Item item = new Item(BOOK, 1, 10);
        assertTrue(categoryMatching.matchCategory(item) != null);
        assertTrue(categoryMatching.matchCategory(item) instanceof Item);
    }

    @Test
    public void return_tax_item_if_non_exempted() {
        CategoryMatching categoryMatching = new CategoryMatching();
        Item item = new Item(PERFUME, 1, 10);
        assertTrue(categoryMatching.matchCategory(item) != null);
        assertTrue(categoryMatching.matchCategory(item) instanceof TaxItem);
    }
}