package com.FrameWorks;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add(10);
		s.add(true);
		s.add(null);
		s.add(5.6f);
		s.add(566);
		System.out.println(s);
		
		//[10, null, 9.8, pavan, true] 
		//HashSet insertion order is not preserved

	}

}
