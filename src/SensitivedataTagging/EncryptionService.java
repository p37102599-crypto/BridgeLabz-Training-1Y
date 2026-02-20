package SensitivedataTagging;
class EncryptionService {

    static void encrypt(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("🔒 Sensitive data detected – encrypting...");
            // Encryption logic here
        } else {
            System.out.println("ℹ️ Data not marked as sensitive – no encryption needed");
        }
    }
}