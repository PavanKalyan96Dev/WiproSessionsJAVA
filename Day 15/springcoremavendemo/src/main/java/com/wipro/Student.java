package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student
{
	@Value("10")
	private Integer stid;
	@Value("kalyan")
	private String stname;
	@Autowired
	private Address address;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
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
	public Student(Integer stid, String stname, Address address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}
	public Student()
	{
		
	}
	@Override
	public String toString()
	{
		return stid + " "+stname+" "+address;
	}
	
	
	
	
	

}
