package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("pavan","prem","madhu","mohan");
		
		//creating the stream to the collections
		Stream<String> nameStream=names.stream();
		nameStream.forEach(x->System.out.println(x));
	}

}

/*
 pavan
 prem
 madhu
 mohan
 
 */
