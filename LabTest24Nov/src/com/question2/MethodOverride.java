package com.question2;

public class MethodOverride {
	public static void main(String[] args) {
		Inheritance in= new Inheritance();
		DerivedClass dc = new DerivedClass();
		
		Inheritance ref;
		ref = in;
		ref.display();
		
		DerivedClass ref1;
		ref1=dc;
		ref1.display();
	}

}
