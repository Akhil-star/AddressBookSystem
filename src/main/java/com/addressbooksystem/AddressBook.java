package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static void main(String args[]) {
		ArrayList<Contact> arraylist = new ArrayList<Contact>();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a == 0) {
			System.out.println("1.Add a contact\n2.Edit a contact\n3.View Details\n4.Exit");
			int x = sc.nextInt();
			if (x == 1) {
				Contact obj = new Contact();
				obj.addContact();
				arraylist.add(obj);
			}
			if (x == 2) {
				System.out.println("Enter First Name");
				String fname = sc.next();
				System.out.println("Enter Last Name");
				String lname = sc.next();
				int i = 0;
				for (i = 0; i < arraylist.size(); i++) {
					if (arraylist.get(i).firstName.equalsIgnoreCase(fname)
							&& arraylist.get(i).lastName.equalsIgnoreCase(lname)) {
						arraylist.get(i).editContact();
					} else {
						System.out.println("Contact not found");
					}
				}
			}

			if (x == 3) {
				System.out.println("Enter First Name");
				String fname = sc.next();
				System.out.println("Enter Last Name");
				String lname = sc.next();
				int i = 0;
				for (i = 0; i < arraylist.size(); i++) {
					if (arraylist.get(i).firstName.equalsIgnoreCase(fname)
							&& arraylist.get(i).lastName.equalsIgnoreCase(lname)) {
						arraylist.get(i).viewContact();
					} else {
						System.out.println("Contact Not Found");
					}
				}
			}
		}
	}
}

class Contact {
	Scanner sc = new Scanner(System.in);
	String firstName, lastName, address, city, state, zip, phno, emailId;

	public void addContact() {

		System.out.println("Enter First Name");
		this.firstName = sc.next();
		System.out.println("Enter Last Name");
		this.lastName = sc.next();
		System.out.println("Enter Address");
		this.address = sc.next();
		System.out.println("Enter city");
		this.city = sc.next();
		System.out.println("Enter state");
		this.state = sc.next();
		System.out.println("Enter zip code");
		this.zip = sc.next();
		System.out.println("Enter phone number");
		this.phno = sc.next();
		System.out.println("Enter email");
		this.emailId = sc.next();
	}

	public void editContact() {
		System.out.println("Enter Address");
		this.address = sc.next();
		System.out.println("Enter city");
		this.city = sc.next();
		System.out.println("Enter state");
		this.state = sc.next();
		System.out.println("Enter zip code");
		this.zip = sc.next();
		System.out.println("Enter phone number");
		this.phno = sc.next();
		System.out.println("Enter email");
		this.emailId = sc.next();
	}

	public String toString() {
		String pattern = (firstName + " " + lastName + " " + city + " " + state + " " + " " + zip + " " + phno + " "
				+ emailId + " ");
		return pattern;
	}

	public void viewContact() {
		System.out.println("Address : " + this.address);
		System.out.println("City : " + this.city);
		System.out.println("State : " + this.state);
		System.out.println("Zip : " + this.zip);
		System.out.println("Phonenumber : " + this.phno);
		System.out.println("EmailId : " + this.emailId);
	}
}
