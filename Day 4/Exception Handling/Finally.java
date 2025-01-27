package com.Exceptions;

import java.util.Scanner;

public class Finally
{
	public static void  main(String args[])
	{
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
		finally
		{
			System.out.println("Finall is executed");
		}

	}
}

/* Output

Enter the  numerator
10
Enter the denominator num
29
Division 0.0
Finall is executed

*/