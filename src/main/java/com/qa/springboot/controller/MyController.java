package com.qa.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String show(){
		return "你好SpringBoot";
	}

}
