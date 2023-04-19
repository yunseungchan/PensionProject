package com.pension.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pension.dto.UserDTO;
import com.pension.service.UserService;

@Controller
public class UserController {
	
	private UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String main(){
		return "/main/main";
	}
	@RequestMapping("/menu")
	public String menu() {
		return "main/menu";
	}
	@RequestMapping("/loginPage")
	public String login() {
		return "/user/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String id, String pass,HttpServletRequest request, RedirectAttributes rttr) {
		
		HttpSession session = request.getSession();
		UserDTO dto = service.login(id, pass);
		
		if(dto != null) {
			session.setAttribute("dto", dto);
			rttr.addFlashAttribute("name", dto.getName() );	
			//rttr.addFlashAttribute("dto",session.getAttribute("dto"));	
				// 객체값을 넘겨줌 , 그럼 타임리프에서도 name 이아니라 dto 객체 받아서 그안에 있는 name 값 빼는걸로 바꿔줘야됨
//		System.out.println(session.getAttribute("dto"));
			return "redirect:/menu";
		}else
			return "redirect:/";
	}
	@GetMapping(value = "/mypage")
	public String mypage(HttpServletRequest request) {
		
		
		HttpSession session = request.getSession();
		UserDTO dto = (UserDTO)session.getAttribute("dto");
				
		return "user/mypage";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		return "/user/signup";
	}
	
	
	@RequestMapping("/signupSuccess")
	public String signupSuccess(UserDTO dto) {
		LocalDateTime createDate = LocalDateTime.now();
		System.out.println(dto.toString());
		int result = service.insertMemberInfo(dto); // 결과를 받는 변수 = 받은 정보(service.insertMember(dto))를 서비스로 넘겨줌
		return "/user/login";
		
	}
	
	
	
	

}
