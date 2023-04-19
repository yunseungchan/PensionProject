package com.pension.service;

import org.springframework.stereotype.Service;

import com.pension.mapper.BookingMapper;

@Service
public class BookingService {
	private BookingMapper mapper;
	
	public BookingService(BookingMapper mapper) {
		this.mapper = mapper;
	}

}
