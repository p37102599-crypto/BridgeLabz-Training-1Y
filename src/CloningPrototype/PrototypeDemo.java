package CloningPrototype;
public class PrototypeDemo {

    public static void main(String[] args) {

        try {
            // Original object (prototype)
            Product original = new Product(101, "Laptop", 75000);

            // Cloned object
            Product copy = (Product) original.clone();

            System.out.println("Original Product:");
            original.display();

            System.out.println("Cloned Product:");
            copy.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}