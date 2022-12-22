package com.Question3;

import java.util.Scanner;

public class PrimeNumber {
	
	int num;
	
	public static void checkprime() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2!=0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
	public static void main(String[] args) 
	{
		
	checkprime();
	}

	
}
