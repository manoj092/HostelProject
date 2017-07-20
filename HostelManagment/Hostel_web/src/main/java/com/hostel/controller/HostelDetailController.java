package com.hostel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostelModel.HostelInfo;

import loginservices.HostelDetailService;


@Controller
public class HostelDetailController {

  @Autowired
  private HostelDetailService hostelDetailService;
	
	@RequestMapping(value = "/hostelDetails/{hostelInfoId}", method = RequestMethod.GET)
	public String allHostel( @PathVariable("hostelInfoId") Integer hostelInfoId ,ModelMap map, HttpSession seHttpSession) {
		HostelInfo listfind=hostelDetailService.findHosteldetails(hostelInfoId);
		 System.out.println(listfind.getDetails().getRoomtype());  
		  List<HostelInfo> hostelList = new ArrayList<HostelInfo>();
		  hostelList.add(listfind);
		  map.addAttribute("findlist",hostelList);
		return "hostelDetails";
	}
	
	
}
