package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	private ArrayList<Contact> addressBook = new ArrayList<Contact>();

	public void setAddressBook(ArrayList<Contact> obj) {
		addressBook = obj;
	}

	public ArrayList<Contact> getAddressBook() {
		return addressBook;
	}

	public boolean deleteByName(String firstName, String lastName) {
		boolean f = false;
		for (Contact obj2 : addressBook) {
			if ((obj2.getFirstName().equalsIgnoreCase(firstName)) && (obj2.getLastName().equalsIgnoreCase(lastName))) {
				f = true;
				addressBook.remove(obj2);
				System.out.println("successfully deleted");
				break;
			} else {
				System.out.println("No contact found");
			}
		}
		return f;
	}

	public void addContact(Contact obj) {
		addressBook.add(obj);
	}
}
