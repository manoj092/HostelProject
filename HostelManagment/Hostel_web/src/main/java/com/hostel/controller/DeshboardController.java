package com.hostel.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import loginservices.HostelFindByCatagory;




@Controller
public class DeshboardController {
	
	
   @Autowired
   private HostelFindByCatagory hostelFindByCatagory;
	
	@RequestMapping(value = "/hostels", method = RequestMethod.GET)
	public String allHostel(ModelMap map, HttpSession seHttpSession) {
		   List listfind=hostelFindByCatagory.findByCatagory();
		   map.addAttribute("findlist",listfind);
		return "hostels";
	}
	
	@RequestMapping(value = "/hostelsboys", method = RequestMethod.GET)
	public String boysHostel(ModelMap map, HttpSession seHttpSession) {
		    List   listboy = hostelFindByCatagory.findByBoys();
		    map.addAttribute("findlist", listboy);
		return "hostels";
	}
	
	@RequestMapping(value = "/hostelsgirls", method = RequestMethod.GET)
	public String girlsHostel(ModelMap map, HttpSession seHttpSession) {
		List listgirls=hostelFindByCatagory.findByGirls();
		map.put("findlist", listgirls);
		return "hostels";
	}

}
