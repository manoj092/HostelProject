package com.hosteladminWeb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hostelModel.HostelInfo;

import adminService.AdminSave;


@Controller
public class AdminDeshboard {

	@Autowired
	private AdminSave adminSave;

	@RequestMapping(value = "/adminBoard", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login  controller");
		HostelInfo hostelInfo = new HostelInfo();
		List list = adminSave.findHostels();
		map.addAttribute("hostelInfo", hostelInfo);

		map.addAttribute("fatch", list);
		return "adminBoard";
	}

	@RequestMapping(value = "/dataInsert", method = RequestMethod.POST)
	public String insertData(@ModelAttribute("hostelInfo") HostelInfo hostelInfo,ModelMap modelMap) {
		
		Integer i = adminSave.hostelSeve(hostelInfo);
		List list11 = adminSave.findHostels();
		
		if (i >= 0)

			System.out.println("save data  controller");
		else
			System.out.println("not save data");

		modelMap.addAttribute("fatch", list11);
		return "adminBoard";
	}

	@RequestMapping(value = "/editHostel/{hostelInfoId}" ,method=RequestMethod.GET)
	public String editHostles(@PathVariable Integer hostelInfoId, ModelMap map) {
		HostelInfo hostelInfo=new HostelInfo();
		List list1 = adminSave.getHostelById(hostelInfoId);
		map.addAttribute("Lists",list1);
		map.addAttribute("hostels", hostelInfo);
		return "editHostel";

	}
	
	@RequestMapping(value = "/saveEdithostels" ,method=RequestMethod.POST)
	public String SaveEditHostles(@ModelAttribute("hostels") HostelInfo hostelInfo) {
		           adminSave.saveUpdate( hostelInfo);
		return null;

	}
	
	

	
	
}