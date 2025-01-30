package com.LambdaExpression;

import java.util.TreeSet;

class Student {
    private int stid;
    private String stname;

    // Constructor
    public Student(int stid, String stname) {
        this.stid = stid;
        this.stname = stname;
    }

    // Getters
    public int getStid() {
        return stid;
    }

    public String getStname() {
        return stname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                '}';
    }
}
