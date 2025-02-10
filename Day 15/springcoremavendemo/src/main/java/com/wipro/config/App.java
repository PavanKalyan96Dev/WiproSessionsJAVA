package com.wipro.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cntxt=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=(Student)cntxt.getBean("studentBean");
		System.out.println(student);
	}

}
  