package com.LambdaExpression;
import java.util.SortedSet;
import java.util.TreeSet;

public class ApplyLambdaOnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> s=new TreeSet<>();
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		System.out.println(s);
	}
}
// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

