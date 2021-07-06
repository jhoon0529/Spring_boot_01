package org.zerock.boot01.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@RestController :  view 가 아닌 객체를 Return 이 가능하다.
public class SampleController {
	
	@GetMapping("/")
	public String home() {
		String springBoot = "Hello Spring Boot!!!";
		return springBoot;
	}

	@GetMapping("/hello")
	public String hello() { //리턴값 String
		String[] fruits = {"사과","바나나","메론", "수박", "당근"};
	return Arrays.toString(fruits);
	} //[사과, 바나나, 메론, 수박, 당근]
	
	@GetMapping("/fruit")
	public String[] fruit() { //리턴값 배열[]
		String[] fruits1 = {"사과","바나나","메론", "수박", "당근"};
		return fruits1;
	}//["사과","바나나","메론","수박","당근"]
	
	
}
