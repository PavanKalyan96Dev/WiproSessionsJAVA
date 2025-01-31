package com.Problem;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public void showAppointmentDetails() {
        System.out.println(patient.name + " has an appointment with Dr. " + doctor.getName() + " on " + date + " at " + time);
    }
}
