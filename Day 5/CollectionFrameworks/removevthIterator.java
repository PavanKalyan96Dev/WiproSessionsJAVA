package com.FrameWorks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removevthIterator {
		public static void main(String args[])
		{
			Set<Integer> s=new LinkedHashSet<>();
			for(int i=1;i<=10;i++)
			{
				s.add(i);
			}
			
			Iterator<Integer> itr=s.iterator();
			while(itr.hasNext())
			{
				Integer i=itr.next();
				if(i%2!=0)
				{
					itr.remove();
				}
				
			}
				
			for(Integer num : s)
			{
				System.out.println(num);	//print even numbers
				//after removing the odd numbers
			}
		
	}
	
	}
