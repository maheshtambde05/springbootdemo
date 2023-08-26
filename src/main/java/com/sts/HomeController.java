package com.sts;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HomeController {

	@GetMapping({"/","/home","status"})
	public String GetStatus()
	{
		
		return "Application is and running ";
	}
}
