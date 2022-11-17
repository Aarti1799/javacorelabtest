package com.Question1;

import java.util.Scanner;

public class StringFunction {
	static String str1;

	static String str2;
	 
	Scanner sc = new Scanner(System.in);
	
	void display() {
		//taking inputs
	System.out.println("-----------taking inputs------------ ");	

	System.out.println("Enter first String: ");	
	String str1 = sc.nextLine();
	System.out.println("Enter Second String: ");	
	String str2 = sc.nextLine();
	
	  //count the length of string----->function1
	System.out.println("--------------Function1--------------- ");
	System.out.println("Lenght of first String is: "+str1.length());
	System.out.println("Lenght of Second String is: "+str2.length());	
    
	   //Concatenation of two string------>function2
	System.out.println("--------------Function2---------------- ");
	System.out.println("After concatenate the strings:"+str1.concat(str2));
   
	   // subtraction of string--------->function3
	System.out.println("--------------Function3---------------- ");
	System.out.println("After subtraction the string:"+str1.substring(0,2));

	   //convert in to upper case the string----->function4
	System.out.println("--------------Function4---------------- ");
	System.out.println("convert into upper case the string:"+str1.toUpperCase());
	System.out.println("convert into upper case the string:"+str2.toUpperCase());
	
	 //check if two string are equals----->function5 
		System.out.println("--------------Function5---------------- ");
		System.out.println("comparison of two string:"+str1.equalsIgnoreCase(str2));
		


	}
	
	// main method
	public static void main(String[] args) 
	{
		StringFunction sf = new StringFunction();
		sf.display();
		
		}
	}


