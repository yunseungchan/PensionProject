package com.pension.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pension.dto.NoticeDTO;

@Mapper
public interface NoticeMapper {
	List<HashMap<String, Object>> viewNoticeList(HashMap<String, Object> map);

	int selectNoticeList();

	int updateNoticeCount(int noticeNo);

	NoticeDTO selectNotice(int noticeNo);



}
