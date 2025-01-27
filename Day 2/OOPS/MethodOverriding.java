package com.OOPS;

 class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
}
 class car extends Vehicle
{
	public void start()
	{
		System.out.println("Car is starting");
	}
}
public class MethodOverriding 
{
	public static void main(String args[])
	{
		car obj=new car();
		obj.start();
	}
	
}

/* 
 * Car is starting
 * */
