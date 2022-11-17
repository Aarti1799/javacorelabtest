package com.question4;

import java.util.Scanner;



public class Calculator {
	void add(float n1, float n2) {
		float result = n1+n2;
		System.out.println("The result is:" +result);
	}
	
	void sub(float n1, float n2) {
		float sub = n1+n2;
		System.out.println("The result is:" +sub);
	}
	
	 void mul(float n1, float n2) {
		float mul = n1*n2;
		System.out.println("The result is:" +mul);
	}
	
	 void div(float n1, float n2) {
		float div = n1/n2;
		System.out.println("The result is:" +div);
	}

			
		 

	public static void main(String[] args) {
					
			int choice = 0;
			do	
			{
				try {
				 
						 System.out.println("1. Addition");
							System.out.println("2. Subtraction");
							System.out.println("3. multiplication");
							System.out.println("4. Division");
							Calculator ct = new Calculator();
							Scanner sc = new Scanner(System.in);
							
							float num1, num2;
							
							
							System.out.println("Enter two numbers:");
							num1 = sc.nextFloat();
							num2 = sc.nextFloat();
					
				System.out.println("Enter your choce:");
				choice = sc.nextInt();
				
				if(num1>0 && num2>0)
					
			switch (choice) 
			 {
			case 1: ct.add(num1,num2);
			        
			        	   break;
			case 2: ct.sub(num1,num2);
		           break;
			case 3: ct.mul(num1,num2);
		            break;
			case 4: ct.div(num1,num2);
		            break;
			 default: System.out.println("wrong input");;
			
			 }
				else 
					System.out.println("you cannot perform");
			  
			System.out.println("Do you want to perform more (1-yes/0-no)");
		     choice =sc.nextInt();
			}
				catch(Exception ex) 
				{
			      System.out.println("wrong input try again");
				}
		
			}	while(choice !=4);
			
		}

	
}	

