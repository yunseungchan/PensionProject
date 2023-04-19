package com.pension.service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pension.dto.NoticeDTO;
import com.pension.mapper.NoticeMapper;

@Service
public class NoticeService {
	private NoticeMapper mapper;
	

	public NoticeService(NoticeMapper mapper) {
		super();
		this.mapper = mapper;
	}


	public List<HashMap<String, Object>> viewNoticeList(int pageNo, String search) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("pageNo", pageNo);
		map.put("search", search);
		
		return mapper.viewNoticeList(map);
	}


	public int selectNoticeList() {
		return mapper.selectNoticeList();
	}
	
	public void updateNoticeCount(int noticeNo) {
		mapper.updateNoticeCount(noticeNo);
	}

	public NoticeDTO selectNotice(int noticeNo) {
		return mapper.selectNotice(noticeNo);
	}


}
