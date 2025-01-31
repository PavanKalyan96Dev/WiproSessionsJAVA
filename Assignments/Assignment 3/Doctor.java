package com.Problem;

public class Doctor extends User {
    private String specialization;
    private String[] appointments;

    public Doctor(String name, String email, String phoneNumber, String specialization) {
        super(name, email, phoneNumber);
        this.specialization = specialization;
        this.appointments = new String[10];
    }

    public void viewAppointments() {
        System.out.println(name + "'s appointments:");
        for (String appointment : appointments) {
            if (appointment != null) {
                System.out.println(appointment);
            }
        }
    }

    public void viewPatientRecord(Patient patient) {
        System.out.println("Viewing medical record for patient: " + patient.name);
    }

    @Override
    public void performRoleAction() {
        System.out.println(name + " is managing daily appointments and patient records.");
    }

    public String getName() {
        return name;
    }
}
