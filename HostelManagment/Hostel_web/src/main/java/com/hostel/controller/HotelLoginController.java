package com.hostel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostelModel.Login;

import loginservices.LoginServices;


@Controller
public class HotelLoginController {

	@Autowired
    private LoginServices loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);
		return "login";
	}
	@RequestMapping(value = "/loginSubmmit", method = RequestMethod.POST)
	public String loginSubmmit(@ModelAttribute("Login") Login login, BindingResult result) {

	List list=loginService.findByUserNameAndEmailId(login);
        if(!list.isEmpty())
        	return "redirect:/Deshboard.do";
        else
		return "login";
	}

	@RequestMapping(value = "/Deshboard", method = RequestMethod.GET)
	public String deshboard(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		/*System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);*/
		return "Deshboard";
	}
	
	
}
