package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static void main(String args[])
	{
		ArrayList <Contact> arraylist=new ArrayList<Contact>();
		Scanner sc=new Scanner(System.in);
		int a=0;
		while(a==0)
		{
			System.out.println("1.Add a contact\n2.Edit a contact\n3.View Details\n4.Exit");
			int x=sc.nextInt();
			if(x==1)
			{
				Contact obj=new Contact();
				obj.addContact();
				arraylist.add(obj);
				
			}
			if(x==2)
			{
				System.out.println("Enter First Name");
				String fname=sc.next();
				System.out.println("Enter Last Name");
				String lname=sc.next();	
				int i=0;
				for(i=0;i<arraylist.size();i++)
				{
					if(arraylist.get(i).firstName.equalsIgnoreCase(fname) && arraylist.get(i).lastName.equalsIgnoreCase(lname))
					{
						arraylist.get(i).editContact();
						//break;
					}else {
						System.out.println("Contact not found");
				  }
				 }
				}
				/*if(k==0)
				{
					System.out.println("******No Contact found******");
				}
				else
				{
					c.get(i).editContact();
				}
			}*/
			
			if(x==3)
			{
				System.out.println("Enter First Name");
				String fname=sc.next();
				System.out.println("Enter Last Name");
				String lname=sc.next();	
				int k=0,i=0;
				for(i=0;i<arraylist.size();i++)
				{
					if(arraylist.get(i).firstName.equalsIgnoreCase(fname) && arraylist.get(i).lastName.equalsIgnoreCase(lname))
					{
						k=1;
						break;
					}
				}
				if(k==0)
				{
					System.out.println("No Contact found");
				}
				else
				{
					arraylist.get(i).viewContact();
				}		
			}
		}
	}
}
	class Contact {
		Scanner sc=new Scanner(System.in);
		String firstName,lastName,address,city,state,zip,phno,emailId;
		public void addContact()
		{

			System.out.println("Enter First Name");
			this.firstName=sc.next();
			System.out.println("Enter Last Name");
			this.lastName=sc.next();
			System.out.println("Enter Address");
			this.address=sc.next();
			System.out.println("Enter city");
			this.city=sc.next();
			System.out.println("Enter state");
			this.state=sc.next();
			System.out.println("Enter zip code");
			this.zip=sc.next();
			System.out.println("Enter phone number");
			this.phno=sc.next();
			System.out.println("Enter email");
			this.emailId=sc.next();
		}
		public void editContact()
		{
			System.out.println("Enter Address");
			this.address=sc.next();
			System.out.println("Enter city");
			this.city=sc.next();
			System.out.println("Enter state");
			this.state=sc.next();
			System.out.println("Enter zip code");
			this.zip=sc.next();
			System.out.println("Enter phone number");
			this.phno=sc.next();
			System.out.println("Enter email");
			this.emailId=sc.next();	
		}
		public String toString() {
			String pattern = (firstName + " " + lastName + " " + city + " " + state + " " + " " + zip + " " + phno + " "
					+ emailId + " ");
			return pattern;
		}
		public void viewContact()
		{
			System.out.println("ADDRESS = "+this.address);
			System.out.println("CITY = "+this.city);	
			System.out.println("STATE = "+this.state);	
			System.out.println("ZIP = "+this.zip);	
			System.out.println("PHONE NUMBER ="+this.phno);	
			System.out.println("EMAIL ="+this.emailId);	
		}
	}
		