package com.FrameWorks;

import java.util.SortedSet;
import java.util.TreeSet;

public class Methods_In_SortedSet 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet();
		s.add(10);
		s.add(-10);
		s.add(97);
		s.add(34);
		s.add(12);
		System.out.println("sorted elements are:"+s); // sorted elements are:[-10, 10, 12, 34, 97]
		//automatically the elements are sorted
		System.out.println(s.first());	// -10 
		System.out.println(s.last());	//-97
		System.out.println(s.headSet(34));	//returns the elements less than 34 : [-10, 10, 12]
		
		System.out.println(s.tailSet(34));	//returns the elements thar are >=34 :[34, 97]
		
		System.out.println(s.subSet(12,97));	//returns the elements from 12 to 97,97 is excluded: [12, 34]
}
}
