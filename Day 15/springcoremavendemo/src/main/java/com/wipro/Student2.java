package com.wipro;

import java.util.List;

public class Student2 
{
	private Integer stid;
	private String stname;
	private List<String> address;
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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student2(Integer stid, String stname, List<String> address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}
	public Student2()
	{
		
	}
	@Override
	public String toString()
	{
		
		return stid+" "+stname+" "+address;//where address is list of string
	}
	
	

}
