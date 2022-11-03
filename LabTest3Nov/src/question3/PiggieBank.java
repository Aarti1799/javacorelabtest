/*
 * program: to addamount in piggiebank
 * @Aouther: aarti
 * @Date: 3 nov 2022
 */

//declaring package
package question3;

//declaring class
public class PiggieBank {
	//main method
	public static void main(String[] args) {
   //creating object of Add amount class
       Addamount a = new Addamount();
       Addamount a1 = new Addamount(30);

    
        	//call method
        	 a.displayamount();
        	a1.displayamount();
	}
	//end of main
}//end of class
