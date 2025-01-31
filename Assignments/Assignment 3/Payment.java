package com.Problem;

public class Payment {
    private Patient patient;
    private double amount;

    public Payment(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println(patient.name + " has paid " + amount);
        patient.makePayment(amount);
    }
}
