package RideHailingVehicle;
class Car extends Vehicle implements GPS {

    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // standard rate
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Car Location: " + location);
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}