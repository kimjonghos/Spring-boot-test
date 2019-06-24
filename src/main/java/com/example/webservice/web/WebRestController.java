package com.example.webservice.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.domain.PostsRepository;
import com.example.webservice.dto.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

	private PostsRepository postsRepository;
	@RequestMapping("/")
	public String normal() {
		return "My Name is jong";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
		postsRepository.save(dto.toEntity());
	}
}
