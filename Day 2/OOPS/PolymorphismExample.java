/* Polymorphism Scenario:
You are working on an application for an eCommerce platform. The platform has a feature to calculate discounts 
for various user types (e.g., Regular Customer, Premium Customer, and Employee). 
The discount calculation logic varies based on the user type.
Question:
How would you design a solution using polymorphism to calculate discounts for different user types?
Hint for Answer:
Use a base class Customer with a method calculateDiscount().
Create subclasses RegularCustomer, PremiumCustomer, and Employee that override the calculateDiscount() method.
Use polymorphism to call the appropriate implementation at runtime.*/

package com.OOPS;

class Customer {
 
 public double calculateDiscount(double amount) {
     return 0;
 }
}

class RegularCustomer extends Customer {
 @Override
 public double calculateDiscount(double amount) {
     return amount * 0.05; 
 }
}

class PremiumCustomer extends Customer {
@Override
 public double calculateDiscount(double amount) {
     return amount * 0.20; 
 }
}

class Employee extends Customer {
@Override
 public double calculateDiscount(double amount) {
     return amount * 0.30; 
 }
}


public class PolymorphismExample 
{
 public static void main(String[] args)
 {
     
     Customer regular = new RegularCustomer();
     Customer premium = new PremiumCustomer();
     Customer employee = new Employee();


     double purchaseAmount = 1000;

     System.out.println("total amount he purchased "+purchaseAmount);
     
     System.out.println("Regular cust disc " + regular.calculateDiscount(purchaseAmount)+" & balance he needs to pay is "+(purchaseAmount-regular.calculateDiscount(purchaseAmount)));
     System.out.println("Premium Cust disc " + premium.calculateDiscount(purchaseAmount)+"&  balance he needs to pay is is "+(purchaseAmount-premium.calculateDiscount(purchaseAmount)));
     System.out.println("Employee disc " + employee.calculateDiscount(purchaseAmount)+"& balance amount he needs to pay is "+(purchaseAmount-employee.calculateDiscount(purchaseAmount)));
 }
}
