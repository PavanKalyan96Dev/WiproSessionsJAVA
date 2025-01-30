package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class StreamAPI_FIlter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,4,2,6,4,5);
		numbers.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		//collect
		/* without the foreach we will collect the filter data by using the collect */
		List<Integer> evenNumbers = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);

	}

}
/*
4
2
6
4

*/

