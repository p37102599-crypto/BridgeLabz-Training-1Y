package PaymentGatewayIntegration;
class UpiPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " processed");
    }

    // Custom refund logic
    @Override
    public void refund(double amount) {
        System.out.println("UPI refund of ₹" + amount + " processed instantly");
    }
}