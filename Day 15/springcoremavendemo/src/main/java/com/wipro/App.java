package com.wipro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("listOfAddress.xml");
		Student3 student=(Student3)context.getBean("student");
		System.out.println(student);

	}

}
