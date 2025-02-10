package com.wipro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AutoWiringAPP3
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringByType.xml");
		Student4AutoWiring student=(Student4AutoWiring)context.getBean("student");
		System.out.println(student);

	}

}
