package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class mapInterfacce 
{

	public static void main(String[] args)
	{
	
		Map map=new HashMap();
		map.put(100, "pavan");
		map.put("pk",200);
		map.put(null, null);
		
		for(Object o:map.entrySet())
		{
			System.out.println(o);
			
		}

	}

}
/* Order is not preserved

null=null
100=pavan
pk=200

*/