package com.vcs.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController; 
import com.vcs.library.model.GreatLearning;

@RestController
public class ExampleController {
	
	@GetMapping("/info")
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("AWSCloud");
		greatLearning.setStudentName("vcs");
		return greatLearning;
	}
	
	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName , String studentName) {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setStudentName(studentName);
		System.out.println(greatLearning);
		return greatLearning;
	}
	

}
