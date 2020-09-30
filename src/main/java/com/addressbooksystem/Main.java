package com.addressbooksystem;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		AddressBook objmain=new AddressBook();
		System.out.println("1.Add");
		System.out.println("Enter your choice");
		int n=sc.nextInt();
		if(n==1)
		{
			Contact obj=new Contact();
			System.out.println("Add a contact");
			System.out.println("Enter the first name :");
			obj.setFirstName(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter the last name :");
            obj.setLastName(sc.nextLine());
			System.out.println("Enter the city :");
			obj.setCity(sc.nextLine());
			System.out.println("Enter the state :");
			obj.setState(sc.nextLine());
			System.out.println("Enter the zip :");
			obj.setZip(Long.parseLong(sc.nextLine()));
			System.out.println("Enter the phone no :");
			obj.setPhoneNumber(sc.nextLong());
			System.out.println("Enter the emailid :");
			obj.setEmailId(sc.nextLine());
			sc.nextLine();
			objmain.addContact(obj);
            System.out.println( "Contact addded" );
		}
    }
}
