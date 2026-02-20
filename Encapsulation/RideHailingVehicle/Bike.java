package RideHailingVehicle;
class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8; // cheaper rides
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Bike Location: " + location);
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}