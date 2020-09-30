package com.addressbooksystem;

import java.util.ArrayList;

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
    public void addContact(Contact contactObj)
    {
   	 addressBook.add(contactObj);
    }
		
	
}
