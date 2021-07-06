package org.zerock.boot01.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		String[] fruits = {"사과","바나나","메론", "수박", "당근"};
	return Arrays.toString(fruits);
	}
	
	
	@GetMapping("/fruit")
	public String[] fruit() {
		String[] fruits1 = {"사과","바나나","메론", "수박", "당근"};
		return fruits1;
//	return new String[] {"Hello", "World"}; 
	}
	
	
	@GetMapping("/array")
	public String[] array() {
		String[] fruits = {"사과","바나나","메론", "수박", "당근","포도"};
		fruit().getClass();
		return fruits;
		
	}
}
