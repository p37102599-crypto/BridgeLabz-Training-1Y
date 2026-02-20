package SensitivedataTagging;
class CustomerCredentials implements SensitiveData {

    String username;
    String password;

    CustomerCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}