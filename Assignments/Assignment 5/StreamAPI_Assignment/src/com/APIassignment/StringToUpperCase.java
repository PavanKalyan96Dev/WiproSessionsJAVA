package com.APIassignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("pavan","kalyan");
		List<String>UpperCase=str.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(UpperCase);
		
		

	}

}
