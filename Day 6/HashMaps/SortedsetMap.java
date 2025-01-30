package com.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedsetMap {

	public static void main(String[] args) {
		SortedMap<Integer,String> map=new TreeMap<>();
		map.put(23,"pavan");
		map.put(12, "prem");
		map.put(11, "hello");
		map.put(2, "namasthey");
		for(Object o:map.entrySet())
		{
			System.out.println(o);
		}

	}
}
/*Based on the key the data is stored
 
 2=namasthey
11=hello
12=prem
23=pavan

 
 */


