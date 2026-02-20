package Ecommerceplatform;
import java.util.*;

public class MainApp {

    public static void printFinalPrice(List<Product> products) {

        for (Product p : products) {
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 4000));
        products.add(new Groceries(103, "Rice", 2000));

        printFinalPrice(products);
    }
}