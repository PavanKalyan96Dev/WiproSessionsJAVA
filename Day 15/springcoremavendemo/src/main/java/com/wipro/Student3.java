package com.wipro;

import java.util.List;

public class Student3
{
	private Integer stid;
	private String stname;
	private List<Address> address;
	
	public Student3(Integer stid, String stname, List<Address> address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}

	public Student3()
	{
		
	}

	@Override
	public String toString()
	{
		return stid + " "+stname+" "+address;
	}

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
