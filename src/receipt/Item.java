package src.receipt;

public class Item {
    private String name;
    private int quantity; 
    private double baseAmount;
    private double taxAmount; 
    private double itemCost; 

    public Item (String name, int quantity, double baseAmount) {
        this.name = name;
        this.quantity = quantity;
        this.baseAmount = baseAmount; // same as cost 
        this.itemCost = baseAmount * quantity; 
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public double getTaxAmount() {
        return taxAmount; 
    }

    public double getItemCost() {
        return itemCost; 
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name; 
    }

    public String toString() {
        return getQuantity() + " " + getName() + ": " + getItemCost(); 
    }
}
