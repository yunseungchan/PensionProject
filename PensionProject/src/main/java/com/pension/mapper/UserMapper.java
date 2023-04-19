package com.pension.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.pension.dto.UserDTO;

@Mapper
public interface UserMapper {

	UserDTO login(HashMap<String, Object> map);

	int insertMemberInfo(UserDTO dto);




}
