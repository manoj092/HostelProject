package com.hostel.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class FindByCatagoryId {
  
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List findCatagory() {
		// TODO Auto-generated method stub
		return hibernateTemplate.find("from HostelInfo");
	}

	public List boyFind() {
		String boys="boys";
		// TODO Auto-generated method stub
		return hibernateTemplate.find("from HostelInfo where hostelCatagory=?" ,boys);
	}

	public List findGirls() {
		String girls="girls"; 
		return hibernateTemplate.find("from HostelInfo where hostelCatagory=?" ,girls);
	}

	
	
	
}
