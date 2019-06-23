package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/")
	public String normal() {
		return "My Name is jong";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
}
