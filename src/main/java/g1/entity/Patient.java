package g1.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Patient {

    private Long id;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private MailingAddress mailingAddress;
    private LocalDate dateOfBirth;

    public Patient() {
    }

    public Patient(Long id, String firstName, String lastName, String contactPhoneNumber, String email, MailingAddress mailingAddress, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public Patient(String firstName, String lastName, String contactPhoneNumber, String email, MailingAddress mailingAddress, LocalDate dateOfBirth) {
        this(null, firstName, lastName, contactPhoneNumber, email, mailingAddress, dateOfBirth);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            return 0;
        }
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(contactPhoneNumber, patient.contactPhoneNumber) && Objects.equals(email, patient.email) && Objects.equals(mailingAddress, patient.mailingAddress) && Objects.equals(dateOfBirth, patient.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, contactPhoneNumber, email, mailingAddress, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", mailingAddress=" + mailingAddress +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
