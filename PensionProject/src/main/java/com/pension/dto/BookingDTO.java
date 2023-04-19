package com.pension.dto;

import org.apache.ibatis.type.Alias;

@Alias("kor_booking")
public class BookingDTO {
	
	private int bookingNo ;
	private String bookingId;
	private String bookingTel;
	private String checkIn;
	private String checkOut;
	private String roomType;
	private int numGuest;
	private int cost;
	private String bookingDate;
	private String bookingEmail ;
	
	public BookingDTO() {	}

	public BookingDTO(int bookingNo, String bookingId, String bookingTel, String checkIn, String checkOut,
			String roomType, int numGuest, int cost, String bookingDate, String bookingEmail) {
		super();
		this.bookingNo = bookingNo;
		this.bookingId = bookingId;
		this.bookingTel = bookingTel;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.roomType = roomType;
		this.numGuest = numGuest;
		this.cost = cost;
		this.bookingDate = bookingDate;
		this.bookingEmail = bookingEmail;
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingTel() {
		return bookingTel;
	}

	public void setBookingTel(String bookingTel) {
		this.bookingTel = bookingTel;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNumGuest() {
		return numGuest;
	}

	public void setNumGuest(int numGuest) {
		this.numGuest = numGuest;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingEmail() {
		return bookingEmail;
	}

	public void setBookingEmail(String bookingEmail) {
		this.bookingEmail = bookingEmail;
	}

	@Override
	public String toString() {
		return "BookingDTO [bookingNo=" + bookingNo + ", bookingId=" + bookingId + ", bookingTel=" + bookingTel
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", roomType=" + roomType + ", numGuest="
				+ numGuest + ", cost=" + cost + ", bookingDate=" + bookingDate + ", bookingEmail=" + bookingEmail + "]";
	}
	
	
	
	
	

}
