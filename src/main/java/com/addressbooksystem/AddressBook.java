package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	private ArrayList<Contact> addressBook=new ArrayList<Contact>();
    
    public void setAddressBook(ArrayList<Contact> obj)
    {
   	 addressBook=obj;
    }
    public ArrayList<Contact> getAddressBook()
    {
   	 return addressBook;
    }
    
    public void editByName(String firstName,String lastName)
    {
   	 Contact obj=new Contact();
   	 ArrayList<Contact> temp=new ArrayList<Contact>();
   	 Scanner sc=new Scanner(System.in);
   	 for(Contact obj1:addressBook)
   	 {
   		 if((obj1.getFirstName().equalsIgnoreCase(firstName)) && (obj1.getLastName().equalsIgnoreCase(lastName)))
   		 {
   			 System.out.println("Enter the city:");
   			 obj1.setCity(sc.nextLine());
   			 System.out.println("Enter the State:");
   			 obj1.setState(sc.nextLine());
   			 System.out.println("Enter the zip:");
   			 obj1.setZip(sc.nextLong());
   			 System.out.println("Enter the ph no:");
   			 obj1.setPhoneNumber(sc.nextLong());
   			 sc.nextLine();
   			 System.out.println("Enter the email id:");
   			 obj1.setEmailId(sc.nextLine());
   			 obj=obj1;
   			 temp.add(obj);
   			 System.out.println("successfully edited");
   		 }
   		 else {
   			 System.out.println("No contact found");
   		 }
   	 }
    }
	public void addContact(Contact obj) {
           addressBook.add(obj);		
	}
}
