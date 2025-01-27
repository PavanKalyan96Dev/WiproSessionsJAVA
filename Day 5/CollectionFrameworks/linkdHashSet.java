package com.FrameWorks;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkdHashSet
{

	public static void main(String args[])
	{
		Set<Integer> s=new LinkedHashSet<>();
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		System.out.println(s);	//print  1 to 10
		
	
	for(Object o:s)
	{
		//COnvert object type (parent type) to integer
		//type(child type) is called downcasting
		
		Integer i=(Integer)o;
		if(i%2==0)
		{
			System.out.println(i);//print even numbers
		}
	}
}
}
