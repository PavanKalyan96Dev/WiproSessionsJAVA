/* 
  1. Banking Application
Scenario: A user logs into a banking system to perform operations like balance inquiry, money transfer, or withdrawing cash.
Menu Options:
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Transfer Money
5.Exit
*/
package com.wipro;
import java.util.Scanner;

public class Assignment_1
{
	public static void main(String[] args)
	{
		
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter the Pin NUmber");
		int PinEntered=S.nextInt();
		int Pin=9876;
		int Balance=10000;
		if(Pin==PinEntered)
		{	boolean exit = false;

	        while (!exit)
	        {
				System.out.println("1.Check Balance"+"\n"
						+ "2 Deposit Money"+"\n"
						+ "3.WithDraw Money"+"\n"
						+ "4.Transfer Money"+"\n"
						+ "5.Exit");
				
				int number=S.nextInt();
				switch(number)
				{
					case 1:
						
						System.out.println("Balance is "+Balance);
						break;
					case 2: 
						System.out.println("Enter the Amount to Deposit");
						int Deposit=S.nextInt();
						Balance=Deposit+Balance;
						System.out.println("Now Balance is "+Balance);
						break;
						
					case 3:
						
						System.out.println("Enter the Money to withdraw");
						int WithDraw=S.nextInt();
						if(WithDraw<=Balance)
						{
							System.out.println("Successfully withdrawn");
							//Balance=Balance-WithDraw;
							System.out.println("New Balance Amt After Deduction :"+(Balance-WithDraw));
						}
						else
						{
							System.out.println("Insufficient Balance");
						}
						break;
					case 4: 
							System.out.println("Enter the amount to Transfer:");
							int TransferAmt=S.nextInt();
							System.out.println("Enter the Beneficiary Acc NUmber");
							long accNumber=S.nextLong();
							if(TransferAmt<Balance)
							{
								System.out.println("Successfully transfered and New Balance is"+(Balance-TransferAmt));
								
							}
							else
							{
								System.out.println("Insufficient Balance");
							}
						break;
					case 5:
						System.out.println("Thank You & Come Again");
						exit=true;
						break;
						
					default:
							System.out.println("Enter a value from 1 to 5 Only");
					
				}
			}
		}
		else
		{
			System.out.println("Wrong Pin Entered..Please Try Again");
		}
	}

}
