package com.LambdaExpression;
import java.util.function.Predicate;
public class PredicateLambda {
	public static void main(String[] args) {
	
		Predicate<Integer> p=x->x%2==0;
		System.out.println(p.test(27));	//false

	}

}
