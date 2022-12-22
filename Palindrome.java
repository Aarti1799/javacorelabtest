package com.Question4;

import java.util.Scanner;

public class Palindrome {
	
	
	public static void checkpalindrome() 
	{
		int num = 0,r,sum = 0,rev, temp;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		temp=num;
		while(num>0) 
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
			
		}
		if(temp==sum) 
		
			System.out.println("Number is palindrome");
		else
		
			System.out.println("Number is not a palindrome ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    checkpalindrome();
	}

}
