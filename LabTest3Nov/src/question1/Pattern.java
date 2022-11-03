/*
 * program: to print diamond pattern
 * @Aouther: aarti
 * @Date: 3 nov 2022
 */


//declaring package
package question1;

import java.util.Scanner;

//declaring class
public class Pattern {
	//main method
	public static void main(String[] args) {
		
		//creating object of DiamondPattern class
		DiamondPattern dp = new DiamondPattern();
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in); 
		//Taking an input of row
		System.out.print("Enter the number of rows:");
		int row = sc.nextInt();
		
		//calling method
		dp.printPattern(row);
	}
	//end of main

}//end of class
