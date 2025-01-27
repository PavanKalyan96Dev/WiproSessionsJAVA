package com.Exceptions;

import java.util.Scanner;
//for suppose if we enter the mismatched alphabets then it leads to MISMATCHED EXCEPTION
import java.util.InputMismatchException;
public class Multiple_catch {

	public static void main(String[] args) {
		
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
		catch(InputMismatchException f)
		{
			System.out.println("Dont enter the alphabets..Plz enter numbers only");
		}
		
		
	}

}


/* Enter the  numerator
10
Enter the denominator num
0
dont enter the numberator as 0

*/

/* Enter the  numerator
10
Enter the denominator num
abc
Dont enter the alphabets..Plz enter numbers only
*/
