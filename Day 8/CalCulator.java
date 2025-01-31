package com.Junit;

public class CalCulator 
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int a,int b)
	{
		return a-b;
		
	}
	public int divide(int a,int b)
	{
		if(b==0) throw new ArithmeticException("cannot divide by zero");
		return a/b;
	}

}
