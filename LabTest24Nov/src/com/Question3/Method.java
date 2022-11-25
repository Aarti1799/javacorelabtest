package com.Question3;



public class Method extends Member{
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		
		e.details1();
		e.details3();
		System.out.println("---------------------------------------");
	
		Manager m= new Manager();
		m.details1();
		m.details2();
		
		System.out.println("---------------------------------------");
		e.printdetails1();
		e.printdetails3();
		
		System.out.println("---------------------------------------");
		m.printdetails1();
		m.printdetails2();
			   
	}

}
