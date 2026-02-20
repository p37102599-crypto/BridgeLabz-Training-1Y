package RideHailingVehicle;
class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 20; // base charge
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Auto Location: " + location);
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}