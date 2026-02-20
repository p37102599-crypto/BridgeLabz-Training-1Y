package PaymentGatewayIntegration;
public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor card = new CreditCardPayment();
        PaymentProcessor upi = new UpiPayment();

        card.processPayment(2000);
        card.refund(500);   // uses default method

        upi.processPayment(1000);
        upi.refund(300);    // overridden method
    }
}