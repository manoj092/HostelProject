package com.hostelModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="HOSTEL_DETAILS")
public class HostelDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOSTEL_DETAIL_ID")
	private Integer hostelDetailId;
	@Column(name="TOTAL_ROOM")
	private Integer totalRoom;
	@Column(name="AVAILABLE_ROOM")
	private Integer availableRoom;
	@Column(name="BOOKED_ROOM")
	private Integer bookedRoom;
	@Column(name="ROOM_RATE")
	private Integer roomRate;
	@Column(name="ROOM_TYPE")
	private String  roomtype;
	public Integer getHostelDetailId() {
		return hostelDetailId;
	}
	public void setHostelDetailId(Integer hostelDetailId) {
		this.hostelDetailId = hostelDetailId;
	}
	public Integer getTotalRoom() {
		return totalRoom;
	}
	public void setTotalRoom(Integer totalRoom) {
		this.totalRoom = totalRoom;
	}
	public Integer getAvailableRoom() {
		return availableRoom;
	}
	public void setAvailableRoom(Integer availableRoom) {
		this.availableRoom = availableRoom;
	}
	public Integer getBookedRoom() {
		return bookedRoom;
	}
	public void setBookedRoom(Integer bookedRoom) {
		this.bookedRoom = bookedRoom;
	}
	public Integer getRoomRate() {
		return roomRate;
	}
	public void setRoomRate(Integer roomRate) {
		this.roomRate = roomRate;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	
	

}
