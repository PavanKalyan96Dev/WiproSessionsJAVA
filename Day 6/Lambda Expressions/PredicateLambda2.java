package com.LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateLambda2 {

	public static void main(String[] args) {
		Predicate<Integer> p=x->x%2==0;
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number");
		int number=S.nextInt();
		boolean b=p.test(number);
		if(b==true)
		{
			System.out.println("number "+number+" is a even number");
		}
		else
		{
			System.out.println("number "+number+" is an odd number");
		}
	}

}
