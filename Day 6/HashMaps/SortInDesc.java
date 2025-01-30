package com.HashMap;

import java.util.SortedMap;
import java.util.TreeMap;

import com.FrameWorks.Student;

public class SortInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SortedMap<Integer, String> map = new TreeMap<>(new MyComparator());
	        map.put(23, "pavan");
	        map.put(12, "prem");
	        map.put(11, "hello");
	        map.put(2, "namasthey");

	        // Print sorted data in descending order
	        for (Object o : map.entrySet()) {
	            System.out.println(o);
	        }
		

	}

}
