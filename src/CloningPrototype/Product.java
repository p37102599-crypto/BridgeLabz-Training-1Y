package CloningPrototype;
class Product implements Cloneable {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    void display() {
        System.out.println(productId + " " + productName + " " + price);
    }
}