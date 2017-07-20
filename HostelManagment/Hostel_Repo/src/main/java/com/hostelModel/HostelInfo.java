package com.hostelModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;


@Entity
@Table(name="HOSTEL_INFO")
/*@FilterDef(name = "hostelFilter", parameters = @ParamDef(name = "HOSTEL_CATAGORY", type="java.lang.string"))
@Filter(name = "hostelFilter", condition = "HOSTEL_CATAGORY = :HOSTEL_CATAGORYID")
*/
public class HostelInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOSTEL_INFO_ID")
	private Integer hostelInfoId;
	@Column(name="HOSTEL_NAME")
	private String hostelName;
	@Column(name="HOSTEL_CITY")
	private String hostelCity;
	@Column(name="HOSTEL_CATAGORY")
	private String hostelCatagory;
	
	@OneToOne(targetEntity=HostelDetails.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="HOSTEL_INFO_ID",referencedColumnName="HOSTEL_DETAIL_ID")
	private HostelDetails details;
	public Integer getHostelInfoId() {
		return hostelInfoId;
	}
	public void setHostelInfoId(Integer hostelInfoId) {
		this.hostelInfoId = hostelInfoId;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getHostelCity() {
		return hostelCity;
	}
	public void setHostelCity(String hostelCity) {
		this.hostelCity = hostelCity;
	}
	public HostelDetails getDetails() {
		return details;
	}
	public void setDetails(HostelDetails details) {
		this.details = details;
	}
	public String getHostelCatagory() {
		return hostelCatagory;
	}
	public void setHostelCatagory(String hostelCatagory) {
		this.hostelCatagory = hostelCatagory;
	}
	

}
