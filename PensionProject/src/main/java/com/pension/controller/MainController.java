package com.pension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pension.service.MainService;

@Controller
public class MainController {
	private MainService mainService;
	
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}
	@RequestMapping("/caravan") //카라반
	public String caravan() {
		
		return "/caravan/caravan";
	}
	@RequestMapping("/pension")  //펜션
	public String pension() {
		
		return "/pension/pension";
	}
	
	@RequestMapping("/glamping") //글램핑
	public String glamping() {
		
		return "/glamping/glamping";
	}
	@RequestMapping("/spring") //봄
	public String spring() {
		
		return "/guide/spring";
	}
	@RequestMapping("/summer") //여름
	public String summer() {
		
		return "/guide/summer";
	}
	@RequestMapping("/autumn") //가을
	public String autumn() {
		
		return "/guide/autumn";
	}
	@RequestMapping("/winter") //겨울
	public String winter() {
		
		return "/guide/winter";
	}
	@RequestMapping("/facility_information") //시설안내
	public String facility_information() {
		return "/guide/facility_information";
	}
	@RequestMapping("/guide")   //오시는길
	public String guide() {
		return "/guide/guide";
	}
	@RequestMapping("/reservation_information") //예약안내
	public String reservation_information() {
		return "/guide/reservation_information";
	}

}
