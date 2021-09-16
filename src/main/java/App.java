import receipt.CategoryMatching;
import receipt.InputReader;
import receipt.Receipt;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CategoryMatching categoryMatching = new CategoryMatching();

        List<Item> items = InputReader.readFile("./data/input1.txt");
        items = Processor.processItems(items); //create taxitems or remain as items. access the map by CategoryMatching.CategoryMap
        Receipt receipt = new Receipt(items);
        receipt.print();
  
    }
}
