package com.ammacollege.details.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ammacollege.details.service.AmmaCollegeService;


@RestController
public class CollegeController {

	@Autowired
	AmmaCollegeService collegeService;
	
	@GetMapping(value="/welcome")
	public String getWelcomeMessage() {
		collegeService.getCourseDetails();
		return "Welcome to Amma College";
	}
	

}