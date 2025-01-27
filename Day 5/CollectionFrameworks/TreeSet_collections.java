package com.FrameWorks;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet();
		/* 
		s.add(10);
		s.add("pavan");
		s.add(false);
		sadd(10.5;) 
		
		*Sortedset cannot accpept the heterogenous objects
		*/
		s.add(10);
		s.add(-10);
		s.add(97);
		s.add(34);
		s.add(12);
		System.out.println(s);
		
		
	}
}

/* OUTPUT 

[-10, 10, 12, 34, 97]

*/