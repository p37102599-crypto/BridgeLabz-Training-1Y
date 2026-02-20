package VehicleRentalSystem;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 3000, "CAR-INS-111"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-222"));
        vehicles.add(new Truck("TRK303", 5000, "TRK-INS-333"));

        int days = 5;

        for (Vehicle v : vehicles) {

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                System.out.println("Insurance Cost: " +
                        ((Insurable) v).calculateInsurance());
                ((Insurable) v).getInsuranceDetails();
            }

            System.out.println("-----------------------");
        }
    }
}