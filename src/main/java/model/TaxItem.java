package model;

public class TaxItem extends Item {
    private double taxPrice;
    private double itemCost;

    public TaxItem (String name, int quantity, double basePrice) {
        super(name, quantity, basePrice);
        double salesTax = (0.10 * basePrice);
        double salesTaxTotal = salesTax + basePrice;
        this.taxPrice = salesTax;
        this.itemCost = salesTaxTotal;
    }

    public double getTaxPrice() {
        return taxPrice;
    }

    @Override
    public String toString() {
        return super.getQuantity() + " " + super.getName() + ": " + getItemCost();
    }

    @Override
    public double getItemCost() {
        return itemCost;
    }
}