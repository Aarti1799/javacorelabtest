/*
 * program: to print diamond pattern
 * @Aouther: aarti
 * @Date: 3 nov 2022
 */

//declaration of package
package question1;

//declaration of class
public class DiamondPattern {
	
	//creating method 
	void printPattern(int n) {
		
		//starting for loop
		//loop for upper diamond
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i;j-- ) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			 
		}
		//for loop for lower diamond
		for (int i=1; i<=n-1; i++)
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			for(int k=(n-i)*2-1; k>=1; k-- ) 
			{
				System.out.print("*");

			}
			System.out.println();

		}//end for loop
		
		
	}//end of method

}//end of class
