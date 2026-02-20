package com.gla.classesobjects.level1;
public class Item {

    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    // Main method
    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 45.50);

        int quantity = 5;
        item1.displayItemDetails(quantity);
    }
}