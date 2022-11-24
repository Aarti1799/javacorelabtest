package com.Question3;

import java.util.Scanner;

public class Member {
	
	Scanner sc = new Scanner(System.in);
	
	String Name, Address;
	int Age;
	double Phoneno, salary;
	
	
	public void details() 
	{
		System.out.println(" Details:");
	   System.out.println("Enter name:");
	    Name = sc.next();
	   System.out.println("Enter Age:");
       Age = sc.nextInt();
	   System.out.println("Enter phone number:");
	    Phoneno=sc.nextDouble(); 
	   System.out.println("Address:");
	    Address= sc.next();
	   
		 System.out.println("Enter Salary:");
	     salary=sc.nextDouble();
	}
	   
	  void printdetails() {
		   System.out.println("Name:-" + Name);
			System.out.println("Age:-" +Age);
			System.out.println("Phone number:-" +Phoneno);
			System.out.println("Address:-" +Address);
			System.out.println("salary:-" +salary);
   
	   }
}
