package com.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmmap {

	public static void main(String[] args) {
		Map<Integer,String>map=new LinkedHashMap<>();
		map.put(1, "pk");
		map.put(-10,"rk");
		map.put(34, "prem");
		map.put(3, "srinu");
		for(Object o:map.entrySet())
		{
			System.out.println(o);
		}
			

	}

}

/* 
 1=pk
-10=rk
34=prem
3=srinu
*/
