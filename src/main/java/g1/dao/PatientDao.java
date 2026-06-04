package g1.dao;

import g1.entity.MailingAddress;
import g1.entity.Patient;

import java.time.LocalDate;

public class PatientDao {

    private static final PatientDao INSTANCE = new PatientDao();

    private final Patient[] patients;

    private PatientDao() {
        patients = new Patient[]{
                new Patient(
                        1L,
                        "John",
                        "Smith",
                        "555-111-2222",
                        "john.smith@example.com",
                        new MailingAddress("10 Main St", null, "Austin", "TX", "73301", "USA"),
                        LocalDate.of(2000, 4, 12)
                ),

                new Patient(
                        2L,
                        "Maria",
                        "Garcia",
                        "555-333-4444",
                        "maria.garcia@example.com",
                        new MailingAddress("42 Oak Ave", "Apt 3B", "Houston", "TX", "77001", "USA"),
                        LocalDate.of(1995, 9, 30)
                )
        };
    }

    public static PatientDao getInstance() {
        return INSTANCE;
    }

    public Patient[] getPatient() {
        return patients.clone();
    }
}
