package com.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//Instead of placing the multiple catch block we'll mention the parent class ie.(RUN TIME EXCEPTION) then it will be solved 
public class ParentException
{

		public static void main(String[] args) 
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
			catch(RuntimeException re)
			{
				if(re instanceof ArithmeticException)
				{
					System.out.println("Plz enter the number other than 0");
				}
				else if(re instanceof InputMismatchException)
				{
					System.out.println("please enter numbers only instead of alphabets");
				}
			
			}
		}
}

/* Enter the  numerator
10
Enter the denominator num
0
Plz enter the number other than 0

*/

/* Enter the  numerator
10
Enter the denominator num
abc
please enter numbers only instead of alphabets
*/
