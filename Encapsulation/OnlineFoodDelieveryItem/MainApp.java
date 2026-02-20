package OnlineFoodDelieveryItem;
import java.util.*;

public class MainApp {

    // Polymorphic order processing method
    public static void processOrder(List<FoodItem> items) {

        for (FoodItem item : items) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
                ((Discountable) item).getDiscountDetails();
            }

            double finalAmount = total - discount;

            System.out.println("Total Price: " + total);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Burger", 120, 2));
        order.add(new NonVegItem("Chicken Pizza", 250, 1));

        processOrder(order);
    }
}