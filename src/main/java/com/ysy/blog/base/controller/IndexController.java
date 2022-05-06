package com.ysy.blog.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/mainPage")
	public String mainPage() {
		
		return "mainPage";
	}
	
}
