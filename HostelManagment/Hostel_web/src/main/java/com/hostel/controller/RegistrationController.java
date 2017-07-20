package com.hostel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostelModel.Login;

import loginservices.RegistrationServices;


@Controller
public class RegistrationController {
	
	
	@Autowired
private RegistrationServices registrationService; 

	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public String registration(ModelMap map) {
		// seHttpSession.invalidate();
		System.out.println("registation  controller");
		Login login = new Login();
		map.put("Registration", login);
		return "Registration";
	}

	@RequestMapping(value = "/registrationSubmmit", method = RequestMethod.POST)
	public String RegistrationSubmmit(@ModelAttribute("Registration") Login login, BindingResult result) {
		        
		System.out.println("asdfghjkl");
		       if(registrationService.saveRegistrationform(login)==1)
		       {
		    	   return "redirect:/login.do";
		       }
		       else
		    	   return "Registration";
		        
	
	}

}
