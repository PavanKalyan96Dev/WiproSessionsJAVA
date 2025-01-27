package com.Exceptions;
import java.util.Scanner;
//Here the exception is solved with the help of try and catch
public class Try_Catch 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Scanner S=new Scanner(System.in);
			System.out.println("Enter the  numerator");
			int nume=S.nextInt();
			
			System.out.println("Enter the denominator num");
			int deno=S.nextInt();
			
			double division=nume/deno;
			System.out.println("Division "+division);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont enter the numberator as 0");
			
		}
		
	}

}
