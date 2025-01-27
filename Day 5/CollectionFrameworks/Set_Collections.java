package com.FrameWorks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Collections {

	public static void main(String[] args) {
		
		Set S=new LinkedHashSet<>();
		S.add(10);
		S.add(null);
		S.add(9.8);
		S.add("pavan");
		S.add(true);
		System.out.println(S);
		
		//[10, null, 9.8, pavan, true]
		//Insertion order is preserved
		
		

	}

}
