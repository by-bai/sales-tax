package model;

import java.util.List;

public class Receipt {

    private List<Item> itemList;
    private double totalCost;
    private double totalSalesTax;

    public Receipt(List<Item> itemList) {
        this.itemList = itemList;

        for (int i = 0; i < itemList.size(); i++) {
            Item itemInstance = itemList.get(i);
            this.totalCost += itemInstance.getItemCost();
            if (itemInstance instanceof TaxItem) {
                TaxItem taxItem = (TaxItem) itemInstance;
                totalSalesTax += taxItem.getTaxPrice();
            }
        }
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalSalesTax() {
        return totalSalesTax;
    }

    public void print() {
        String output = "";
        for (int i = 0; i < itemList.size(); i++) {
            output += itemList.get(i) + "\n";
        }

        output += "Sales Taxes: " + getTotalSalesTax() + "\n";
        output += "Total: " + getTotalCost();

        System.out.println(output);
    }

}