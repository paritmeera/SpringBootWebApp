package com.cluster.webapp.SpringBootWebApp.Business;

import java.util.ArrayList;
import java.util.List;

import com.cluster.webapp.SpringBootWebApp.DomainModel.ContactModel;

public class ContactBusiness {
	
	public List<ContactModel> getContactList()
	{
		List<ContactModel> listcontact = new ArrayList<ContactModel>();
		
		listcontact.add(new ContactModel(101l, "meera", "meera@gmail.com", "India"));
		listcontact.add(new ContactModel(102l, "megha", "megha@gmail.com", "India bidar"));
		listcontact.add(new ContactModel(103l, "geeta", "geeta@gmail.com", "India bangalore"));
		listcontact.add(new ContactModel(104l, "pooja", "pooja@gmail.com", "India haveri"));
		
		return listcontact;
	}

}
