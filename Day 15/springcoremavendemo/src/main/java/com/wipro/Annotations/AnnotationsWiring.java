package com.wipro.Annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationsWiring
{
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotations.xml");
		StudentData student=(StudentData)context.getBean("student");
		System.out.println(student);

	}

}
