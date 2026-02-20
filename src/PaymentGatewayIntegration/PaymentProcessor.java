package PaymentGatewayIntegration;
interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added safely
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed using default logic");
    }
}
