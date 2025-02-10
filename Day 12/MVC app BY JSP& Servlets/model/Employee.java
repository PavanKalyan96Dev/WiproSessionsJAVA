package com.wipro.model;



public class Employee {

	

	private int Empid;

	private String name;

	private String department;

	public int getEmpid() {

		return Empid;

	}

	public void setEmpid(int empid) {

		Empid = empid;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getDepartment() {

		return department;

	}

	public void setDepartment(String department) {

		this.department = department;

	}

	public Employee(int empid, String name, String department) {

		super();

		Empid = empid;

		this.name = name;

		this.department = department;

	}

	

	public Employee() {

		

	}



}