package HospitalPatientManagement;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Amit", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Riya", 30, 800);

        ((MedicalRecord)p1).addRecord("Pneumonia");
        ((MedicalRecord)p2).addRecord("Fever");

        patients.add(p1);
        patients.add(p2);

        // Polymorphism
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            ((MedicalRecord)p).viewRecords();
            System.out.println("----------------------");
        }
    }
}