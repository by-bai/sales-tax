package receipt;

public class TaxItem extends Item {

    private double taxAmount; 
    private double itemCost;
    private boolean imported;

    public TaxItem (String name, int quantity, double baseAmount) {
        super(name, quantity, baseAmount); 
        double salesTax = (0.10 * baseAmount);
        double salesTaxTotal = salesTax + baseAmount;
        double importTax = (salesTax * 0.5);
        double importTaxTotal = importTax + baseAmount; 

        if (imported) {
            this.taxAmount = importTax; 
            this.itemCost = importTaxTotal * quantity; 
        } else {
            this.taxAmount = salesTax; 
            this.itemCost = salesTaxTotal * quantity;
        }

       
    }
    
    //Have to override methods here, otherwise the value is taken from Item.java 

    @Override 
    public String toString() {
        return super.getQuantity() + " " + super.getName() + ": " + getItemCost(); 
    }

    @Override
    public double getTaxAmount() {
        return taxAmount; 
    }
    @Override 
    public double getItemCost() {
        return itemCost; 
    }
}
