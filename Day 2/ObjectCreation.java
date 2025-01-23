package com.wipro;

public class ObjectCreation
{

	int RollNum=123;		//Initilization
	String  Name="Pavan";
	public void show()
	{
		System.out.println(RollNum);
		System.out.println(Name);
			
	}
	
	public static void main(String[] args)
	{
		ObjectCreation obj=new ObjectCreation();	//Object Creation
		System.out.println(obj.RollNum);
		System.out.println(obj.Name);
			

		
		
	}

}
