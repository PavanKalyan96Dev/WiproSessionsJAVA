package com.LambdaExpression;

import java.util.TreeSet;

import com.FrameWorks.Student;

public class SortNameInAsc {

	public static void main(String[] args) {
		// TODO Auto-geneStudentethod stub
		TreeSet<Student> ts=new TreeSet<>(
				(x,y)->x.getStname().compareTo(y.getStname()));				
		ts.add(new Student(1,"pavan"));
		ts.add(new Student(3,"kalyan"));
		ts.add(new Student(2,"prem"));
		ts.add(new Student(4,"srinu"));
		System.out.println(ts);
			

	}

}
