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
		System.out.println("2.Edit");
		System.out.println("Enter your choice");
		int n=sc.nextInt();
		if(n==2)
		{
			System.out.println("Enter the First name : ");
			String fname=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the last name :");
			String lname=sc.nextLine();
			objmain.editByName(fname, lname);
		}
    }
}
