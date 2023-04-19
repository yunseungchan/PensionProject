package com.pension.service;

import org.springframework.stereotype.Service;

import com.pension.mapper.MainMapper;

@Service
public class MainService {
	private MainMapper mapper;
	
	public MainService(MainMapper mapper) {
		this.mapper = mapper;
	}

}
