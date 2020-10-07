package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	public static void main(String args[]) {
		System.out.println("Welcome to Address Book program");
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressBook = new ArrayList<Address>();
		int k = 0;
		Address address;
		while (k != 3) {
			System.out.println("1.Create AddressBook\n2.AddressBook Details\n3.Exit");
			int z = sc.nextInt();
			if (z == 1) {
				System.out.println("Enter the address book name ");
				String bookname = sc.next();
			    address = new Address();
				address.addressBookName = bookname;
				addressBook.add(address);
			}

			if (z == 2) {
				System.out.println("Enter the address book name to be accessed");
				String adbookname = sc.next();
				for (int j = 0; j < addressBook.size(); j++) {
					if (addressBook.get(j).addressBookName.equalsIgnoreCase(adbookname)) {
						int x = 0;
						while (x != 5) {
							System.out.println("1.Add contact");
							System.out.println("2.Edit contact by name");
							System.out.println("3.View details by name");
							System.out.println("4.Delete contact");
							System.out.println("5.Exit");
							x = sc.nextInt();
							if (x == 1) {
								Contact obj = new Contact();
								obj.addContact();
								addressBook.get(j).arraylist.add(obj);
							}

							if (x == 2) {
								System.out.println("Enter First Name");
								String fname = sc.next();
								System.out.println("Enter Last Name");
								String lname = sc.next();
								int i = 0;
								for (i = 0; i < addressBook.get(j).arraylist.size(); i++) {
									if (addressBook.get(j).arraylist.get(i).firstName.equalsIgnoreCase(fname)
											&& addressBook.get(j).arraylist.get(i).lastName.equalsIgnoreCase(lname)) {
										addressBook.get(j).arraylist.get(i).editContact();
									} else
										System.out.println("Contact Not Found");
								}
							}

							if (x == 3) {
								System.out.println("Enter First Name");
								String fname = sc.next();
								System.out.println("Enter Last Name");
								String lname = sc.next();
								int i = 0;
								for (i = 0; i < addressBook.get(i).arraylist.size(); i++) {
									if (addressBook.get(j).arraylist.get(i).firstName.equalsIgnoreCase(fname)
											&& addressBook.get(j).arraylist.get(i).lastName.equalsIgnoreCase(lname)) {
										addressBook.get(j).arraylist.get(i).viewContact();
									} else
										System.out.println("Contact Not Found");
								}

							}

							if (x == 4) {
								System.out.println("Enter First Name");
								String fname = sc.next();
								System.out.println("Enter Last Name");
								String lname = sc.next();
								for (int i = 0; i < addressBook.get(j).arraylist.size(); i++) {
									if (addressBook.get(j).arraylist.get(i).firstName.equalsIgnoreCase(fname)
											&& addressBook.get(j).arraylist.get(i).lastName.equalsIgnoreCase(lname)) {
										addressBook.get(j).arraylist.remove(i);
										System.out.println("Contact Deleted Successfully");
									} else
										System.out.println("Contact Not Found");
								}
							}

						}
					} 
					else {
						System.out.println("Address Book does not exists");
					}
				}
			}
		}
	}
}

class Address {
	String addressBookName;
	ArrayList<Contact> arraylist = new ArrayList<Contact>();

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
		System.out.println("Phonenumber :" + this.phno);
		System.out.println("EmailId :" + this.emailId);
	}
}
