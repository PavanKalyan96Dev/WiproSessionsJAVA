package AccessModifiers;

import AccessModifiers.Protected_Access_Modifier;
public class Protect extends Protected_Access_Modifier 	//other packages child can be access independetn cannot access
{
	
		public static void main(String args[])
		{
			Protected_Access_Modifier obj=new Protected_Access_Modifier();
			System.out.println(obj.x);	//100
		}
	}


