package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/hello")
	public String hii()
	{
		return "new rest Api Created";
		
	}

}
