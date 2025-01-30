package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args)
	{
		
	    List<List<String>> nstList = Arrays.asList(
	    		Arrays.asList("pavan","kalyan"),
	    		Arrays.asList("Prem","nath")
	    		
	    		);
	    System.out.println(nstList.stream().flatMap(x-> x.stream()).collect(Collectors.toList()));
	    
	    
	    
	}
}
/* 
[pavan, kalyan, Prem, nath]
		*/


