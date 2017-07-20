package com.hosteladminWeb.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostelModel.AdminLogin;

import adminService.AdminLoginService;


@Controller
public class AdminController {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login  controller");
		AdminLogin adminLogin = new AdminLogin();
		map.put("adminLogin", adminLogin);
		return "login";
	}

	@RequestMapping(value = "/loginSubmmit", method = RequestMethod.POST)
	public String loginSubmmit(@ModelAttribute("adminLogin") AdminLogin login , ModelMap model ,HttpSession httpSession,HttpServletRequest request ) {
		// seHttpSession.invalidate();
		       List list= adminLoginService.findAdmin(login);
		       if(!list.isEmpty()){
		    	   httpSession = request.getSession();
				httpSession.setAttribute("USER", login);
		
		return "redirect:/adminBoard.do";
		       }
		       else
		       {
		    	   return "login";
		       }
	}
	@RequestMapping("/logout")
	public String showLogout(Map<String, Object> map, Model model, HttpServletRequest request,
			HttpServletResponse httpResponse) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/login.do";

}
	@RequestMapping(value="/error",method = RequestMethod.GET)
	public String inerror(){
		System.out.println("in the error");
		return"error";
		
	}
}
