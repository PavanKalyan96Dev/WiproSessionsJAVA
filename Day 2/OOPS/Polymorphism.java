package com.OOPS;

public class Polymorphism 
{

	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public static void main(String args[])
	{
		Polymorphism obj=new Polymorphism();
		obj.sum(2, 4);
		obj.sum(2, 4,6);
	}
}
