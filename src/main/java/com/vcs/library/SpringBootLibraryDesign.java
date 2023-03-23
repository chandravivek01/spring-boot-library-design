package com.vcs.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vcs.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesign implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesign.class, args);
		System.out.println("HelloWorld !!");
		System.out.println("Devtools !!");

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Command Line Runner ... ");
//		GreatLearning greatLearning = new GreatLearning("fullStack", "vivek");
//		System.out.println(greatLearning);
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("fullStack");
		greatLearning.setStudentName("vivek");
		System.out.println(greatLearning);
		
	}

}
