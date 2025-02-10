package com.APIassignment;

import java.util.Arrays;
import java.util.List;

public class CountNumbers 
{

	public static void main(String args[])
	{
		List<Integer> numbers=Arrays.asList(1,4,2,5,4,6,3,7,55,33,22,6,1);
		long count = numbers.stream().filter(n -> n > 10) .count(); 
		System.out.println(count);
	}
}

