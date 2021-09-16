package receipt;
import java.util.*;

public class CategoryMatching {

        private Map<String, String> itemCategoryMap = new HashMap();
        private final static String EXEMPT = "exempt";

        public CategoryMatching() {
            // books
            itemCategoryMap.put("book", EXEMPT);

            // food
            itemCategoryMap.put("chocolate bar", EXEMPT);
            itemCategoryMap.put("chocolates", EXEMPT);

            // medical products
            itemCategoryMap.put("headache pills", EXEMPT);

            // others
            itemCategoryMap.put("music CD", "non");
            itemCategoryMap.put("perfume", "non");
        }

    public void matchCategory(Item item, Receipt receipt) {
            String name = item.getName();
            int qty = item.getQuantity();
            double basePrice = item.getBaseAmount();

        if (itemCategoryMap.containsKey(name)) {
            boolean isExemptedItem = itemCategoryMap.get(name).equals(EXEMPT);
            if (!isExemptedItem) {
                item = new TaxItem(name, qty, basePrice);
            }
            receipt.addItem(item);
        }
    }
}
