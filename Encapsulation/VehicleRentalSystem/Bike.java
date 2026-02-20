package VehicleRentalSystem;
class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; // 5% insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy: " + insurancePolicyNumber);
    }
}