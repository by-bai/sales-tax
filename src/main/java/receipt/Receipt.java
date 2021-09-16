package receipt;
import java.util.*;

public class Receipt {

    private ArrayList<Item> items;
    private double totalCost;
    private double totalSalesTax;

    public Receipt(ArrayList<Item> items, double totalCost, double totalSalesTax) {
        this.items = items;
        this.totalCost = totalCost;
        this.totalSalesTax = totalSalesTax;
    }

    public void addItem (Item item) {
        items.add(item);
        totalCost += item.getItemCost();
        totalSalesTax += item.getTaxAmount();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalSalesTax() {
        return totalSalesTax; 
    }

    public String toString() {
        String output = ""; 
        for (int i = 0; i < items.size(); i++) {
            output += items.get(i) + "\n"; 
        }

        output += "Sales Taxes: " + getTotalSalesTax() + "\n";
        output += "Total: " + getTotalCost();

        return output;
    }
    
}
