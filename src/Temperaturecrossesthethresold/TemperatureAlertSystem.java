package Temperaturecrossesthethresold;
import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 40.0;

        // Predicate to check if temperature exceeds threshold
        Predicate<Double> highTemperatureAlert =
                temp -> temp > threshold;

        double currentTemperature = 45.5;

        if (highTemperatureAlert.test(currentTemperature)) {
            System.out.println("⚠️ Alert! Temperature is too high: " + currentTemperature);
        } else {
            System.out.println("Temperature is normal: " + currentTemperature);
        }
    }
}