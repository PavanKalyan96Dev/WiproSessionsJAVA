package com.wipro;

public class Types_Of_Constructor 
{
	int age;
	String name;
	Types_Of_Constructor()
	{
		System.out.println("I am Default Constructor");
	}
	Types_Of_Constructor(int x,String y)
	{
		age=x;
		name=y;
		System.out.println("I am Paramterized Constructor");
	}
	public void display()
	{
		System.out.println(age);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		Types_Of_Constructor obj=new Types_Of_Constructor();
		Types_Of_Constructor obj2=new Types_Of_Constructor(22,"pavan");
		obj2.display();
		
		
		
		

	}

}
