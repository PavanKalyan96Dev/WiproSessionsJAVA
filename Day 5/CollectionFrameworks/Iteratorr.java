package com.FrameWorks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iteratorr {

		
		public static void main(String args[])
		{
			Set s=new LinkedHashSet<>();
			for(int i=1;i<=10;i++)
			{
				s.add(i);
			}
			
			Iterator itr=s.iterator();//with the help of iterator 
			//we r travelling from start to end
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
	}
	
	}
