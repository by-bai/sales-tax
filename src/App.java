package src;

import src.receipt.CategoryMatching;
import src.receipt.InputReader;
import src.receipt.Receipt;

import java.util.*;

public class App {
    public static void main(String[] args) {
        CategoryMatching cat = new CategoryMatching(); 
        cat.itemsCategory();
        Receipt receipt = new Receipt(new ArrayList<>(), 0, 0); 
        InputReader.readFile("./data/input1.txt", cat, receipt);
        System.out.println(receipt);
  
    }
}
