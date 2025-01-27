package com.OOPS;

public class MethodOverloading {

	public int add(int x,int y)
	{
		return x+y;
	}
	public int add(int x,int y,int z)
	{
		return x+y+z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Sum of 2 numbers "+obj.add(10, 20));
		System.out.println("Sum of 3 numbers :"+obj.add(10, 20,30));

	}

}
/* 
 * Sum of 2 numbers 30
Sum of 3 numbers :60*/
