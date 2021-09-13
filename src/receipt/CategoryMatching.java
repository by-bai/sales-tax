package src.receipt;
import java.util.*;

public class CategoryMatching {

        public CategoryMatching() {

        }
    
        private Map<String, String> itemCategory = new HashMap<>();

        public void itemsCategory(){
            String exempt = "exempt";

            // books
            itemCategory.put("book", exempt); 
        
            // food
            itemCategory.put("chocolate bar", exempt); 
            itemCategory.put("chocolates", exempt); 

            // medical products
            itemCategory.put("headache pills", exempt); 

            // others
            itemCategory.put("music CD", "non"); 
            itemCategory.put("perfume", "non"); 

         }
    public void MatchCategory(String name, int qty, double basePrice, Receipt receipt) {

        if (itemCategory.containsKey(name)) {
            if (itemCategory.get(name) == "exempt") {
                Item item = new Item(name, qty, basePrice); 
                receipt.addItem(item); 
            } else {
                TaxItem taxItem = new TaxItem(name, qty, basePrice); 
                receipt.addItem(taxItem);
            }
        }
        
    }
}
