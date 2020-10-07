package com.addressbooksystem;

import java.util.ArrayList;

public class AddressBook {
	public static void main(String args[]) {
		System.out.println("Welcome to Address Book program");
        System.out.println("Contact created");
	}

	class Contact {
		private String firstName;
		private String lastName;
		private String city;
		private String state;
		private long zip;
		private long phoneNumber;
		private String emailId;
		ArrayList<Contact> c = new ArrayList<Contact>();

		public Contact(String firstName, String lastName, String city, String state, long zip, long phoneNumber,
				String emailId) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNumber = phoneNumber;
			this.emailId = emailId;
		}

	}
}