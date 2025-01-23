package com.wipro;

public class Parametrized_Constructor
{
	int age;
	String Name;
	Parametrized_Constructor(int x,String y)
	
	{
			age=x;
			Name=y;
	}
	public void display()
	{
		System.out.println(age);
		System.out.println(Name);
	}

	public static void main(String[] args)
	{
		
		Parametrized_Constructor obj=new Parametrized_Constructor(23,"pavan");
		obj.display();

	}

}
