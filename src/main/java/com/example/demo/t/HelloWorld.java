package com.example.demo.t;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/helloworld")
	public String bienvenueSpring() {
		return "Hello World";
	}
}
