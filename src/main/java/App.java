import java.io.FileNotFoundException;
import java.util.List;

import controller.InputReader;
import controller.ItemProcessor;
import model.Item;
import model.Receipt;

public class App {

    public static void main(String[] args) {
        try {
            List<Item> items = InputReader.readFile("./data/input1.txt");
            items = ItemProcessor.processItems(items);
            Receipt receipt = new Receipt(items);
            receipt.print();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }

    }
}