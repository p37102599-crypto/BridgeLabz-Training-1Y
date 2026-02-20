package VehicleRentalSystem;
class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber; // sensitive data

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10; // 10% insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy: " + insurancePolicyNumber);
    }
}