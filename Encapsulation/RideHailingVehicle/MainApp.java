package RideHailingVehicle;
import java.util.*;

public class MainApp {

    // Polymorphic method
    public static void calculateFareForAll(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " +
                    v.calculateFare(distance));
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Amit", 15));
        vehicles.add(new Bike("BIKE202", "Rohit", 10));
        vehicles.add(new Auto("AUTO303", "Suresh", 12));

        calculateFareForAll(vehicles, 8);
    }
}