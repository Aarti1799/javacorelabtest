package com.Question3;

public class Manager extends Member{

	String dept,specialization;
	String Name, Address;
	int Age;
	double Phoneno, salary;
	public void details() 
	{
	
		   System.out.println("Enter department:");
		    dept = sc.nextLine();
		   System.out.println("Enter Specialization:");
		    specialization = sc.nextLine();

	}
	void printdetails() {
		/*System.out.println("Name:-" + Name);
		System.out.println("Age:-" +Age);
		System.out.println("Phone number:-" +Phoneno);
		System.out.println("Address:-" +Address);
		System.out.println("salary:-" +salary);*/
		System.out.println("Department:-" +dept);
		System.out.println("SpecialiZation:-" +specialization);

	}
}
