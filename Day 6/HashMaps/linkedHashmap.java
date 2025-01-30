package com.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashmap {

	public static void main(String[] args) {
		

		Map map=new LinkedHashMap();
		map.put(100, "pavan");
		map.put("pk",200);
		map.put(null, null);
		
		for(Object o:map.entrySet())
		{
			System.out.println(o);
			
		}

	}

}
/* 
 100=pavan
pk=200
null=null

*/

//order is preserved