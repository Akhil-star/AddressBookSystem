package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static void main(String args[]) {
		ArrayList<Contact> arraylist = new ArrayList<Contact>();
		System.out.println("Welcome to Address Book program");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ADD A CONTACT 2.Exit");
		int x = sc.nextInt();
		if (x == 1) {
			Contact obj = new Contact();
			obj.addContact();
			arraylist.add(obj);
			for (Contact obj1 : arraylist) {
				System.out.println(arraylist);
			}
		}
	}
}

class Contact {
	Scanner sc = new Scanner(System.in);
	String firstName, lastName, address, city, state, zip, phno, emailId;

	public void addContact() {

		System.out.println("Enter First Name");
		firstName = sc.next();
		System.out.println("Enter Last Name");
		lastName = sc.next();
		System.out.println("Enter Address");
		address = sc.next();
		System.out.println("Enter city");
		city = sc.next();
		System.out.println("Enter state");
		state = sc.next();
		System.out.println("Enter zip code");
		zip = sc.next();
		System.out.println("Enter phone number");
		phno = sc.next();
		System.out.println("Enter email");
		emailId = sc.next();
	}

	public String toString() {
		String pattern = (firstName + " " + lastName + " " + city + " " + state + " " + " " + zip + " " + phno + " "
				+ emailId + " ");
		return pattern;
	}

}
