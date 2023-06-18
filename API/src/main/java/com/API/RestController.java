package com.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/API")
public class RestController {
	
	@GetMapping("Hello")
	public String Hello() {
		return "Hello World!";
	}

	
	

}
