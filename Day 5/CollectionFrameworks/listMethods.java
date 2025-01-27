package com.FrameWorks;
import java.util.List;
import java.util.ArrayList;
public class listMethods
{

	public static void main(String args[])
	{
		List p=new ArrayList();
		p.add(100);
		p.add(Boolean.valueOf(false));
		p.add("pavan");
		p.add(null);
		System.out.println(p);
		System.out.println("Size of the list: "+p.size());
		System.out.println("checking the list is empty or not: "+p.isEmpty());
		System.out.println("index based operation: "+p.get(2));
		System.out.println("contains the value in the list: "+p.contains(200));
		System.out.println(p.add(100));
		System.out.println(p.add(800));

System.out.println(p);
System.out.println(p.indexOf(100));	//returns the first occurrence of the element
System.out.println(p.lastIndexOf(100));	//returns the first occurrence of the element
System.out.println("remove the particular element "+p.remove("pavan"));

System.out.println("contains the value in the list: "+p.contains("pavan"));
p.add(0,"kalyan");
System.out.println(p);
p.clear();
System.out.println(p);


		
	}
}
