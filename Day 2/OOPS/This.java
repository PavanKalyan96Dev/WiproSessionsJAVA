package com.OOPS;
/*For Suppose if the class level variables and the parametes are same then we and compiler will felt confusing
 * to avoid those mistakes we are using the 'this' keyword
 */
public class This 
{
	int stid;
	String name;
	This(int stid,String name)
	{
		this.stid=stid;
		this.name=name;
	}

	public void display()
	{
		System.out.println(stid);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		This obj=new This(12,"pavan");
		obj.display();
	}

}
