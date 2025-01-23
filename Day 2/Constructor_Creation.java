package com.wipro;

public class Constructor_Creation {

	int num;
	String Name;
	Constructor_Creation()	//Default Constructor
	{
		num=10;
		Name="pavan";
		
	}
	public void display()
	{
		System.out.println(num);
		System.out.println(Name);
	}
	public static void main(String[] args) {
		Constructor_Creation obj=new Constructor_Creation();
		obj.display();

	}

}
