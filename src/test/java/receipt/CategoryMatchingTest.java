package receipt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CategoryMatchingTest {

    @Test
    public void adds_item_to_receipt_if_is_exempted() {
        CategoryMatching categoryMatching = new CategoryMatching();
        Item item = new Item("book", 1, 10.0);
        Receipt receipt = new Receipt(new ArrayList<>(), 0.0, 0.0);

        categoryMatching.matchCategory(item, receipt);

        assertTrue(receipt.getItems().size() == 1);
        assertTrue(receipt.getItems().get(0) instanceof Item);
    }

    @Test
    public void adds_item_to_receipt_if_non_exempted() {
        CategoryMatching categoryMatching = new CategoryMatching();
        Item item = new Item("perfume", 1, 10.0);
        Receipt receipt = new Receipt(new ArrayList<>(), 0.0, 0.0);

        categoryMatching.matchCategory(item, receipt);

        assertTrue(receipt.getItems().size() == 1);
        assertTrue(receipt.getItems().get(0) instanceof TaxItem);
    }


}