package com.pension.controller;

import org.springframework.stereotype.Controller;

import com.pension.service.BookingService;

@Controller
public class BookingController {
	private BookingService bookingService;
	
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
}
