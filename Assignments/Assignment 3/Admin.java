package com.Problem;

public class Admin extends User {
    private String[] users;

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.users = new String[50];
    }

    public void manageUserData(String action, User user) {
        if (action.equals("add")) {
            System.out.println(user.name + " has been added to the system.");
        } else if (action.equals("remove")) {
            System.out.println(user.name + " has been removed from the system.");
        }
    }

    public void generateReports() {
        System.out.println("Generating system-wide reports...");
    }

    @Override
    public void performRoleAction() {
        System.out.println(name + " is managing users and generating reports.");
    }
}
