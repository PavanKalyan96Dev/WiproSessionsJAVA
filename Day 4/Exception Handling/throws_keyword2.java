package com.Exceptions;

public class throws_keyword2 
{
	public static void main(String args[])
	{
		throws_keyword obj=new throws_keyword();
		try{
			obj.display();
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont enter 0 in the denominator");
		}
		
	}
}

/* 
 * dont enter 0 in the denominator*/
