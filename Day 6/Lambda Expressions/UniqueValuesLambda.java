package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class UniqueValuesLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(1,4,2,6,4,5,3,2,5,2,1,6);
		numbers.stream().distinct().forEach(x->System.out.println(x));
		System.out.println("limit");
		numbers.stream().limit(3).forEach(x->System.out.println(x));

		System.out.println("skip");
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		num.stream().skip(3).forEach(x->System.out.println(x));
		
		  //reduce()-aggregating elements
	    System.out.println("sum of all numbers by reduce()");
	    
	    int sum = num.stream().reduce(0,(a,b)->a+b);
	    System.out.println("sum:" + sum);

	}
}
/*
1
4
2
6
5
3

limit
1
4
2
*/
