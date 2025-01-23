package com.wipro;

public class if_else 
{
	public static void main(String args[])
	{
		int x=-10;
		if(x>0)
		{
			System.out.println(x + " is postive number");
		}
		else if(x<0)
		{
			System.out.println(x + "is negative number");
		} 
		else if(x==0)
		{
			System.out.println(x +" is zero");
		}
		else
		{
			System.out.println("enter a valid number");
		}
	}

}
