package model;

public class Item {
    private String name;
    private int quantity;
    private double basePrice;
    private double itemCost;

    public Item (String name, int quantity, double basePrice) {
        this.name = name;
        this.quantity = quantity;
        this.basePrice = basePrice;
        this.itemCost = basePrice * quantity;
    }

    public double getBasePrice() {
        return basePrice;
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