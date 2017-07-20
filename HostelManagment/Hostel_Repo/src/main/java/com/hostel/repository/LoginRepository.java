package com.hostel.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hostelModel.Login;


@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List findByUserNameAndEmailIdR(Login login) {
		List list = hibernateTemplate.find("from Login L where L.emailId=? and L.passwords=?",
				login.getEmailId(), login.getPasswords());
		return list;

	}

}
