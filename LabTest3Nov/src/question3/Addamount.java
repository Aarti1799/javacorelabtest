/*
 * program: to addamount in piggiebank
 * @Aouther: aarti
 * @Date: 3 nov 2022
 */

//declaring package
package question3;

//Declaration of class
public class Addamount {
	
	//taking initial amount
	private int amount=50;
	
	//creating constructor with parameter
	public Addamount(int a) {
		amount=amount+ a;//calculation for tatal amount

	}
	//default constructor
	public Addamount() 
	{
		
	}

	

	//method for display amount
	public void displayamount() {
		System.out.println(amount);
		System.out.println("total amount is:"+amount);
		
	}

}
