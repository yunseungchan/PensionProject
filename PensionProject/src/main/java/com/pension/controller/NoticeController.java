package com.pension.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pension.service.NoticeService;
import com.pension.vo.PaggingVO;
import com.pension.dto.NoticeDTO;

@Controller
public class NoticeController {
	private NoticeService noticeService;
	
	public NoticeController(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@RequestMapping("/notice")
	public ModelAndView notice(@RequestParam(name="pageNo",defaultValue = "1") int pageNo, 
			HttpServletRequest request, @RequestParam(name = "search", defaultValue = "") String search) {
		List<HashMap<String, Object>> list = noticeService.viewNoticeList(pageNo,search);
		
		for(HashMap<String, Object>m:list) {
			System.out.println(m.toString());
		}
		
		int count = noticeService.selectNoticeList();
		PaggingVO pagging = new PaggingVO(count, pageNo, 5);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("board/notice");
		view.addObject("list",list);
		view.addObject("pagging",pagging);
		view.addObject("search", search);
		
		return view;
	}
	
	@RequestMapping("/notice/noticeContent/{NoticeNo}")
	public ModelAndView noticeView(@PathVariable("NoticeNo") int noticeNo, HttpSession session) {
		ModelAndView view = new ModelAndView();
		view.setViewName("board/notice_view");
		
		HashSet<Integer> set = (HashSet<Integer>) session.getAttribute("history");
		if(set == null) {
			set = new HashSet<Integer>();
			session.setAttribute("history", set);
		}
		if(set.add(noticeNo)) noticeService.updateNoticeCount(noticeNo);
		
		NoticeDTO ndto = noticeService.selectNotice(noticeNo);
		
		System.out.println(ndto.toString());
		
		view.addObject("notice", ndto);
		
		return view;
	}
	@RequestMapping("/noticeWrite")
	public String noticeWrite() {
		
		return "/board/notice_write";
	}
}
