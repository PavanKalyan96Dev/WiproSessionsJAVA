package com.LambdaExpression;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> s=new TreeSet<>((x,y) -> y.compareTo(x));
		for(int i=1;i<=10;i++)
		{
			s.add(i);
		}
		System.out.println(s);
	}
}
// [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

