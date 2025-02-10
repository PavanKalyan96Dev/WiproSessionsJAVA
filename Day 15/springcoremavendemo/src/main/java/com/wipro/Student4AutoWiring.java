package com.wipro;

public class Student4AutoWiring {
    private Integer stid;
    private String stname;
    private Address address;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Student4AutoWiring()
    {}
    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return stid + " " + stname + " " + address;
    }
}
