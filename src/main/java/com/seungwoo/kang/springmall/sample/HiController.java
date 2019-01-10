package com.seungwoo.kang.springmall.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {
	
	@RequestMapping("/hi")
	public String Hi() {
		System.out.println("Hi Spring boot!");
		return "hi"; // forward -> WEB-INF/jsp/hi.jsp
	}
	
}
