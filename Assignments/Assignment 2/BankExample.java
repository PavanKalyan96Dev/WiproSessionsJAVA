package com.OOPS;

public class BankExample {

	private String name;
	private double balance;
	private String AccNumber;
	
	public BankExample(String name, double balance, String accNumber) {
		super();
		this.name = name;
		this.balance = balance;
		AccNumber = accNumber;
	}
	public String getName() {
		return name;
	}

	

	public double getBalance() {
		return balance;
	}

	

	public String getAccNumber() {
		return AccNumber;
	}

	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("successfully deposited "+amount+" and balance is:" +balance);
		}
		else
		{
			System.out.println("Invalid Deposit");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{	
			System.out.println("Successfully drwan"+amount);
			
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankExample obj=new BankExample("pavan",10000,"180658");
		System.out.println(obj.getAccNumber());
		System.out.println(obj.getBalance());
		System.out.println(obj.getName());
		
		obj.deposit(10000);
		System.out.println(obj.getBalance());
		
		
		obj.withdraw(1200);
		System.out.println("final balance is"+obj.getBalance());
	}

}
