import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int characterLimit = 20;

        // Function to calculate string length
        Function<String, Integer> stringLength =
                msg -> msg.length();

        String message = "Hello Functional Interfaces";

        int length = stringLength.apply(message);

        if (length > characterLimit) {
            System.out.println("❌ Message exceeds character limit");
        } else {
            System.out.println("✅ Message is within character limit");
        }

        System.out.println("Message length: " + length);
    }
}