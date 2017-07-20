package com.hostelModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADMIN_LOGIN")
public class AdminLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	@Column(name="Eamil_Id")
	private String emailId;
	@Column(name="Passwords")
	private String passwords;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	
	

}
