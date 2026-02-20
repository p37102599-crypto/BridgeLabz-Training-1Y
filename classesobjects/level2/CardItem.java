package com.gla.classesobjects.level2;
class CartItem {

    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    // Method to add item to the cart
    public void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " item(s) added to cart.");
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Method to remove item from the cart
    public void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Invalid quantity to remove!");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity in Cart: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    // Main method
    public static void main(String[] args) {

        CartItem item = new CartItem("Book", 250.0);

        item.addItem(3);
        item.removeItem(1);
        item.displayTotalCost();
    }
}