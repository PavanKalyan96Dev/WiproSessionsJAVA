package com.wipro;

public class WithoutConstrucor {
	
	String  name;
	int id;
	public void display()
	{
		name="pavan";
		id=10;
		
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(id);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutConstrucor obj=new WithoutConstrucor();
		obj.display();
		obj.show();

	}

}
