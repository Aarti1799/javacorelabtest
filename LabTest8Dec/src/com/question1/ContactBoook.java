package com.question1;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactBoook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c1 = new Contact("aarti", "arti@gmail.com", 9876543330f);
		Contact c2 = new Contact("mahi", "mahi@gmail.com", 4583211555f);
		Contact c3 = new Contact("aarti", "arti@gmail.com", 9876543330f);
		Contact c4 = new Contact("satish", "satish@gmail.com", 589145287f);
		Contact c5 = new Contact("manan", "manan@gmail.com", 14789523f);

         ArrayList<Contact> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
        al.add(c5);
        
        Iterator<Contact> i = al.iterator();
        while (i.hasNext());
        {
        	Contact c = (Contact)i.next();
        	System.out.println(c.Name+""+c.Email+""+c.PhoneNo);
      
        }
	}

}
