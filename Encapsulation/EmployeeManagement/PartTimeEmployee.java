package EmployeeManagement;
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;

    public PartTimeEmployee(int id, String name, double ratePerHour, int hoursWorked) {
        super(id, name, ratePerHour);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * hoursWorked; // hourly calculation
    }

    @Override
    public void assignDepartment(String deptName) {
        department = deptName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}