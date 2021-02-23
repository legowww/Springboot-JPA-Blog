package com.park.blog2.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Blgocontrollertest {
	
	
	@GetMapping("/tes/qw")
	public String hi() {
		return "<h1>hi hy</h1>";

	}

}
