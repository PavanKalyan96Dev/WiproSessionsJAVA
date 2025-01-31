package com.Problem;
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "admin@hospital.com", "9848022338");
        Doctor doctor = new Doctor("Dr. Sanjay", "drsanjay@hospital.com", "9876543210", "Cardio");
        Patient patient = new Patient("Raviteja", "ravitej@patient.com", "8998766789", "Health");

        admin.manageUserData("add", doctor);
        admin.manageUserData("add", patient);

        doctor.viewAppointments();

        patient.bookAppointment(doctor);

        admin.generateReports();

        Payment payment = new Payment(patient, 100.0);
        payment.processPayment();

        doctor.viewPatientRecord(patient);
    }
}

