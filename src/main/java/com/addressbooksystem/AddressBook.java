package com.addressbooksystem;

import java.util.ArrayList;

public class AddressBook {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Address Book program");
		
	}

 class Contact {
		String first,last,address,String,city,state,zip,phno,email;
		ArrayList <Contact> c=new ArrayList<Contact>();
		public Contact(String first,String last,String address,String city,String state,String zip,String phno,String email)
		{
			this.first=first;
			this.last=last;
			this.address=address;
			this.city=city;
			this.state=state;
			this.zip=zip;
			this.phno=phno;
			this.email=email;
		}
	}

}