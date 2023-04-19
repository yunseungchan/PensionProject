package com.pension.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.pension.dto.UserDTO;
import com.pension.mapper.UserMapper;

@Service
public class UserService {
	
	private UserMapper mapper;
	
	public UserService(UserMapper mapper) {
		this.mapper = mapper;
	}

	public UserDTO login(String id, String pass) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id",id);
		map.put("pass", pass);
		return mapper.login(map);
	}

	public int insertMemberInfo(UserDTO dto) {
		return mapper.insertMemberInfo(dto);
	}


}
