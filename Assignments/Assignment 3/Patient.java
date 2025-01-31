package com.Problem;

public class Patient extends User {
    private String medicalHistory;
    private double balanceDue;

    public Patient(String name, String email, String phoneNumber, String medicalHistory) {
        super(name, email, phoneNumber);
        this.medicalHistory = medicalHistory;
        this.balanceDue = 0.0;
    }

    public void bookAppointment(Doctor doctor) {
        System.out.println(name + " has booked an appointment with Dr. " + doctor.getName());
    }

    public void viewMedicalHistory() {
        System.out.println("Medical History: " + medicalHistory);
    }

    public void makePayment(double amount) {
        balanceDue -= amount;
        System.out.println("Payment of " + amount + " made. Balance due: " + balanceDue);
    }

    @Override
    public void performRoleAction() {
        System.out.println(name + " is viewing medical history and booking appointments.");
    }
}

