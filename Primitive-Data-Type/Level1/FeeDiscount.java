import java.util.*;
public class FeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountpercent = 10;
        double discount = fee * discountpercent/100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
