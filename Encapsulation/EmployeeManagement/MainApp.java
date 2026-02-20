package EmployeeManagement;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Riya", 500, 40);

        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism
        for (Employee e : employees) {
            e.displayDetails();
            ((Department)e).getDepartmentDetails();
            System.out.println("------------");
        }
    }
}