package com.APIassignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEach {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50);
		List<Integer>squares=numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(squares);
		

	}

}
