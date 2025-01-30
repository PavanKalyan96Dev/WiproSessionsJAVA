package com.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class MapTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("pavan","prem","madhu","mohan");
		names.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));;

	}

}
/* 
PAVAN
PREM
MADHU
MOHAN
*/

