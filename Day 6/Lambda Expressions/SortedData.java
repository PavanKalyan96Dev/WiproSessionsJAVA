package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class SortedData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,4,2,6,4,5);
		numbers.stream().sorted().forEach(x->System.out.println(x));
		
		//sort the data im desc order
		System.out.println("desc");
		numbers.stream().sorted((x,y)->y.compareTo(x)).forEach(x->System.out.println(x));
		

	}

}
/*
1
2
4
4
5
6
desc
6
5
4
4
2
1
*/
