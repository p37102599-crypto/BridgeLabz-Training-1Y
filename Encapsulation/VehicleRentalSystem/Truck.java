package VehicleRentalSystem;
class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 2000; // extra loading charge
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15; // 15% insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy: " + insurancePolicyNumber);
    }
}