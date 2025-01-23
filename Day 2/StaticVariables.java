package com.wipro;

public class StaticVariables
{

	int RollNum=123;		//Initilization
	String  Name="Pavan";
	static String ClgName="IIIT";
	public void show()
	{
		System.out.println(RollNum);
		System.out.println(Name);
			
	}
	
	public static void main(String[] args)
	{
		StaticVariables obj=new StaticVariables();	//Object Creation
		System.out.println(obj.RollNum);	//fetch through using the object bcoz those are non static variables
		System.out.println(obj.Name);
		System.out.println(StaticVariables.ClgName);//fetch through using the className bcoz it is the Staic variable
			

		
		
	}

}
