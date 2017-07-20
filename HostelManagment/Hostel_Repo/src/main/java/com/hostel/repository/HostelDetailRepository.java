package com.hostel.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hostelModel.HostelInfo;

@Repository
public class HostelDetailRepository {

	 @Autowired
	 private HibernateTemplate hibernateTemplate;
	public HostelInfo findDetail(Integer hostelInfoId) {
		// TODO Auto-generated method stub
	Session session= hibernateTemplate.getSessionFactory().openSession();
	      
	return (HostelInfo) session.load(HostelInfo.class, hostelInfoId);
	}

}
