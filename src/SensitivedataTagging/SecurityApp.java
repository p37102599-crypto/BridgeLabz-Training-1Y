package SensitivedataTagging;
public class SecurityApp {

    public static void main(String[] args) {

        CustomerCredentials creds =
                new CustomerCredentials("user01", "pass@123");

        ProductInfo product =
                new ProductInfo("Laptop", 75000);

        EncryptionService.encrypt(creds);
        EncryptionService.encrypt(product);
    }
}