package com.cluster.webapp.SpringBootWebApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cluster.webapp.SpringBootWebApp.Business.ContactBusiness;
import com.cluster.webapp.SpringBootWebApp.DomainModel.ContactModel;

@Controller
public class ApplicationController {
	
	@RequestMapping("/test")
	public String test()
	{
		System.out.println("Appcontroller-> +welcome()");
		return "index";
	}
	
	
	@RequestMapping("/testjsp")
	public String testjsp()
	{
		System.out.println("Appcontroller-> +welcome()");
		return "test";
	}
	
	@RequestMapping("/list-contacts")
	public String listofContacts(Model model) {
		
		ContactBusiness business = new ContactBusiness();
		
		List<ContactModel> contactlist =business.getContactList();
	
		model.addAttribute("contacts", contactlist);
		
		return "ContactList";
	}
	
	

}
